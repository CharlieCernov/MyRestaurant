package br.com.myrestaurant;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView teste1;
   private TextView teste2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        teste1=findViewById(R.id.preco);
        teste2=findViewById(R.id.valuetotal);

        teste1+teste2
    }
}