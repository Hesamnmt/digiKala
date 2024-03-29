package ir.hesam.digikala;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;


public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.VersionViewHolder> {
    Context context;
    TabLayout tabLayout ;




    ArrayList <profileMoudel>  profileMoudel= new ArrayList<>();

    public ProfileAdapter(Context context, ArrayList <profileMoudel>  profileMoudel) {
        this.context = context;

        this.profileMoudel = profileMoudel;

        Log.e("adapter", profileMoudel.toString());
    }


    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_base, parent, false);
        ProfileAdapter.VersionViewHolder viewHolder_profile = new ir.hesam.digikala.ProfileAdapter.VersionViewHolder(view);

        return viewHolder_profile;
    }

    @Override
    public void onBindViewHolder(final VersionViewHolder holder, final int position) {

        //position -> current item

       holder.profile_obj_text.setText(profileMoudel.get(position).getProfile_obj_name());
       holder.profile_obj_picture.setImageResource(profileMoudel.get(position).profile_obj_photo);



            holder.relativeLayout_myOrder.setOnClickListener(v -> {
                Intent intent = new Intent(context, OrderActivity.class);
                intent.putExtra("current",position);

                context.startActivity(intent);

            });



      /*  if (position==0){
            holder.relativeLayout_myOrder.setOnClickListener(v -> {
                Intent intent = new Intent(context, FragmentWaiting.class);
                context.startActivity(intent);
            });
        }

        else if (position==1){
            holder.relativeLayout_myOrder.setOnClickListener(v -> {
                Intent intent = new Intent(context, FragmentProcessing.class);
                context.startActivity(intent);
            });
        }

        else if (position==2){
            holder.relativeLayout_myOrder.setOnClickListener(v -> {
                Intent intent = new Intent(context, FragmentDelivered.class);
                context.startActivity(intent);
            });
        }

        else if (position==3){
            holder.relativeLayout_myOrder.setOnClickListener(v -> {
                Intent intent = new Intent(context, FragmentCancel.class);
                context.startActivity(intent);
            });
        }

        else if (position==4){
            holder.relativeLayout_myOrder.setOnClickListener(v -> {
                Intent intent = new Intent(context, FragmentReturn.class);
                context.startActivity(intent);
            });
        }*/






      /* if ((position==0)||(position==1)||(position==2)||(position==3)||(position==4)){

           holder.relativeLayout_myOrder.setOnClickListener(v -> {
               Intent intent = new Intent(context, OrderActivity.class);
               context.startActivity(intent);
           });
       }*/




    }





    @Override
    public int getItemCount() {
        return profileMoudel == null ? 0 : profileMoudel.size();
    }

    class VersionViewHolder extends RecyclerView.ViewHolder {

            ImageView profile_obj_picture ;
            TextView profile_obj_text;
            RelativeLayout relativeLayout_myOrder;



        public VersionViewHolder(View itemView) {
            super(itemView);
            profile_obj_picture = itemView.findViewById(R.id.profile_obj_iv);
            profile_obj_text = itemView.findViewById(R.id.profile_obj_tv);
            relativeLayout_myOrder = itemView.findViewById(R.id.relativeLayout_myOrder);

        }
    }


}
