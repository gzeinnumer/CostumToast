package com.gzeinnumer.costumtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toast)
    Button toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.toast)
    public void onViewClicked() {
        Toast toast = Toast.makeText(this, "Gravity. TOP", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.costum, (ViewGroup) findViewById(R.id.costumLay)));
        toast.show();
    }
}
