package com.ruicai.teaching.dao;

import com.ruicai.teaching.entity.ExamQuestion;
import com.ruicai.teaching.entity.ExamQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int countByExample(ExamQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int deleteByExample(ExamQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int insert(ExamQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int insertSelective(ExamQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    List<ExamQuestion> selectByExample(ExamQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    ExamQuestion selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ExamQuestion record, @Param("example") ExamQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ExamQuestion record, @Param("example") ExamQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ExamQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_question
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ExamQuestion record);
}