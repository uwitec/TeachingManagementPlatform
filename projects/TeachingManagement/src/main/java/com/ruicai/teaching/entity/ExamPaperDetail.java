package com.ruicai.teaching.entity;

public class ExamPaperDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper_detail.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper_detail.paper_id
     *
     * @mbggenerated
     */
    private String paperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_paper_detail.question_id
     *
     * @mbggenerated
     */
    private String questionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper_detail.id
     *
     * @return the value of exam_paper_detail.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper_detail.id
     *
     * @param id the value for exam_paper_detail.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper_detail.paper_id
     *
     * @return the value of exam_paper_detail.paper_id
     *
     * @mbggenerated
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper_detail.paper_id
     *
     * @param paperId the value for exam_paper_detail.paper_id
     *
     * @mbggenerated
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_paper_detail.question_id
     *
     * @return the value of exam_paper_detail.question_id
     *
     * @mbggenerated
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_paper_detail.question_id
     *
     * @param questionId the value for exam_paper_detail.question_id
     *
     * @mbggenerated
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }
}