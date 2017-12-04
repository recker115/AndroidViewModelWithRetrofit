package com.example.user.viewmodelapi;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by User on 11/6/2017.
 */

public class ViewModelClass extends AndroidViewModel {

    String url="http://yeorder.com/api1/restapiv2/stores/getProductByCategoryIdSearch";
    RequestQueue requestQueue;
    StringRequest stringRequest;
    //ArrayList<String> strings=new ArrayList<>();
    MutableLiveData<ArrayList<ProductModel>> reponses=new MutableLiveData<>();
    ArrayList<ProductModel> productModels=new ArrayList<>();
    MutableLiveData<List<Datum>> data1=new MutableLiveData<>();
    Context context;
    String search;


        public MutableLiveData<List<Datum>> getItemAndPersonList(String search) {
        this.search=search;
        JSON();
        return data1;
    }




   /* public MutableLiveData<ArrayList<ProductModel>> getData()

    {

        requestQueue = Volley.newRequestQueue(context);
        stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

            JSONObject data;

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onResponse(String response) {
                Log.e("Response", response.toString());

                try {
                    data = new JSONObject(response);
                    JSONArray jsonArray = data.getJSONArray("data");
                    for (int i = 0; i < jsonArray.length(); i++)
                    {
                        JSONObject small = jsonArray.optJSONObject(i);
                        ProductModel productModel = new ProductModel();
                        productModel.setId(small.optString("id"));
                        productModel.setName(small.optString("name"));
                        productModel.setThumbnail((small.optString("thumbnail")).toString());
                        Log.e("thumbnail", small.optString("thumbnail"));
                        productModels.add(productModel);
                    }
                    //reponses=itemAndPersonModel().getProductModels();
                    //reponses=productModels;

                    data1.setValue(productModels);
                    reponses=data1;




                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                // params.put("customer_id","5");
                params.put("token", "Wt1U5mAcActiCOdeyy$^7kbwXMvH#U@cs0^*Qwl^l18S#e(9wh8vZxWrZoiLwD#GA#sdsd*^DHJKK74d7718ad0fb13e2f6fa0fd13761aa8f0c0eb429");
                params.put("userID", "4725");

                params.put("category_id", "1502");
                params.put("limit", "10");
                params.put("offset", "0");
                params.put("search","all");


                Log.e("Params", params.toString());

                return params;
            }
        };
        requestQueue.add(stringRequest);


        return  data1;
    }*/



   public ViewModelClass(@NonNull Application application) {
        super(application);



    }

    private void JSON()
     {
        RetrofitClassInstance.createInstance().getStarredRepos("Wt1U5mAcActiCOdeyy$^7kbwXMvH#U@cs0^*Qwl^l18S#e(9wh8vZxWrZoiLwD#GA#sdsd*^DHJKK74d7718ad0fb13e2f6fa0fd13761aa8f0c0eb429",
                "4725","1502","10","0",search)
                .enqueue(new Callback<MainClass>() {
                             @Override
                             public void onResponse(Call<MainClass> call, Response<MainClass> response) {

                                 data1.setValue((response.body().getData()));
                             }

                             @Override
                             public void onFailure(Call<MainClass> call, Throwable t) {

                             }
                         });
                        //return data1;

    }


}
