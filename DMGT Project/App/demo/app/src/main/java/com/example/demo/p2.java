package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class p2 extends AppCompatActivity {
    private TextView loc, dest, ans;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        loc = findViewById(R.id.t2);
        dest = findViewById(R.id.t3);
        ans = findViewById(R.id.abc);

        String dest1 = getIntent().getStringExtra("Dest.");
        String loc1 = getIntent().getStringExtra("Loc.");
        String qq = getIntent().getStringExtra("Ans.");

        loc.setText(loc1);
        dest.setText(dest1);
        ans.setText(qq);


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openact1();
            }
        });
    }
    public void openact1(){
        Intent intent = new Intent(p2.this,MainActivity2.class);


        startActivity(intent);
    }
}