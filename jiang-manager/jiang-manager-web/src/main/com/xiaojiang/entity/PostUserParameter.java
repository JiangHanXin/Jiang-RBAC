package com.xiaojiang.entity;

/**
 * @创建人:小江
 * @创建时间:2019/2/26 0026
 * @描述:登录用户表单封装类
 */
public class PostUserParameter {

    private int id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "PostUserParameter{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
