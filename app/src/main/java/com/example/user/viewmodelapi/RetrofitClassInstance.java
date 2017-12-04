package com.example.user.viewmodelapi;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 10/6/2017.
 */

public class RetrofitClassInstance {

    ApiInterface mInterface;
    public static  String Base_url="http://yeorder.com/api1/restapiv2/";
    public static RetrofitClassInstance retrofit;
    private RetrofitClassInstance()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        mInterface = retrofit.create(ApiInterface.class);
    }

    public static RetrofitClassInstance createInstance()
    {
        if (retrofit==null)
        {
            retrofit= new RetrofitClassInstance();
        }

        return retrofit;
    }
    public Call<MainClass> getStarredRepos(String token, String userId, String categoryid, String limit, String offset, String search) {
        return mInterface.GetsubCategory(token,userId,categoryid,limit,offset,search);
    }




}
