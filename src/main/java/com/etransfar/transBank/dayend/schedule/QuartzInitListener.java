package com.etransfar.transBank.dayend.schedule;



import com.etransfar.transBank.dao.ScheduleConfigMapper;
import com.etransfar.transBank.enums.ScheduleJobStatusEnums;
import com.etransfar.transBank.model.ScheduleConfig;
import com.etransfar.transBank.model.ScheduleConfigExample;
import com.etransfar.transBank.util.core.GlobEnvUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * Spring初始化完毕后加载定时
 */
@Component("quartzInitListener")
public class QuartzInitListener implements ApplicationListener<ContextRefreshedEvent>{
    private static Logger log = LoggerFactory.getLogger(QuartzInitListener.class);
    public final static String JOB_DATA_MAP_KEY = "scheduleJob";
    public final static String JOB_GROUP = GlobEnvUtil.get("quartz.group");
    @Autowired
    private ScheduleConfigMapper scheduleConfigMapper;
    @Autowired
    private QuartzOperationService quartzOperationService;

    private void init(){
        log.info("[quartzInitListener] init start");
        //获得job列表
        ScheduleConfigExample scheduleConfigExample = new ScheduleConfigExample();
        scheduleConfigExample.createCriteria().andJobGroupEqualTo(JOB_GROUP)
                .andJobStatusEqualTo(ScheduleJobStatusEnums.JOB_STATUS_RUNNING.getCode());
        List<ScheduleConfig> scheduleJobs = scheduleConfigMapper.selectByExample(scheduleConfigExample);
        if(!CollectionUtils.isEmpty(scheduleJobs)){
            log.info("[quartzInitListener] init size:" + scheduleJobs.size());
            for (ScheduleConfig job : scheduleJobs) {
                log.info("[quartzInitListener] init jobName:"+job.getJobName());
                quartzOperationService.scheduleJob(job);
            }
        }
        log.info("[quartzInitListener] init end");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent applicationEvent) {
        init();
    }
}
