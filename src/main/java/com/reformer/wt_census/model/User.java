package com.reformer.wt_census.model;

public class User {
    private Integer u_id;//ID
    private String username;//用户名
    private String u_time;//时间

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", username='" + username + '\'' +
                ", u_time='" + u_time + '\'' +
                '}';
    }

    public User() {
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getU_time() {
        return u_time;
    }

    public void setU_time(String u_time) {
        this.u_time = u_time;
    }
}
