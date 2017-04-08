package com.ruicai.teaching.entity;

import java.util.Date;

public class EvaMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.parent_id
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.message_from
     *
     * @mbggenerated
     */
    private String messageFrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.message_to
     *
     * @mbggenerated
     */
    private String messageTo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.message_status
     *
     * @mbggenerated
     */
    private String messageStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.message_time
     *
     * @mbggenerated
     */
    private Date messageTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eva_message.message_content
     *
     * @mbggenerated
     */
    private String messageContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.id
     *
     * @return the value of eva_message.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.id
     *
     * @param id the value for eva_message.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.parent_id
     *
     * @return the value of eva_message.parent_id
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.parent_id
     *
     * @param parentId the value for eva_message.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.message_from
     *
     * @return the value of eva_message.message_from
     *
     * @mbggenerated
     */
    public String getMessageFrom() {
        return messageFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.message_from
     *
     * @param messageFrom the value for eva_message.message_from
     *
     * @mbggenerated
     */
    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom == null ? null : messageFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.message_to
     *
     * @return the value of eva_message.message_to
     *
     * @mbggenerated
     */
    public String getMessageTo() {
        return messageTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.message_to
     *
     * @param messageTo the value for eva_message.message_to
     *
     * @mbggenerated
     */
    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo == null ? null : messageTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.message_status
     *
     * @return the value of eva_message.message_status
     *
     * @mbggenerated
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.message_status
     *
     * @param messageStatus the value for eva_message.message_status
     *
     * @mbggenerated
     */
    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus == null ? null : messageStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.message_time
     *
     * @return the value of eva_message.message_time
     *
     * @mbggenerated
     */
    public Date getMessageTime() {
        return messageTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.message_time
     *
     * @param messageTime the value for eva_message.message_time
     *
     * @mbggenerated
     */
    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eva_message.message_content
     *
     * @return the value of eva_message.message_content
     *
     * @mbggenerated
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eva_message.message_content
     *
     * @param messageContent the value for eva_message.message_content
     *
     * @mbggenerated
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}