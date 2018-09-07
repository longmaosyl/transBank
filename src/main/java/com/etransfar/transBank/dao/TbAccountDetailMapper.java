package com.etransfar.transBank.dao;

import com.etransfar.transBank.model.TbAccountDetail;
import com.etransfar.transBank.model.TbAccountDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAccountDetailMapper {
    int countByExample(TbAccountDetailExample example);

    int deleteByExample(TbAccountDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAccountDetail record);

    int insertSelective(TbAccountDetail record);

    List<TbAccountDetail> selectByExample(TbAccountDetailExample example);

    TbAccountDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAccountDetail record, @Param("example") TbAccountDetailExample example);

    int updateByExample(@Param("record") TbAccountDetail record, @Param("example") TbAccountDetailExample example);

    int updateByPrimaryKeySelective(TbAccountDetail record);

    int updateByPrimaryKey(TbAccountDetail record);
}