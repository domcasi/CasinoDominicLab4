package iics.casino.dominicmichael.lab4_activity_casi;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastbtn = (Button) findViewById(R.id.backbtn);
        Button snackbtn = (Button) findViewById(R.id.nextbtn);


        toastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "TOAST";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });


        snackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = findViewById(R.id.main_layout_id);
                String message = "SnackBar Message.";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
            public void showSnackbar(View view, String message, int duration)
            {
                Snackbar.make(view, message,duration).show();
            }
        });

    }
}
