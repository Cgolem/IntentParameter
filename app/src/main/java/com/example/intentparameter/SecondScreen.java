package com.example.intentparameter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondScreen extends AppCompatActivity {
    //Declaración de controladores
    EditText inputName;
    EditText inputAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        //Referenciamos el control con el id del componente de la vista
        inputName = (EditText) findViewById(R.id.inputName);
        inputAge = (EditText) findViewById(R.id.inputAge);

        //Asignamos los parametros que llegan de putExtra de la intención de la pantalla anterior
        Bundle data = getIntent().getExtras();
        inputName.setText(data.getString("name"));
        inputAge.setText(data.getString("age"));
    }
}
