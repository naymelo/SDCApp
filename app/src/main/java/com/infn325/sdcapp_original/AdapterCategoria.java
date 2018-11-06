package com.infn325.sdcapp_original;

        import android.app.Activity;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;

public class AdapterCategoria extends BaseAdapter {
    private final ArrayList<Categoria> categorias;
    private final Activity activity;

    public AdapterCategoria(ArrayList<Categoria> categorias, Activity act) {
        this.categorias = categorias;
        this.activity = act;
    }

    @Override
    public int getCount() {
        return categorias.size();
    }

    @Override
    public Object getItem(int i) {
        return categorias.get(i);
    }

    @Override
    public long getItemId(int i) {
        return categorias.get(i).getID();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View _view = activity.getLayoutInflater()
                .inflate(R.layout.linha_layout, viewGroup, false);

        Categoria categoria = categorias.get(i);

        TextView tvID = (TextView) _view.findViewById(R.id.codigo);
        TextView tvDescr = (TextView) _view.findViewById(R.id.descricao);

        tvID.setText(String.valueOf(categoria.getID()));
        tvDescr.setText(categoria.getDescricao());

        return _view;
    }
}
