package com.ruicai.education.po.education;

/**
 * Created by wy on 2017/4/16.
 */
public class WorkCondition {

    private String workType;
    private String teacherId;
    private String workUploadTime;
    private Integer rows;
    private Integer page;
    private Integer startNum;
    private Integer endNum;

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getEndNum() {
        return endNum;
    }

    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getWorkUploadTime() {
        return workUploadTime;
    }

    public void setWorkUploadTime(String workUploadTime) {
        this.workUploadTime = workUploadTime;
    }
}

