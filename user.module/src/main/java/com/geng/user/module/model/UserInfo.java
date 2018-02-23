package com.geng.user.module.model;

import java.io.Serializable;

/**
 * Created by gengjiarong
 * on 2018/2/11.
 */

public class UserInfo implements Serializable {

    public long id;
    public String name;
    public int sex;
    public String address;

    public UserInfo(long id, String name, int sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }
}
