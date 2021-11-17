package ir.hesam.digikala;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapterShoes extends RecyclerView.Adapter<ItemAdapterShoes.VersionViewHolder> {

    Context context;

    ArrayList<shoe> versionModels = new ArrayList<>();




    public ItemAdapterShoes(Context context,ArrayList<shoe> versionModels) {

        this.context = context;
        this.versionModels = versionModels;
        Log.e("adapter",versionModels.toString());

    }


    @Override
    public ItemAdapterShoes.VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shoe_item, parent, false);
        return new VersionViewHolder(view);


    }

    @Override
    public void onBindViewHolder(final ItemAdapterShoes.VersionViewHolder holder, final int position) {

        //position -> current item
        holder.shoes_iv.setImageResource(versionModels.get(position).photo);

    }


    @Override
    public int getItemCount() {
        return versionModels == null ? 0 : versionModels.size();


    }

    class VersionViewHolder extends RecyclerView.ViewHolder {

        ImageView shoes_iv;
        TextView pishnehad_timer;

        public VersionViewHolder(View itemView) {
            super(itemView);

            shoes_iv = itemView.findViewById(R.id.shoesRecycle_iv);
            pishnehad_timer = itemView.findViewById(R.id.pishnehad_timer);






        }

    }


}
