package ir.hesam.digikala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    Context context;
    RecyclerView more_detail_recyclerview;
    ImageView back_icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null){
            Bundle bundle = getIntent().getExtras();

           if (bundle.containsKey("some")){
                String some = (String) bundle.get("some");
           }

        }

        back_icon = findViewById(R.id.back_icon);
        back_icon.setOnClickListener(v -> {
            onBackPressed();
        });

        //region item
        for (int i=0 ; i<FragmentDelivered.details.size(); i++){
            FragmentDelivered.details.get(i).toString();
        }
        //endregion


        //region layoutManager

        more_detail_recyclerview = findViewById(R.id.more_detail_recyclerview);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        more_detail_recyclerview.setLayoutManager(layoutManager);
        //endregion


        //region Adapter
        ItemAdapterMoreDetail itemAdapterMoreDetail;
        itemAdapterMoreDetail = new ItemAdapterMoreDetail(context,FragmentDelivered.details);
        more_detail_recyclerview.setAdapter(itemAdapterMoreDetail);
        itemAdapterMoreDetail.notifyDataSetChanged();
        //endregion



    }

}