package ir.hesam.digikala;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



    public class ItemAdapterElanat extends RecyclerView.Adapter<ItemAdapterElanat.VersionViewHolder> {
        Context context;

        ArrayList<MainElanat> versionElanat = new ArrayList<>();
        public ItemAdapterElanat(Context context,ArrayList<MainElanat> versionElanat) {
            this.context = context;

            this.versionElanat = versionElanat;

          //  Log.e("adapter",versionModels.toString());
        }


        @Override
        public VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_base_elanat, parent, false);
            VersionViewHolder viewHolder_elanat = new ir.hesam.digikala.ItemAdapterElanat.VersionViewHolder(view);

            return viewHolder_elanat;
        }


        @Override
        public void onBindViewHolder(final VersionViewHolder holder, final int position) {

            //position -> current item
            holder.Textview_elanat.setText(versionElanat.get(position).getOff_txt());
            holder.imageview_elanat.setImageResource(versionElanat.get(position).off_phot);

            Log.e("where am I?",""+position);
        }


        @Override
        public int getItemCount() {
            return versionElanat == null ? 0 : versionElanat.size();
        }

        class VersionViewHolder extends RecyclerView.ViewHolder {


            TextView Textview_elanat;
            ImageView imageview_elanat;


            public VersionViewHolder(View itemView) {
                super(itemView);
                Textview_elanat = itemView.findViewById(R.id.Textview_elanat);
                imageview_elanat = itemView.findViewById(R.id.imageview_elanat);
            }
        }




    }
