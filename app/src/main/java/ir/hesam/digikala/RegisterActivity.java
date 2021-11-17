package ir.hesam.digikala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {




    public String getPhoneNumber() {
        return phoneNumber;
    }

    String phoneNumber;

    @Override
    public String toString() {
        return "RegisterActivity{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    EditText phoneNumber_txt;
    TextView result_txt;
    Button submit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_profile);
        phoneNumber_txt = findViewById(R.id.phone_txt);
        result_txt = findViewById(R.id.resultProfile);
        submit = findViewById(R.id.submit);



        submit.setOnClickListener(v -> {
            if (phoneNumber_txt.getText().toString().equals("1234")) {
                result_txt.setText("WELL COME");

                Intent intent = new Intent(this, ProfileActivity.class);
                this.startActivity(intent);

            }

            else {
                result_txt.setText("YOUR NUMBER IS INVALID!");
            }
        });


    }








}