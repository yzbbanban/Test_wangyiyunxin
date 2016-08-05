package com.wangban.yzbbanban.test_wangyiyunxin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.netease.nimlib.sdk.auth.AuthService;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void doLogin() {
        LoginInfo info = new LoginInfo(); // config...
        RequestCallback<LoginInfo> callback =
                new RequestCallback<LoginInfo>() {
                    // 可以在此保存LoginInfo到本地，下次启动APP做自动登录用
                };
        NIMClient.getService(AuthService.class).login(info)
                .setCallback(callback);
    }

}
