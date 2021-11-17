package ir.hesam.digikala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    ArrayList <profileMoudel>  profileMoudel;
    RecyclerView profileRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String profile_obj_name;
        int profile_obj_photo;


        //region Item
        profileMoudel = new ArrayList<>();

        profileMoudel.add(new profileMoudel("در انتطار پرداخت",R.drawable.timer_icon));
        profileMoudel.add(new profileMoudel("در حال پردازش",R.drawable.cloud_icon));
        profileMoudel.add(new profileMoudel("تحویل شده",R.drawable.tick_icon_prof));
        profileMoudel.add(new profileMoudel("لغو شده",R.drawable.cancel_icon));
        profileMoudel.add(new profileMoudel("موجوع شده",R.drawable.return_icon));
        //endregion


        //region layoutManager
        profileRecycler = findViewById(R.id.profileRecycler);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        profileRecycler.setLayoutManager(layoutManager);

        //endregion


        //region Adapter
        ProfileAdapter adapterProfile;

        adapterProfile = new ProfileAdapter(this, profileMoudel);
        profileRecycler.setAdapter(adapterProfile);
        adapterProfile.notifyDataSetChanged();


        //endregion






    }
}