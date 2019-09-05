package br.com.etecia.appjanelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JanelaTres_Activity extends AppCompatActivity {
    Button btnAbrirJanela01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_tres_layout);
        btnAbrirJanela01 =(Button)findViewById(R.id.btnAbrirJanela01);

        btnAbrirJanela01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });


    }
}
