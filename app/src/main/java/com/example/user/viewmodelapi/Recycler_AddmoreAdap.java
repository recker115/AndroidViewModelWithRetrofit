package com.example.user.viewmodelapi;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 9/18/2017.
 */

public class Recycler_AddmoreAdap extends RecyclerView.Adapter<Recycler_AddmoreAdap.ItemViewHolder> {

    public Context context;
    List<Datum> productModels = new ArrayList<>();
    ArrayList<ProductModel> filter;
    ArrayList<String> position_return = new ArrayList<>();
    int k = 0, l = 0;
    public boolean selectall = false;


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }




    private ArrayList<ProductModel> productModelsfilter;

    public Recycler_AddmoreAdap(Context context, List<Datum> productModels, boolean selectall)

    {


        this.context = context;
        this.productModels = productModels;

        //this.viewAddInterface = viewAddInterface;
        this.selectall = selectall;
        Log.e("Recycler_AddmoreAdap", "Recycler_AddmoreAdap" + productModels.size());
        Fresco.initialize(context);

    }


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        ItemViewHolder adapter = new ItemViewHolder(view);

        return adapter;

    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, final int position) {

        String thumbnail = (productModels.get(position).getThumbnail()).replaceAll("\\s+", "%20");
        Uri uri = Uri.parse(thumbnail);
        holder.product_image.setImageURI(uri);
        //Picasso.with(context).load(productModels.get(position).getThumbnail()).into(holder.product_image);
        Log.e("thumbnail", productModels.get(position).getThumbnail());
        holder.name.setText(productModels.get(position).getName());
        Log.e("name", productModels.get(position).getName());



    }

    private void check_is_selected(String id, CheckBox check_s) {
        /*Logger1.e("list",""+selected_product.toString());*/


    }

    @Override
    public int getItemCount() {
        return productModels.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public SimpleDraweeView product_image;
        public TextView name;
        public CheckBox checkBox;


        public ItemViewHolder(View itemView) {
            super(itemView);
            product_image = (SimpleDraweeView) itemView.findViewById(R.id.product_image3);
            name = (TextView) itemView.findViewById(R.id.product_name);

        }
    }

    public void addItems(List<Datum> borrowModelList) {
        this.productModels = borrowModelList;
        notifyDataSetChanged();
    }


}