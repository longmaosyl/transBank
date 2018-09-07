package com.etransfar.transBank.dayend.schedule;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.etransfar.transBank.model.ScheduleConfig;

/**
 * 无状态执行任务 （可并发）
 *
 */
public class QuartzJobFactory implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ScheduleConfig scheduleJob = (ScheduleConfig) context.getMergedJobDataMap().get(QuartzInitListener.JOB_DATA_MAP_KEY);
        TaskUtils.invokMethod(scheduleJob);
    }
}
