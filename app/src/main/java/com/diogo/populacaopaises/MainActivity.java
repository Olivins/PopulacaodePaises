package com.diogo.populacaopaises;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    List<Paises> paises;
    PaisesAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = new ListView(this);
        setContentView(listView);
        paises = new ArrayList<Paises>();
        paises.add(new Paises(1,"China", 1379302784, 2017, 0));
        paises.add(new Paises(2,"Índia", 1281935872, 2017, 1));
        paises.add(new Paises(3,"Estados Unidos", 326625792, 2017, 2));
        paises.add(new Paises(4,"Indonésia", 260580736, 2017, 3));
        paises.add(new Paises(5,"Paquistão", 204924864, 2017, 4));
        paises.add(new Paises(6,"Brasil", 207353392, 2017, 5));
        paises.add(new Paises(7,"Nigéria", 190632256, 2017, 6));
        paises.add(new Paises(8,"Bangladesh", 157826576, 2017, 7));
        paises.add(new Paises(9,"Rússia", 142257520, 2017, 8));
        paises.add(new Paises(10,"Japão", 126451400, 2017, 9));
        paises.add(new Paises(11,"México", 125594792, 2017, 10));
        paises.add(new Paises(12,"Filipinas", 103256080, 2017, 11));
        paises.add(new Paises(13,"Vietnã", 96160160, 2017, 12));
        paises.add(new Paises(14,"Etiopia", 90076012, 2017, 13));
        paises.add(new Paises(15,"Egito", 97041072, 2017, 14));

        listView.setAdapter(new PaisesAdapter(this,paises));
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?>adapterView, View view, int i, long l){
        Paises paises = (Paises) adapterView.getItemAtPosition(i);
        Toast.makeText(this,paises.getNome(), Toast.LENGTH_SHORT).show();
    }
}

