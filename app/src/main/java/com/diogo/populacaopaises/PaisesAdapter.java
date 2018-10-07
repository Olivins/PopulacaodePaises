package com.diogo.populacaopaises;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PaisesAdapter extends BaseAdapter{

    Context ctx;
    List<Paises> lista;

    public PaisesAdapter(Context ctx, List<Paises> lista) {
        this.ctx = ctx;
        this.lista = lista;
    }
    @Override
    public int getCount(){
        return lista.size();
    }

    @Override
    public Object getItem(int i){
        return lista.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }
    public View getView(int i, View view, ViewGroup viewGroup){
        Paises paises = lista.get(i);
        View layout = LayoutInflater.from(ctx).inflate(R.layout.activity_main,null);
        ImageView img = (ImageView) layout.findViewById(R.id.imageView);
        TextView ranking = (TextView) layout.findViewById(R.id.textView_0);
        TextView nome = (TextView) layout.findViewById(R.id.textView_1);
        TextView populacao = (TextView) layout.findViewById(R.id.textView_2);
        TextView ano = (TextView) layout.findViewById(R.id.textView_3);
        TypedArray imagens = ctx.getResources().obtainTypedArray(R.array.imagens);
        img.setImageDrawable(imagens.getDrawable(paises.getImagem()));
        ranking.setText("Ranking: "+paises.getRanking());
        nome.setText("Pais: "+paises.getNome());
        populacao.setText("População: "+paises.getPopulacao());
        ano.setText("Ano: "+paises.getAno());
        return layout;
    }
}
