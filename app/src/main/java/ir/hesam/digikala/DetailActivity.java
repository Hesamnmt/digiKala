package ir.hesam.digikala;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Context context;
    RecyclerView more_detail_recyclerview;
    ImageView back_icon;
    TextView name_detail;
    TextView date_order;
    TextView receiver_name;
    TextView receiver_number;
    TextView receiver_address;
    Toolbar toolbar;
    ImageView icon_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //region item
        for (int i = 0; i < FragmentDelivered.details.size(); i++) {
            FragmentDelivered.details.get(i).toString();
        }
        //endregion


        //region toolbar
        toolbar = findViewById(R.id.toolbar);
        icon_toolbar = findViewById(R.id.icon_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("جزئیات سفارش من");
        setTitleColor(R.color.red);
        icon_toolbar.setImageResource(R.drawable.more_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //endregion


        // region getExtra
        name_detail = findViewById(R.id.name_detail);
        date_order = findViewById(R.id.date_order);
        receiver_name = findViewById(R.id.receiver_name);
        receiver_number = findViewById(R.id.receiver_number);
        receiver_address = findViewById(R.id.receiver_address);


        Bundle bundle = getIntent().getExtras();
        String name_d = bundle.getString("name_detail");
        String date_o = bundle.getString("date_order");
        String receiver_na = bundle.getString("receiver_name");
        String receiver_nu = bundle.getString("receiver_number");
        String receiver_add = bundle.getString("receiver_address");

        name_detail.setText(String.valueOf(name_d));
        date_order.setText(String.valueOf(date_o));
        receiver_name.setText(String.valueOf(receiver_na));
        receiver_number.setText(String.valueOf(receiver_nu));
        receiver_address.setText(String.valueOf(receiver_add));
        // endregion








        //        if (savedInstanceState == null) {
//            Bundle bundle = getIntent().getExtras();
//
//            if (bundle.containsKey("some")) {
//                String some = (String) bundle.get("some");
//            }
//
//        }

//        back_icon = findViewById(R.id.back_icon);
//        back_icon.setOnClickListener(v -> {
//            onBackPressed();
//        });




//        if (savedInstanceState == null) {
//            Bundle bundle = getIntent().getExtras();
//
//            if (bundle.containsKey("name_detail")) {
//                String name_detail = (String) bundle.get("name_detail");
//            }
//
//            else if  (bundle.containsKey("date_order")) {
//                String date_order = (String) bundle.get("date_order");
//            }
//
//            else if  (bundle.containsKey("receiver_name")) {
//                String receiver_name = (String) bundle.get("receiver_name");
//            }
//
//            else if  (bundle.containsKey("receiver_number")) {
//                String receiver_number = (String) bundle.get("receiver_number");
//            }
//
//            else if  (bundle.containsKey("receiver_address")) {
//                String receiver_address = (String) bundle.get("receiver_address");
//            }
//
//
//        }















        //region layoutManager

//        more_detail_recyclerview = findViewById(R.id.more_detail_recyclerview);
//        LinearLayoutManager layoutManager
//                = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
//        more_detail_recyclerview.setLayoutManager(layoutManager);
        //endregion


//        //region Adapter
//        ItemAdapterMoreDetail itemAdapterMoreDetail;
//        itemAdapterMoreDetail = new ItemAdapterMoreDetail(context,FragmentDelivered.details);
//        more_detail_recyclerview.setAdapter(itemAdapterMoreDetail);
//        itemAdapterMoreDetail.notifyDataSetChanged();
//        //endregion


    }
}