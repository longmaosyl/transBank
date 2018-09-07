package com.etransfar.transBank.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etransfar.transBank.dao.ScheduleConfigMapper;
import com.etransfar.transBank.model.ScheduleConfig;
import com.etransfar.transBank.service.QueryBankData;

@Service
public class QueryBankDataImpl implements QueryBankData {
	private Logger log = LoggerFactory.getLogger(QueryBankDataImpl.class);
	
    @Autowired
    private ScheduleConfigMapper scheduleConfigMapper;
	
	@Override
	public void accountBalance() {
    	ScheduleConfig scheduleConfig = scheduleConfigMapper.selectByPrimaryKey(1);
    	log.info("定时查询到的结果:"+scheduleConfig.toString());
	
	}

}
