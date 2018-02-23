package com.geng.module.architecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.app_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_article_module();
            }
        });
    }


    public void go_article_module() {
        startActivity(new Intent(this, com.geng.article.module.MainActivity.class));
    }
}
