package com.geng.service.module.article.user;

import com.geng.service.module.article.user.model.Article_UserTO;

/**
 * Created by gengjiarong
 * on 2018/2/11.
 * 调用方_提供方
 */

public interface IArticle_User {

    boolean updateUserInfo(int id, String name);

    Article_UserTO getUserInfo(int id);
}