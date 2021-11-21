package ir.hesam.digikala;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapterMoreDetail extends RecyclerView.Adapter<ItemAdapterMoreDetail.VersionViewHolder> {


    private final ArrayList<detail> versionModels;
    Context context;
    Intent intent;


    ArrayList<detail> details = new ArrayList<>();


    public ItemAdapterMoreDetail(Context context, ArrayList<detail> versionModels) {

        this.context = context;
        this.versionModels = versionModels;
        Log.e("adapter", versionModels.toString());

    }


    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.more_detail_base, parent, false);
        return new ItemAdapterMoreDetail.VersionViewHolder(view);


    }


    @Override
    public void onBindViewHolder(final ItemAdapterMoreDetail.VersionViewHolder holder, final int position) {

        //position -> current item
        //  holder.photo1_detail.setImageResource(versionModels.get(position).photo);
            holder.name_detail.setText(versionModels.get(position).price_detail);
            holder.date_order.setText(versionModels.get(position).date_order);
            holder.receiver_name.setText(versionModels.get(position).receiver_name);
            holder.receiver_number.setText(versionModels.get(position).receiver_number);
            holder.receiver_address.setText(versionModels.get(position).receiver_address);


    }

    @Override
    public int getItemCount () {
        return versionModels == null ? 0 : versionModels.size();


    }

    class VersionViewHolder extends RecyclerView.ViewHolder {


        TextView name_detail;
        TextView date_order;
        TextView receiver_name;
        TextView receiver_number;
        TextView receiver_address;


        public VersionViewHolder(View itemView) {
            super(itemView);

            name_detail = itemView.findViewById(R.id.name_detail);
            date_order = itemView.findViewById(R.id.date_order);
            receiver_name = itemView.findViewById(R.id.receiver_name);
            receiver_number = itemView.findViewById(R.id.receiver_number);
            receiver_address = itemView.findViewById(R.id.receiver_address);

        }

    }

}


