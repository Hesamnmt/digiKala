package ir.hesam.digikala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class OrderActivity extends AppCompatActivity {

    TabLayout tabLayout;
    public static ViewPager viewPager;
    ImageView back_icon;
    int fragmentId;
    LinearLayout sell_object;
    Toolbar toolbar;
    ImageView icon_toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_pager);
        fragmentId = getIntent().getIntExtra("FRAGMENT_ID", 0);


        //region toolbar
        toolbar = findViewById(R.id.toolbar);
        icon_toolbar = findViewById(R.id.icon_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(" سفارش های من");
        icon_toolbar.setImageResource(R.drawable.search_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //endregion

        //region BackButton
//        back_icon = findViewById(R.id.back_icon);
//        back_icon.setOnClickListener(v -> {
//            onBackPressed();
//        });
        //endregion


        //region AddFragment
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentWaiting(),"در انتطار پرراخت");
        adapter.AddFragment(new FragmentProcessing(),"در حال پردازش");
        adapter.AddFragment(new FragmentDelivered(),"تحویل شده");
        adapter.AddFragment(new FragmentCancel(),"لغو شده");
        adapter.AddFragment(new FragmentReturn(),"مرجوع شده");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //endregion

        if(savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if (extras.containsKey("current")){
                int current  = extras.getInt("current");


                if (current>5){
                    return;
                }
                TabLayout.Tab tab = tabLayout.getTabAt(current);

                tab.select();

            }
        }





    }
}