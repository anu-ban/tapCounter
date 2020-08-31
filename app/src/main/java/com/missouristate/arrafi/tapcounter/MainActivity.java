package com.missouristate.arrafi.tapcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtCount;
    private Button btnTap;
    private Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTap = findViewById(R.id.buttonTap);
        btnReset = findViewById(R.id.buttonReset);
        txtCount = findViewById(R.id.textView);
        txtCount.setText("0");

        btnTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String countValue = txtCount.getText().toString();
                int inCountValue = Integer.parseInt(countValue);
                inCountValue++;
                txtCount.setText(String.valueOf(inCountValue));

            }
        });


    }

    public void resetClicked(View view) {
        txtCount.setText("0");
    }
}
