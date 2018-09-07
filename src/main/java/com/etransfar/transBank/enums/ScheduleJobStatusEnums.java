package com.etransfar.transBank.enums;

/**
 *
 */
public enum ScheduleJobStatusEnums {

    JOB_STATUS_STOP((byte)1,"任务状态：停止"),
    JOB_STATUS_RUNNING((byte)2,"任务状态：启动"),
   
    JOB_CONCURRENT_YES((byte)1,"允许并发"),
    JOB_CONCURRENT_NO((byte)0,"不允许并发"),
    
    JOB_DELETE_YES((byte)1,"已删除"),
    JOB_DELETE_NO((byte)0,"未删除"),
    
    ;

    private Byte code;

    private String description;


    ScheduleJobStatusEnums(Byte code, String description){
        this.setCode(code);
        this.setDescription(description);
    }


    public Byte getCode() {
        return code;
    }


    public void setCode(Byte code) {
        this.code = code;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

}
