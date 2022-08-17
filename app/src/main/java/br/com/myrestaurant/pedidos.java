package br.com.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class pedidos extends AppCompatActivity {

    ListView ModelComp;



    int imgLanches[] = {
            R.drawable.pizzateste, R.drawable.pizzaradius};

    String tituloFood[] = {
            "Pizza Provolone",
            "Pizza Radius"};

    String descricaofood [] = {
            "Melhor queijo do mundo em 8 pedaços", "Melhor radius do mundo em 8 pedaços"};

    String rating [] = {
            ",4,5","5,0"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedidos_activity);

    ModelComp = findViewById(R.id.ModelComp);

    AdaptadorRecr adapter = new AdaptadorRecr();

    ModelComp.setAdapter(adapter);
    }

    public class AdaptadorRecr extends BaseAdapter{

        @Override
        public int getCount() {
            return imgLanches.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView Descricaofood, Titulofood,preco,quantidade,ModeloStars;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_pedidos,null);

            Descricaofood = view.findViewById(R.id.Descricaofood);
            Titulofood = view.findViewById(R.id.Titulofood);
            preco = view.findViewById(R.id.preco);
            quantidade = view.findViewById(R.id.quantidade);
            ModeloStars = view.findViewById(R.id.ModeloStars);

            return null;
        }
    }

}