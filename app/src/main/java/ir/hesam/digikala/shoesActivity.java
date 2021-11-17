package ir.hesam.digikala;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class shoesActivity extends AppCompatActivity {

    RecyclerView recyclerView_shoes;
    ArrayList<shoe> shoes_iv = new ArrayList<>();
    TextView pishnehad_timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shooes);
        pishnehad_timer = findViewById(R.id.pishnehad_timer);
        recyclerView_shoes = findViewById(R.id.shoesRecycle_iv);



        //region count down timer
        if (savedInstanceState == null){
            Bundle bundle = getIntent().getExtras();
            if(bundle != null){
                 if ( bundle.containsKey("number")){

                     long time = bundle.getLong("number");
                     Log.e("in shoes_is","contains "+ time);

                     new CountDownTimer(time, 1000) {

                         @Override
                         public void onTick(long millisUntilFinished) {
                             NumberFormat f = new DecimalFormat("00");


                             Log.e("in shoes_is","contains "+ millisUntilFinished);

                           int  finalMin =(int) (millisUntilFinished / 60000) % 60 ;
                              int finalSec = (int) (millisUntilFinished / 1000) % 60;

                             pishnehad_timer.setText( f.format(finalMin) + ":" + f.format(finalSec) );

                         }

                         @Override
                         public void onFinish() {

                         }


                     }.start();
                 }
            }
        }
        //endregion

        //region item
        shoes_iv.add(new shoe(R.drawable.sh1));
        shoes_iv.add(new shoe(R.drawable.sh2));
        shoes_iv.add(new shoe(R.drawable.sh3));
        shoes_iv.add(new shoe(R.drawable.sh4));
        //endregion

        //region layoutManager
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        recyclerView_shoes.setLayoutManager(layoutManager);

        //endregion

        //region Adapter
        ItemAdapterShoes itemAdapterShoes;
        itemAdapterShoes = new ItemAdapterShoes(this,shoes_iv);
        recyclerView_shoes.setAdapter(itemAdapterShoes);
        itemAdapterShoes.notifyDataSetChanged();


        //endregion

    }
}