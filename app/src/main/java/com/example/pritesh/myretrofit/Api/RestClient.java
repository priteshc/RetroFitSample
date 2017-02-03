package com.example.pritesh.myretrofit.Api;


import com.squareup.okhttp.OkHttpClient;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;


/**
 * Created by Suryakant on 13/02/15.
 */
public class RestClient {

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {

        OkHttpClient client = new OkHttpClient();
        client.setFollowRedirects(true);

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint(baseUrl);
        builder.setClient(new OkClient(client));
        builder.setRequestInterceptor(new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                //request.addHeader("Content-Type", "application/x-www-form-urlencoded");

//                        request.addHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 8_1 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12B410 Safari/600.1.4 [snv/1.1.6;snd/iPhone7,2;sno/8.1;snc/310_AT&T]");//                        request.addHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 8_1 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12B410 Safari/600.1.4 [snv/1.1.6;snd/iPhone7,2;sno/8.1;snc/310_AT&T]");//
//                request.addHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 8_1 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12B410 Safari/600.1.4 [snv/1.4;snd/iPhone7,2;sno/8.1;snc/310_AT&T]");//                        request.addHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 8_1 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12B410 Safari/600.1.4 [snv/1.1.6;snd/iPhone7,2;sno/8.1;snc/310_AT&T]");//
//                request.addHeader("User-Agent",Utility.getUserAgent("1.0.0"));
//                request.addHeader("Accept", Utility.getAccept(val));
            }
        });

        RestAdapter adapter = builder.build();

        return adapter.create(serviceClass);
    }

}
