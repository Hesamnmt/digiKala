package ir.hesam.digikala;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;



public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.VersionViewHolder> {
    Context context;
    long finalMin;
    long finalSec;
    long millisUntilFinished;





    ArrayList<MainMoudel> versionModels = new ArrayList<>();
    public ItemAdapter(Context context,ArrayList<MainMoudel> versionModels) {
        this.context = context;

        this.versionModels = versionModels;

        Log.e("adapter",versionModels.toString());
    }

    ArrayList<shoe> shoes_iv;




    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_base, parent, false);
        VersionViewHolder viewHolder = new VersionViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final VersionViewHolder holder, final int position) {

        //position -> current item

        System.out.println(versionModels.get(position));
        holder.title_tv.setText(versionModels.get(position).getLangName());
        holder.imageView_iv.setImageResource(versionModels.get(position).kalaPhot);
        holder.made_tv.setText(versionModels.get(position).getMade());
        holder.price_tv.setText(versionModels.get(position).getPrice());



        if (versionModels.get(position).getPrice() == null || versionModels.get(position).getPrice().trim().isEmpty()){
            holder.price_tv.setVisibility(View.INVISIBLE);
        }

        int min =versionModels.get(position).getTimer() ;
        int milisec = (min*60*1000)+10 ;

        new CountDownTimer(milisec, 1000) {

            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long millisUntilFinished) {

                versionModels.get(position).time_remain = millisUntilFinished;
                NumberFormat f = new DecimalFormat("00");
                 finalMin =(int) (millisUntilFinished / 60000) % 60 ;
                 finalSec = (int) (millisUntilFinished / 1000) % 60;

                holder.timer_tv.setText( f.format(finalMin) + ":" + f.format(finalSec) + " = تااتمام تخفیف");

            }
            @Override
            public void onFinish() {
               holder.timer_tv.setText("تخفیف به اتمام رسیده!");

            }
        }.start();

        if  (versionModels.get(position).getTimer() == 1) {
            holder.timer_tv.setVisibility(View.INVISIBLE);
        }


        if (position==1) {

            holder.rlt.setOnClickListener(v -> {
                long[] numbers = {finalMin , finalSec , millisUntilFinished, milisec};
                Intent intent = new Intent(context, shoesActivity.class);
                intent.putExtra("number", versionModels.get(position).time_remain);



                context.startActivity(intent);
            });

        }







        Log.e("where am I?",""+position);
    }


    @Override
    public int getItemCount() {
        return versionModels == null ? 0 : versionModels.size();
    }

    class VersionViewHolder extends RecyclerView.ViewHolder {



        ImageView imageView_iv;
        TextView title_tv;
        TextView price_tv;
        TextView made_tv;
        TextView prc_tv ;
        TextView timer_tv ;
        RelativeLayout rlt;

        public VersionViewHolder(View itemView) {
            super(itemView);
            title_tv = itemView.findViewById(R.id.title_tv);
            imageView_iv = itemView.findViewById(R.id.imageView_iv);
            price_tv = itemView.findViewById(R.id.priceTitle);
            made_tv = itemView.findViewById(R.id.madeTitle);
            timer_tv = itemView.findViewById(R.id.timer_tv23);
            rlt = itemView.findViewById(R.id.rltv_main);

        }
    }


}