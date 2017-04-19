package com.ruicai.education.server.impl;

import com.ruicai.education.mapper.education.EducationClassMapper;
import com.ruicai.education.po.education.EducationClass;
import com.ruicai.education.po.education.SystemDictionary;
import com.ruicai.education.server.ClassServer;
import com.ruicai.education.server.DictionaryServer;
import com.ruicai.education.util.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wy on 2017/4/16.
 */
@Service
public class ClassServerImpl implements ClassServer {

    @Autowired
    private EducationClassMapper educationClassMapper;

    @Autowired
    private DictionaryServer dictionaryServer;

    /**
     * 根据班级的类别来查询班级
     *
     * @param type 班级类型
     * @return 符合条件的班级
     */
    @Override
    public List<EducationClass> getClassByType(String type) {
        return educationClassMapper.selectClassByType(type);
    }

    @Override
    public List<TreeBean> getClassTree(List<TreeBean> info) {
        List<SystemDictionary> dictionaryList = dictionaryServer.selectDicByName("class-type");
        for (SystemDictionary dic : dictionaryList) {
            TreeBean treeBean = new TreeBean();
            treeBean.setId(dic.getId());
            treeBean.setText(dic.getDictionaryName());
            List<TreeBean.Child> chilren = new ArrayList<>();
            //根据班级类别查出的班级列表
            List<EducationClass> classInfo = getClassByType(dic.getId());
            for (EducationClass eduClass : classInfo) {
                TreeBean.Child child = new TreeBean().new Child();
                child.setId(eduClass.getId());
                child.setText(eduClass.getClassName());
                chilren.add(child);
            }
            treeBean.setChildren(chilren);
            info.add(treeBean);
        }
        return info;
    }

}
