package com.ruicai.evaluation.mapper.evaluation;

import com.ruicai.evaluation.po.evaluation.EvaluationDetail;
import com.ruicai.evaluation.po.evaluation.EvaluationDetailExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluationDetailMapper {
    int countByExample(EvaluationDetailExample example);

    int deleteByExample(EvaluationDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(EvaluationDetail record);

    int insertSelective(EvaluationDetail record);

    List<EvaluationDetail> selectByExample(EvaluationDetailExample example);

    EvaluationDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EvaluationDetail record, @Param("example") EvaluationDetailExample example);

    int updateByExample(@Param("record") EvaluationDetail record, @Param("example") EvaluationDetailExample example);

    int updateByPrimaryKeySelective(EvaluationDetail record);

    int updateByPrimaryKey(EvaluationDetail record);
}