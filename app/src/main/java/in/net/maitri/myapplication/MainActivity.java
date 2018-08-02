package in.net.maitri.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mblNo = "7829187187git commit -m \"first commit\"", pswd = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText mobile = findViewById(R.id.mbl);
        final EditText password = findViewById(R.id.pswd);
        Button loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getMobile = mobile.getText().toString();
                String getPasword = password.getText().toString();
                {
                    if (getMobile.equals("mobile") && getPasword.equals("password")) {
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        //password correct
                    } else {
                        //password wrong
                    }
                }
            }
        });

    }
}

