package com.etransfar.transBank.dayend.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etransfar.transBank.dao.ScheduleConfigMapper;
import com.etransfar.transBank.model.ScheduleConfig;
import com.etransfar.transBank.service.QueryBankData;

/**
 * 
 * @author longmao
 *
 */
@Service
public class TestTask {
	private Logger log = LoggerFactory.getLogger(TestTask.class);
	@Autowired
	private QueryBankData queryBankData;


    public void execute() {
    	
    	log.info("定时任务开始=============");
    	
    	queryBankData.accountBalance();

    	log.info("定时任务结束=============");
    }
}
