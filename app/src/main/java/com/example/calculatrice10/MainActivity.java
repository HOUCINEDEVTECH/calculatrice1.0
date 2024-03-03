package com.example.calculatrice10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
     EditText _edt1,_edt2;
     TextView _TXTAFFICH;
     Button _btnSom,_Modulo,_bntMOIN,_btnMULT,_btnDIV;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _edt1=findViewById(R.id.edt1);
        _edt2=findViewById(R.id.edt2);
        _TXTAFFICH=findViewById(R.id.TXTAFFICH);
        _btnSom=findViewById(R.id.btnSom);
        _Modulo=findViewById(R.id.Modulo);
        _bntMOIN=findViewById(R.id.bntMOIN);
        _btnMULT=findViewById(R.id.btnMULT);
        _btnDIV=findViewById(R.id.btnDIV);


        _Modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_edt1.getText().toString().isEmpty() || _edt1.getText().toString().equals(".") || _edt2.getText().toString().equals(".") || _edt2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Données manquantes!", Toast.LENGTH_LONG).show();
                    return;
                }

                float x1 = Float.parseFloat(_edt1.getText().toString());
                float x2 = Float.parseFloat(_edt2.getText().toString());

                // Vérifier si le dénominateur est égal à zéro
                if (x2 == 0) {
                    Toast.makeText(getApplicationContext(), "Division par zéro impossible!", Toast.LENGTH_LONG).show();
                    return;
                }

                float y = x1 % x2;

                DecimalFormat f = new DecimalFormat("#.##");
                String formattedValue = f.format(y);

                _TXTAFFICH.setText(formattedValue);
            }
        });

        _bntMOIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_edt1.getText().toString().isEmpty() || _edt1.getText().toString().equals(".") || _edt2.getText().toString().equals(".") || _edt2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Données manquantes!", Toast.LENGTH_LONG).show();
                    return;
                }

                float x1 = Float.parseFloat(_edt1.getText().toString());
                float x2 = Float.parseFloat(_edt2.getText().toString());

                // Vérifier si le dénominateur est égal à zéro
                if (x2 == 0) {
                    Toast.makeText(getApplicationContext(), "Division par zéro impossible!", Toast.LENGTH_LONG).show();
                    return;
                }

                float y = x1 - x2;

                DecimalFormat f = new DecimalFormat("#.##");
                String formattedValue = f.format(y);

                _TXTAFFICH.setText(formattedValue);
            }
        });

        _btnDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_edt1.getText().toString().isEmpty() || _edt1.getText().toString().equals(".") || _edt2.getText().toString().equals(".") || _edt2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Données manquantes!", Toast.LENGTH_LONG).show();
                    return;
                }

                float x1 = Float.parseFloat(_edt1.getText().toString());
                float x2 = Float.parseFloat(_edt2.getText().toString());

                // Vérifier si le dénominateur est égal à zéro
                if (x2 == 0) {
                    Toast.makeText(getApplicationContext(), "Division par zéro impossible!", Toast.LENGTH_LONG).show();
                    return;
                }

                float y = x1 / x2;

                DecimalFormat f = new DecimalFormat("#.##");
                String formattedValue = f.format(y);

                _TXTAFFICH.setText(formattedValue);
            }
        });

          _btnMULT.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {


                  if (_edt1.getText().toString().equals("") || _edt1.getText().toString().equals(".") || _edt2.getText().toString().equals(".") ||_edt1.getText().toString() == null || _edt2.getText().toString().equals("") ||_edt2.getText().toString() == null)
                  {
                      Toast.makeText(getApplicationContext(),"données manquantes!",Toast.LENGTH_LONG).show();
                      return;
                  }
                  float x1 = Float.parseFloat(_edt1.getText().toString());
                  float x2 = Float.parseFloat(_edt2.getText().toString());
                  DecimalFormat f = new DecimalFormat("#.##");
                  float y = x1 * x2;
                  String formattedValue = f.format(y);

                  _TXTAFFICH.setText(String.valueOf(formattedValue));

              }
          });




        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_edt1.getText().toString().equals("") || _edt1.getText().toString().equals(".") || _edt2.getText().toString().equals(".") ||_edt1.getText().toString() == null || _edt2.getText().toString().equals("") ||_edt2.getText().toString() == null)
                {
                    Toast.makeText(getApplicationContext(),"données manquantes!",Toast.LENGTH_LONG).show();
                    return;
                }
                float x1 = Float.parseFloat(_edt1.getText().toString());
                float x2 = Float.parseFloat(_edt2.getText().toString());
                DecimalFormat f = new DecimalFormat("#.##");
                float y = x1+ x2;
                String formattedValue = f.format(y);

                _TXTAFFICH.setText(String.valueOf(formattedValue));
            }

        });



    }
}