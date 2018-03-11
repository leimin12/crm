package com.zking.crm.model;

import java.io.Serializable;

public class SysUser  implements Serializable {
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer userRoleId;

    private Integer userFlag;

    public SysUser(Integer userId, String userName, String userPassword, Integer userRoleId, Integer userFlag) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRoleId = userRoleId;
        this.userFlag = userFlag;
    }

    public SysUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }
}