package br.com.falarsemenrolar.falarsemenrolar.activitiesLearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.falarsemenrolar.falarsemenrolar.AudioPlay;
import br.com.falarsemenrolar.falarsemenrolar.R;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
    }

    public void playNumbers1to10(View view){    AudioPlay.getInstance().play(this, R.raw.numeros1e10); }
    public void playNumbers11to19(View view){ AudioPlay.getInstance().play(this, R.raw.numerosentre11e19);}
    public void playNumbersDezenas(View view){ AudioPlay.getInstance().play(this,R.raw.numerosdezenas);}

}
