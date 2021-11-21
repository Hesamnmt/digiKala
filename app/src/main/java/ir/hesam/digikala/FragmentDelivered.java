package ir.hesam.digikala;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentDelivered extends Fragment {
    View view;
    Context context;
    RecyclerView recycler_detail;
    RelativeLayout rtl_detail;

    ArrayList<detail> details = new ArrayList<>();

    String name_detail;
    int photo1_detail;
    int photo2_detail;
    int photo3_detail;
    int price_detail;


    public FragmentDelivered(){
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.delivered_fragment,container,false);

        recycler_detail = view.findViewById(R.id.recycler_detail);
        rtl_detail = view.findViewById(R.id.rtl_detail);
        context = getContext();












       //region AddItem
        details.add(new detail("44444",R.drawable.sh1,R.drawable.sh2,R.drawable.sh3,"810"));
        details.add(new detail("55555",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"1000"));
        details.add(new detail("324567",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"1000"));
        details.add(new detail("333",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"900"));
        details.add(new detail("5679900",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"7800"));
        details.add(new detail("1212134",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"870"));
        details.add(new detail("cdcdvg3",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"10000"));
        details.add(new detail("12135hkkll",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"100999"));
        details.add(new detail("112343rddf0",R.drawable.back_icon,R.drawable.acount_icon,R.drawable.sh3,"780"));
        //endregion

        //region layoutManager
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recycler_detail.setLayoutManager(layoutManager);
        //endregion


        //region Adapter
        ItemAdapterDetail itemAdapterDetail;
        itemAdapterDetail = new ItemAdapterDetail(context,details);
        recycler_detail.setAdapter(itemAdapterDetail);
        itemAdapterDetail.notifyDataSetChanged();
        //endregion



        return view;
    }
}
