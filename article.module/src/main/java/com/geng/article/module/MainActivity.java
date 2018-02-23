package com.geng.article.module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.geng.service.module.ServiceManager;
import com.geng.service.module.article.user.IArticle_User;
import com.geng.service.module.article.user.model.Article_UserTO;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aritcle_activity_main);
        System.out.println("id: "+R.layout.aritcle_activity_main);


        findViewById(R.id.article_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                article_call_user();
            }
        });
    }

    public void article_call_user() {
        IArticle_User articleUserService = ServiceManager.getServiceObj(IArticle_User.class);
        if (articleUserService != null) {
            Article_UserTO userTO = articleUserService.getUserInfo(1);
            Toast.makeText(this, "调用成功：" + userTO.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
