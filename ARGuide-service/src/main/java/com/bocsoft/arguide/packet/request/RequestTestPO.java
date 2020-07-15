package com.bocsoft.arguide.packet.request;

import java.io.Serializable;

/**
 * @Title RequestTestPO
 * @Description 请求报文testPO
 * @author chengtc
 * @date 2020年07月15日09:01:58
 */
public class RequestTestPO implements Serializable {


    private static final long serialVersionUID = 8680303222004148231L;

    private String id;
    private String username;
    private String password;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
