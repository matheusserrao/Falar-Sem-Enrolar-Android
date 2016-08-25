package br.com.falarsemenrolar.falarsemenrolar.activitiesLearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.falarsemenrolar.falarsemenrolar.AudioPlay;
import br.com.falarsemenrolar.falarsemenrolar.R;

public class ObjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objects);
    }

    public void playBackPack(View view) {
        AudioPlay.getInstance().play(this, R.raw.bagpack);
    }

    public void playEraser(View view) {
        AudioPlay.getInstance().play(this, R.raw.eraser);
    }

    public void playBook(View view) {
        AudioPlay.getInstance().play(this, R.raw.book);
    }

    public void playChar(View view) {
        AudioPlay.getInstance().play(this, R.raw.chair);
    }

    public void playPencil(View view) {
        AudioPlay.getInstance().play(this, R.raw.pencil);
    }

    public void playPen(View view) {
        AudioPlay.getInstance().play(this, R.raw.pen);
    }

    public void playComputer(View view) {
        AudioPlay.getInstance().play(this, R.raw.computer);
    }

    public void playerRuler(View view) {
        AudioPlay.getInstance().play(this, R.raw.ruler);
    }


}
