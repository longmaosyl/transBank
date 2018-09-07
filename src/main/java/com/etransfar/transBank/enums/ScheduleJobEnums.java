package com.etransfar.transBank.enums;

/**
 *
 */
public enum ScheduleJobEnums {

    JOB_GROUP_SCHEDULE("SCHEDULE","组别：SCHEDULE"),
    
    ;

    private String code;

    private String description;


    ScheduleJobEnums(String code, String description){
        this.setCode(code);
        this.setDescription(description);
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

}
