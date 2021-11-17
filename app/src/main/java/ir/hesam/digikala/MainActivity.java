package ir.hesam.digikala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerView_elanat;
    Button profile;
    ArrayList<MainMoudel> mainMoudels;
    ArrayList<MainElanat> MainElanat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rerecycler_view);
        recyclerView_elanat = findViewById(R.id.rerecycler_view2);
        profile = findViewById(R.id.porf_btn);


        //region items

        Integer[] kalaPhoto = {R.drawable.mens_shirt, R.drawable.kafsh, R.drawable.lavazem_khanegi, R.drawable.lavazem_digital, R.drawable.digiplus, R.drawable.digipay};
        String[] kalaName = {"پیراهن", "کفش", "خانه و اشپزخانه", "لوازم دیجیتال", "دیجی پلاس", "دیجی پی"};
        String[] price = {"460T", "820T", "1,200,000T", "12,000,000T", "", "", ""};
        String[] made = {"Made in turkey", "Made in Tabriz", "Made in Jepan", "Made in China", "", "", ""};
        Integer[] timer = {2, 56, 13, 35, 1, 1};


        Integer[] off_Photo = {R.drawable.off20, R.drawable.off30, R.drawable.off40, R.drawable.off50, R.drawable.off60, R.drawable.off70,};
        String[] off_txt = {"20%", "30%", "40%", "50%", "60%", "70%"};

        mainMoudels = new ArrayList<>();


        String prc;
        String md;
        int timer_tv;


        // initialise for میانبر
        for (int i = 0; i < kalaName.length; i++) {
            Log.e("i is", "" + i + "\t" + kalaName.length);
            int kp = kalaPhoto[i];
            String kn = kalaName[i];
            prc = price[i];
            md = made[i];
            timer_tv = timer[i];
            MainMoudel moudel = new MainMoudel(kp, kn, prc, md, timer_tv);
            mainMoudels.add(moudel);
        }

        MainElanat = new ArrayList<>();

        // initialise for اعلانات
        for (int i = 0; i < off_Photo.length; i++) {
            int op = off_Photo[i];
            String ot = off_txt[i];
            MainElanat elanat = new MainElanat(op, ot);
            MainElanat.add(elanat);
        }


        Log.e("MAin", mainMoudels.toString());
        //endregion


        //region layoutManger
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        LinearLayoutManager layoutManager1
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView_elanat.setLayoutManager((layoutManager1));


        //endregion


        //region adapter
        ItemAdapter adapter_Mianbor;
        ItemAdapterElanat adapter_elanat;

        adapter_Mianbor = new ItemAdapter(this, mainMoudels);
        recyclerView.setAdapter(adapter_Mianbor);
        adapter_Mianbor.notifyDataSetChanged();

        adapter_elanat = new ItemAdapterElanat(this, MainElanat);
        recyclerView_elanat.setAdapter(adapter_elanat);
        adapter_elanat.notifyDataSetChanged();


        //endregion



            recyclerView.setItemViewCacheSize(100);

            profile.setOnClickListener(v -> {

                Intent intent = new Intent(this, RegisterActivity.class);
                this.startActivity(intent);

            });

    }
}