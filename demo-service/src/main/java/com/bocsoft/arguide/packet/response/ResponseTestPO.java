package com.bocsoft.arguide.packet.response;

import java.io.Serializable;

/**
 * @Title ResponseTestPO
 * @Description 返回报文testPO
 * @author chengtc
 * @date 2020年07月15日09:01:58
 */
public class ResponseTestPO implements Serializable {
    private static final long serialVersionUID = 7812190335654725236L;

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
