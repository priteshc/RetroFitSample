package com.example.pritesh.myretrofit.Api;

/**
 * Created by pritesh on 12/30/2016.
 */





import com.example.pritesh.myretrofit.Pojo.Login;
import com.example.pritesh.myretrofit.util.Const;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Vishnu on 2/19/2016.
 */
public class ApiLogin extends RestClient {
    private static final String TAG = ApiLogin.class.getSimpleName();

    public static void getLogin(String name, String pass, final Callback<Login>  listener) {
        ApiService apiService = createService(ApiService.class, Const.BASE_URL);
        apiService.getGetlogin( name,pass,new Callback<Login>() {
            @Override
            public void success(Login con, Response response) {
                if (listener != null) listener.success(con, response);

            }

            @Override
            public void failure(RetrofitError error) {
                if (listener != null) listener.failure(error);
            }
        });
    }
}
