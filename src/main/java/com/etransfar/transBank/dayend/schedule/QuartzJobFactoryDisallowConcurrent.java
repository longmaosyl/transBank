package com.etransfar.transBank.dayend.schedule;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.etransfar.transBank.model.ScheduleConfig;

/**
 * 若一个方法一次执行不完下次轮转时则等待该方法执行完后才执行下一次操作
 *
 */
@DisallowConcurrentExecution
public class QuartzJobFactoryDisallowConcurrent implements Job{
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ScheduleConfig scheduleJob = (ScheduleConfig) context.getMergedJobDataMap().get(QuartzInitListener.JOB_DATA_MAP_KEY);
        TaskUtils.invokMethod(scheduleJob);
    }
}
