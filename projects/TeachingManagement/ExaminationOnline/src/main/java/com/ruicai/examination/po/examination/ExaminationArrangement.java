package com.ruicai.examination.po.examination;

import java.sql.Timestamp;

public class ExaminationArrangement {
    private String id;

    private String classId;

    private String teacherId;

    private String paperId;

    private String examinationStage;

    private Timestamp examinationTime;

    private String examinationAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    public String getExaminationStage() {
        return examinationStage;
    }

    public void setExaminationStage(String examinationStage) {
        this.examinationStage = examinationStage == null ? null : examinationStage.trim();
    }

    public Timestamp getExaminationTime() {
        return examinationTime;
    }

    public void setExaminationTime(Timestamp examinationTime) {
        this.examinationTime = examinationTime;
    }

    public String getExaminationAddress() {
        return examinationAddress;
    }

    public void setExaminationAddress(String examinationAddress) {
        this.examinationAddress = examinationAddress == null ? null : examinationAddress.trim();
    }

    @Override
    public String toString() {
        return "ExaminationArrangement{" +
                "id='" + id + '\'' +
                ", classId='" + classId + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", paperId='" + paperId + '\'' +
                ", examinationStage='" + examinationStage + '\'' +
                ", examinationTime=" + examinationTime +
                ", examinationAddress='" + examinationAddress + '\'' +
                '}';
    }
}