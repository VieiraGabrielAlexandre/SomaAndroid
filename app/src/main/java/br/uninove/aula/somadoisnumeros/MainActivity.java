package br.uninove.aula.somadoisnumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText txtNum1;
    public EditText txtNum2;
    public TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
    }

    public void efetuarSoma(View view){
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());

        int soma = num1 + num2;
        txtResultado.setText(String.valueOf(soma));
    }
}
