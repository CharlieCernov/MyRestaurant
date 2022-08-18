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

    String precoProduto[] = {
            "32,00","40,00"
    };

    String quantidade [] = {
            "1","2"
    };
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
        public View getView(int i, View v, ViewGroup viewGroup) {
            TextView txtDescricaofood, txtTitulofood,txtpreco,txtquantidade,txtModeloStars;

            View view = getLayoutInflater().inflate(R.layout.modelo_pedidos,null);

            txtDescricaofood = view.findViewById(R.id.Descricaofood);
            txtTitulofood = view.findViewById(R.id.Titulofood);
            txtpreco = view.findViewById(R.id.preco);
            txtquantidade = view.findViewById(R.id.quantidade);
            txtModeloStars = view.findViewById(R.id.ModeloStars);

            txtDescricaofood.setText(descricaofood[i]);
            txtpreco.setText(precoProduto[i]);
            txtModeloStars.setText(rating[i]);
            txtTitulofood.setText(tituloFood[i]);
            txtquantidade.setText(quantidade[i]);
            return view;
        }
    }

}