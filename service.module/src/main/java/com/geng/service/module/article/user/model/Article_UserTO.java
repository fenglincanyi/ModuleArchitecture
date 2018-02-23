package com.geng.service.module.article.user.model;

import java.io.Serializable;

/**
 * Created by gengjiarong
 * on 2018/2/22.
 */

public class Article_UserTO implements Serializable {

    public long userID;
    public String userName;
    public String address;

    public Article_UserTO(long userID, String userName, String address) {
        this.userID = userID;
        this.userName = userName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Article_UserTO{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
