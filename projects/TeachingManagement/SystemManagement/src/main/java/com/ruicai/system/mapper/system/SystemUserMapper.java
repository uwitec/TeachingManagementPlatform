package com.ruicai.system.mapper.system;

import com.ruicai.system.po.system.SystemUser;
import com.ruicai.system.po.system.SystemUserExample;
import com.ruicai.system.po.system.UserCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemUserMapper {
    int countByExample(SystemUserExample example);

    int deleteByExample(SystemUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    List<SystemUser> selectByExample(SystemUserExample example);

    SystemUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);

    List<SystemUser> selectUserByCondition(UserCondition condition);

    int selectUserByConditionCount(UserCondition condition);
}