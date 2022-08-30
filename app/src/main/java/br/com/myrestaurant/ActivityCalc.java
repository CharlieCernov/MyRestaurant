package br.com.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCalc extends AppCompatActivity {

    private Button bCalcular;
    private EditText number1;
    private EditText number2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        resultado = findViewById(R.id.Resultado);
        number1 = findViewById(R.id.n1);
        number2 = findViewById(R.id.n2);
        bCalcular = findViewById(R.id.bCalc);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(String.valueOf(number1.getText()));
                int n2 = Integer.parseInt(String.valueOf(number2.getText()));
                int resultado2 = n1+n2;
                resultado.setText("Resultado" + resultado2);
            }
        });
    }
}