package com.geng.user.module.module;


import com.geng.service.module.article.user.IArticle_User;
import com.geng.service.module.article.user.model.Article_UserTO;
import com.geng.user.module.model.UserInfo;
import com.geng.user.module.model.UserInfoManager;

/**
 * Created by gengjiarong
 * on 2018/2/11.
 */

public class IArticle_UserImpl implements IArticle_User {

    private IArticle_UserImpl() {}

    public static IArticle_UserImpl newInstance(){
        return new IArticle_UserImpl();
    }

    @Override
    public boolean updateUserInfo(int id, String name) {
        return UserInfoManager.getInstance().setUserInfo(id, name);
    }

    @Override
    public Article_UserTO getUserInfo(int id) {
        UserInfo userInfo = UserInfoManager.getInstance().getUserInfo(id);
        return new Article_UserTO(userInfo.id, userInfo.name, userInfo.address);
    }
}
