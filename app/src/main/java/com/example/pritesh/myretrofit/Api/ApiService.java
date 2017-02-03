package com.example.pritesh.myretrofit.Api;



import com.example.pritesh.myretrofit.Pojo.Login;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;


/**
 * Created by Suryakant on 13/02/15.
 */
public interface ApiService {



    @FormUrlEncoded
    @POST("/php/magic_Joblogin.php")
    void getGetlogin(@Field("login_Name") String name, @Field("password") String pass, Callback<Login> loginCallback);



/*

    @GET("/php/magic_Qualification.php")
    void getAlldata(Callback<Qualificationpojo> qualificationpojoCallback);
*/






}