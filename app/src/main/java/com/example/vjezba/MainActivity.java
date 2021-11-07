package com.example.vjezba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button oBtnDalje;
    private TextInputEditText oInputIme;
    private TextInputEditText oInputPrezime;
    private TextInputEditText oInputDatum;
    private String sIme;
    private String sPrezime;
    private String sDatum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oInputIme = (TextInputEditText)findViewById(R.id.etIme);
        oInputPrezime = (TextInputEditText)findViewById(R.id.etPrezime);
        oInputDatum = (TextInputEditText)findViewById(R.id.etDatum);

        oBtnDalje = (Button)findViewById(R.id.btnDalje);
        oBtnDalje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sIme = oInputIme.getText().toString();
                sPrezime = oInputPrezime.getText().toString();
                sDatum = oInputDatum.getText().toString();
                Intent oUpisiStudentIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oUpisiStudentIntent.putExtra("ime", sIme);
                oUpisiStudentIntent.putExtra("prezime", sPrezime);
                oUpisiStudentIntent.putExtra("datum", sDatum);

                startActivity(oUpisiStudentIntent);
            }
        });
    }
}