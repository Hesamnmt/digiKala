package ir.hesam.digikala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        if (savedInstanceState == null){
//            Bundle bundle = getIntent().getExtras();
//
//            if (bundle.containsKey("P")){
//                String p = (String) bundle.get("P");
//            }
//
//        }





        if (savedInstanceState == null){
            Bundle bundle = getIntent().getExtras();

           if (bundle.containsKey("some")){
                String some = (String) bundle.get("some");
           }

        }
    }
}