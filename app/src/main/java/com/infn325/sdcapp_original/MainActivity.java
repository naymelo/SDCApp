package com.infn325.sdcapp_original;

        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;

public class MainActivity extends Activity {
    private ListView lstViewCategorias;
    private ArrayList<Categoria> lstCategorias = new ArrayList<Categoria>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstCategorias = Categoria.getAll(100);

        AdapterCategoria adpaterCategoria = new AdapterCategoria(lstCategorias, this);

        lstViewCategorias = (ListView) findViewById(R.id.listaCategorias);

        lstViewCategorias.setAdapter(adpaterCategoria);

    }
}
