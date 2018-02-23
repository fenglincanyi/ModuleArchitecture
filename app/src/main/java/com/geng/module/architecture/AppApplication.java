package com.geng.module.architecture;

import android.app.Application;

import com.geng.service.module.ServiceManager;
import com.geng.service.module.article.user.IArticle_User;
import com.geng.user.module.module.IArticle_UserImpl;


/**
 * Created by gengjiarong
 * on 2018/2/12.
 */

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initModule();
    }

    private void initModule() {
        ServiceManager.registerService(IArticle_User.class, IArticle_UserImpl.newInstance());
    }
}
