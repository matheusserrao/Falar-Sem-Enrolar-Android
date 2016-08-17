package br.com.falarsemenrolar.falarsemenrolar;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import br.com.falarsemenrolar.falarsemenrolar.R;
import br.com.falarsemenrolar.falarsemenrolar.activitiesLearn.GreetingsActivity;
import br.com.falarsemenrolar.falarsemenrolar.activitiesLearn.NumbersActivity;
import br.com.falarsemenrolar.falarsemenrolar.activitiesLearn.ObjectsActivity;
import br.com.falarsemenrolar.falarsemenrolar.activitiesLearn.ToBeVerbActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void loadLearnGreetings(View view)
    {
        startActivity(new Intent(this, GreetingsActivity.class));
    }

    public void loadLearnNumbers(View view)
    {
        startActivity(new Intent(this, NumbersActivity.class));
    }

    public void loadLearnToBeVerb(View view)
    {
        startActivity(new Intent(this, ToBeVerbActivity.class));
    }

    public void loadLearnObjects(View view)
    {
        startActivity(new Intent(this, ObjectsActivity.class));
    }

    public void loadInfo(View view)
    {
        final Dialog d = new Dialog(this);
        d.setContentView(R.layout.activity_obrigado);
        d.setTitle("Agradecimentos pelo ensino...");
        d.show();
    }
}
