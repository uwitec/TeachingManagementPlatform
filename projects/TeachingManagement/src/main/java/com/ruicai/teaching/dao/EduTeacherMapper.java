package com.ruicai.teaching.dao;

import com.ruicai.teaching.entity.EduTeacher;
import com.ruicai.teaching.entity.EduTeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduTeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int countByExample(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int deleteByExample(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int insert(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int insertSelective(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    List<EduTeacher> selectByExample(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    EduTeacher selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EduTeacher record);
}