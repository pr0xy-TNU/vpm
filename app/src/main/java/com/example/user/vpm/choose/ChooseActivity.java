package com.example.user.vpm.choose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.user.vpm.R;
import com.example.user.vpm.activity.SingleActivity;
import com.example.user.vpm.mvp.UsersActivity;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        findViewById(R.id.activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseActivity.this, SingleActivity.class));
            }
        });

        findViewById(R.id.mvp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseActivity.this, UsersActivity.class));
            }
        });
    }
}
