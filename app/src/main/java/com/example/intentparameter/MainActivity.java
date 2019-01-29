package com.example.intentparameter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declaración de controladores
    EditText inputName;
    EditText inputAge;

    Button btnSend;
    Button btnClean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciamos el control con el id del componente de la vista
        inputName = (EditText) findViewById(R.id.inputName);
        inputAge = (EditText) findViewById(R.id.inputAge);

        btnSend = (Button) findViewById(R.id.bntSend);
        btnClean = (Button) findViewById(R.id.btnClean);

        btnSend.setOnClickListener(eventSend);

        btnClean.setOnClickListener(eventClean);
    }

    //Definición de Handler de limpieza
    View.OnClickListener eventClean = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputName.setText("");
            inputAge.setText("0");
        }
    };

    //Definición de Handler de envío
    View.OnClickListener eventSend = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent secondScreen = new Intent(getApplicationContext(), SecondScreen.class);

            secondScreen.putExtra("name", inputName.getText().toString());
            secondScreen.putExtra("age",inputAge.getText().toString());

            startActivity(secondScreen);
        }
    };
}
