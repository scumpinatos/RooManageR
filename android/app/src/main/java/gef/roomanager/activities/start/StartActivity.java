package gef.roomanager.activities.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import gef.roomanager.R;
import gef.roomanager.activities.login.LoginActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        startActivity(new Intent(this, LoginActivity.class));
    }

}
