package br.com.falarsemenrolar.falarsemenrolar.activitiesLearn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.falarsemenrolar.falarsemenrolar.AudioPlay;
import br.com.falarsemenrolar.falarsemenrolar.R;

public class GreetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
    }

    public void playerGreetings(View view) { AudioPlay.getInstance().play(this, R.raw.greetings);}

    public void playerGreetingsPerguntas(View view) { AudioPlay.getInstance().play(this, R.raw.greetingsperguntas);}

    public void playerRespostas(View view)
    {
        AudioPlay.getInstance().play(this, R.raw.greetingsrespostas);
    }



}
