package com.onexo.tpa.tpasys.model;

public class UserModel {
    private long userId;
    private String username;
    private String password;
    private String department;
    private String group;
    private String role;


    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public String getGroup() {
        return group;
    }

    public String getRole() {
        return role;
    }

    private  UserModel(Builder builder){
        this.userId = builder.userId;
        this.username = builder.username;
        this.password = builder.password;
        this.department = builder.department;
        this.group =  builder.group;
        this.role = builder.role;

    }

    public static class Builder {
        private long userId;
        private String username;
        private String password;
        private String department;
        private String group;
        private String role;

        public Builder setUserId(long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = group;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public UserModel build(){
          return  new UserModel(this);
        }
    }



}
