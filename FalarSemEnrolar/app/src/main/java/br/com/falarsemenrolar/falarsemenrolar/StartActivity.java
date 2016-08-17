package br.com.falarsemenrolar.falarsemenrolar;

import android.app.ProgressDialog;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mensagemIniciar();
    }

    public void startMenuView(View view) {

        ProgressDialog pd = new ProgressDialog(StartActivity.this);

        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage("POR FAVOR AGUARDE...");
        pd.setIndeterminate(true);
        pd.setCancelable(true);
        pd.show();
        pd.setProgress(50);

        startActivity(new Intent(this, MenuActivity.class));

        finish();
    }


    private void mensagemIniciar()
    {
        Toast t = Toast.makeText(this, "Pressione Start para iniciar!", Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
}
