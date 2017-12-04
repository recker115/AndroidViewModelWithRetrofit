package com.example.user.viewmodelapi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by User on 10/6/2017.
 */

public interface ApiInterface {





    @FormUrlEncoded
    @POST("stores/getProductByCategoryIdSearch")
    Call<MainClass> GetsubCategory(@Field("token") String token,
                                   @Field("userID") String userid,
                                   @Field("category_id") String category_id,
                                   @Field("limit") String limit,
                                   @Field("offset") String offset,
                                   @Field("search") String search);

}
