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

   public static ArrayList<detail> details = new ArrayList<>();

    String name_detail;
    String receiver_name;
    String date_order;
    String receiver_number;
    String receiver_address;
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
        details.add(new detail("44444",R.drawable.sh1,R.drawable.sh2,R.drawable.sh3,"810","حسام نعمتی" , "1399/5/12","09199595777","زنجان ، زنجان ، پارک علم و فناوری" ));
        details.add(new detail("55555",R.drawable.lebas1,R.drawable.lebas2,R.drawable.lebas10,"1000","حسام نعمتی" , "1399/5/13","09199595777","زنجان ، زنجان ، پارک علم و فناوری1"));
        details.add(new detail("324567",R.drawable.lebas6,R.drawable.lebas7,R.drawable.lebas9,"1000","حسام نعمتی" , "1399/5/14","09199595777","زنجان ، زنجان ، پارک علم و فناوری2"));
        details.add(new detail("333",R.drawable.lebas4,R.drawable.lebas11,R.drawable.lebas5,"900","حسام نعمتی" , "1399/5/15","09199595777","زنجان ، زنجان ، پارک علم و فناوری3"));
        details.add(new detail("5679900",R.drawable.lebas8,R.drawable.lebas12,R.drawable.lebas1,"7800","حسام نعمتی" , "1399/5/16","09199595777","زنجان ، زنجان ، پارک علم و فناوری4"));
        details.add(new detail("1212134",R.drawable.lebas6,R.drawable.sh2,R.drawable.lebas3,"870","حسام نعمتی" , "1399/5/17","09199595777","زنجان ، زنجان ، پارک علم و فناوری5"));
        details.add(new detail("cdcdvg3",R.drawable.lebas2,R.drawable.lebas9,R.drawable.lebas12,"10000","حسام نعمتی" , "1399/5/17","09199595777","زنجان ، زنجان ، پارک علم و فناوری6"));
        details.add(new detail("12135hkkll",R.drawable.lebas10,R.drawable.lebas8,R.drawable.lebas5,"100999","حسام نعمتی" , "1399/5/18","09199595777","زنجان ، زنجان ، پارک علم و فناوری7"));
        details.add(new detail("112343rddf0",R.drawable.sh1,R.drawable.lebas4,R.drawable.sh3,"780","حسام نعمتی" , "1399/5/19","09199595777","زنجان ، زنجان ، پارک علم و فناوری8"));
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
