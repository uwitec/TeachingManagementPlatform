package com.ruicai.evaluation.po.evaluation;

import java.util.Date;

public class Evaluation {
    private String id;

    private String studentId;

    private String teacherId;

    private Date evaluationTime;

    private String evaluationFeedback;

    private Short evaluationScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getEvaluationFeedback() {
        return evaluationFeedback;
    }

    public void setEvaluationFeedback(String evaluationFeedback) {
        this.evaluationFeedback = evaluationFeedback == null ? null : evaluationFeedback.trim();
    }

    public Short getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(Short evaluationScore) {
        this.evaluationScore = evaluationScore;
    }
}