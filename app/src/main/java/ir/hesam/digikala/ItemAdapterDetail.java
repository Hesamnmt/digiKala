package ir.hesam.digikala;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapterDetail extends RecyclerView.Adapter<ItemAdapterDetail.VersionViewHolder> {







        private final ArrayList<detail> versionModels;
    Context context;
    Intent intent;



        private SharedPreferences sharedPref;




            ArrayList<detail> details = new ArrayList<>();


    public ItemAdapterDetail(Context context, ArrayList<detail> versionModels) {

        this.context = context;
        this.versionModels = versionModels;
        Log.e("adapter", versionModels.toString());

    }


    @Override
    public ItemAdapterDetail.VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.delivered_base_fragment, parent, false);
        return new ItemAdapterDetail.VersionViewHolder(view);


    }


    @Override
    public void onBindViewHolder(final ItemAdapterDetail.VersionViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        //position -> current item
      //  holder.photo1_detail.setImageResource(versionModels.get(position).photo);
        holder.photo1_detail.setImageResource(versionModels.get(position).photo1_detail);
        holder.photo2_detail.setImageResource(versionModels.get(position).photo2_detail);
        holder.photo3_detail.setImageResource(versionModels.get(position).photo3_detail);
        holder.name_detail.setText(versionModels.get(position).name_detail);
        holder.price_detail.setText(versionModels.get(position).price_detail);
        holder.date_order.setText(versionModels.get(position).date_order);



      //  holder.rtl_detail.setOnClickListener(v -> {


            holder.rtl_detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,DetailActivity.class);
                    intent.putExtra("name_detail",versionModels.get(position).name_detail);
                    intent.putExtra("receiver_name",versionModels.get(position).receiver_name);
                    intent.putExtra("receiver_address",versionModels.get(position).receiver_address);
                    intent.putExtra("receiver_number",versionModels.get(position).receiver_number);
                    intent.putExtra("date_order",versionModels.get(position).date_order);
                    context.startActivity(intent);
                }
            });


//            intent = new Intent(context, DetailActivity.class);
//          //  intent.putExtra("P" , "person");
//            context.startActivity(intent);

       // });


    }


    @Override
    public int getItemCount() {
        return versionModels == null ? 0 : versionModels.size();


    }

    class VersionViewHolder extends RecyclerView.ViewHolder {

        ImageView photo1_detail;
        ImageView photo2_detail;
        ImageView photo3_detail;
        TextView name_detail;
        TextView price_detail;
        RelativeLayout rtl_detail;
        TextView date_order;

        public VersionViewHolder(View itemView) {
            super(itemView);
            photo1_detail = itemView.findViewById(R.id.photo1_detail);
            photo2_detail = itemView.findViewById(R.id.photo2_detail);
            photo3_detail = itemView.findViewById(R.id.photo3_detail);
            name_detail = itemView.findViewById(R.id.name_detail);
            price_detail = itemView.findViewById(R.id.price_detail);
            rtl_detail = itemView.findViewById(R.id.rtl_detail);
            date_order = itemView.findViewById(R.id.date_order);
        }

    }

}
