package br.com.falarsemenrolar.falarsemenrolar.activitiesLearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.falarsemenrolar.falarsemenrolar.AudioPlay;
import br.com.falarsemenrolar.falarsemenrolar.R;

public class ToBeVerbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tobeverb);
    }

    public void playToBeVerb1(View view) {
        AudioPlay.getInstance().play(this, R.raw.verbtobe1);
    }

    public void playToBeVerb2(View view) {
        AudioPlay.getInstance().play(this, R.raw.verbtobe2);
    }

}
