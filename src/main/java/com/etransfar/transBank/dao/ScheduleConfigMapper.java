package com.etransfar.transBank.dao;

import com.etransfar.transBank.model.ScheduleConfig;
import com.etransfar.transBank.model.ScheduleConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleConfigMapper {
    int countByExample(ScheduleConfigExample example);

    int deleteByExample(ScheduleConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleConfig record);

    int insertSelective(ScheduleConfig record);

    List<ScheduleConfig> selectByExample(ScheduleConfigExample example);

    ScheduleConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScheduleConfig record, @Param("example") ScheduleConfigExample example);

    int updateByExample(@Param("record") ScheduleConfig record, @Param("example") ScheduleConfigExample example);

    int updateByPrimaryKeySelective(ScheduleConfig record);

    int updateByPrimaryKey(ScheduleConfig record);
}