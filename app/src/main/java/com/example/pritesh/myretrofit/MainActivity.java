package com.example.pritesh.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pritesh.myretrofit.Api.ApiLogin;
import com.example.pritesh.myretrofit.Pojo.Login;
import com.example.pritesh.myretrofit.util.NetworkUtil;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (NetworkUtil.getConnectivityStatus(this.getApplicationContext()) != 0) {
            try {


                ApiLogin.getLogin("prt", "ppp", new Callback<Login>() {
                    @Override
                    public void success(Login login, Response response) {

                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                });

            } catch (Exception e) {


                e.printStackTrace();
            }


        }
    }

    public boolean checker(String s) {
        return false;
    }
}
