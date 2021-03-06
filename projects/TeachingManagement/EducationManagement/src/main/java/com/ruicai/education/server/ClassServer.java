package com.ruicai.education.server;

import com.ruicai.education.po.education.ClassCondition;
import com.ruicai.education.po.education.EducationClass;
import com.ruicai.education.po.education.SystemDictionary;
import com.ruicai.education.util.PageBean;
import com.ruicai.education.util.TreeBean;

import java.util.List;

/**
 * Created by wy on 2017/4/16.
 */
public interface ClassServer {
    public List<EducationClass> getClassByType(String type);

    public List<TreeBean> getClassTree(List<TreeBean> info);

    public PageBean<EducationClass> selectByCondition(ClassCondition condition);

    public int selectByConditionCount(ClassCondition condition);

    public List<SystemDictionary> getClassType();

    public void saveOrUpdate(EducationClass educationClass);

    public void deleteClassByBatch(List<String> idlist);
}
