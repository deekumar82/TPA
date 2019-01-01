package com.onexo.tpa.tpasys.dao.model;

import javax.persistence.*;

@Entity
@Table(name = "tblUserDetails")
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="m_lUserId")
    private long userId;
    @Column(name="m_sUsername")
    private String username;
    @Column(name="m_sPassword")
    private String password;
    @Column(name="m_lDepartment")
    private Integer department;
    @Column(name="m_lGroup")
    private Integer group;
    @Column(name="m_lRole")
    private Integer role;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
