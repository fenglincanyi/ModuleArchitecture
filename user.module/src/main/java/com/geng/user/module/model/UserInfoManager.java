package com.geng.user.module.model;

/**
 * Created by gengjiarong
 * on 2018/2/11.
 */

public class UserInfoManager {

    private static volatile UserInfoManager manager;

    private UserInfo[] users = {
            new UserInfo(1, "张三", 1, "北京"),
            new UserInfo(2, "李四", 0, "天津"),
            new UserInfo(3, "张三", 1, "上海"),
    };

    private UserInfoManager(){}

    public static UserInfoManager getInstance() {
        if (manager == null) {
            synchronized (UserInfoManager.class) {
                if (manager == null) {
                    manager = new UserInfoManager();
                }
            }
        }
        return manager;
    }


    public boolean setUserInfo(long id, String name){
        for (UserInfo user : users) {
            if (user.id == id) {
                user.name = name;
                return true;
            }
        }
        return false;
    }

    public UserInfo getUserInfo(long id) {
        for (UserInfo user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }
}
