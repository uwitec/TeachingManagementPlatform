package com.ruicai.teaching.entity;

public class SysRole2resKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role2res.role_id
     *
     * @mbggenerated
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role2res.res_id
     *
     * @mbggenerated
     */
    private String resId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role2res.role_id
     *
     * @return the value of sys_role2res.role_id
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role2res.role_id
     *
     * @param roleId the value for sys_role2res.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role2res.res_id
     *
     * @return the value of sys_role2res.res_id
     *
     * @mbggenerated
     */
    public String getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role2res.res_id
     *
     * @param resId the value for sys_role2res.res_id
     *
     * @mbggenerated
     */
    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }
}