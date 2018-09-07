package com.etransfar.transBank.dayend.schedule;


import org.quartz.SchedulerException;

import com.etransfar.transBank.model.ScheduleConfig;

import java.util.List;


public interface QuartzOperationService {

    /**
     * 获取所有计划中的任务列表
     * @param jobGroup 可传空
     * @param jobStatus 可传空
     * @return
     */
    public List<ScheduleConfig> queryAllJob(String jobGroup, Byte jobStatus);

    /**
     * 所有正在运行的job
     *
     * @return
     * @throws SchedulerException
     */

    public List<ScheduleConfig> queryRunningJob() throws SchedulerException;

    /**
     * 新增一个job（加载一个job，并持久化操作）
     * @param scheduleJob
     */
    public void addJob(ScheduleConfig scheduleJob);

    /**
     * 加载一个job，无持久化操作
     * @param job
     * @return
     */
    public boolean scheduleJob(ScheduleConfig job);

    /**
     * 暂停一个job
     *
     * @param jobId
     */
    public void pauseJob(Integer jobId);

    /**
     * 恢复一个job
     *
     * @param jobId
     */

    public void resumeJob(Integer jobId);

    /**
     * 删除一个job
     *
     * @param jobId
     */
    public void deleteJob(Integer jobId);

    /**
     * 立即执行job
     *
     * @param jobId
     */

    public void runAJobNow(Integer jobId);

    /**
     * 更新job时间表达式
     *
     * @param jobId
     * @param cronExpression
     */
    public void updateJobCron(Integer jobId, String cronExpression) throws SchedulerException ;

}
