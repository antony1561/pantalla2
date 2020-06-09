package com.example.pantalla;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button irANosotros = findViewById(R.id.irANosotros);
        irANosotros.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent o = new Intent(MainActivity.this,NosotrosActivity.class);
                startActivity(o);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        Button irAProductos = findViewById(R.id.btnProductos);
        irAProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent o = new Intent(MainActivity.this,ProductosListaActivity.class);
                startActivity(o);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        Button iralogin = findViewById(R.id.iralogin);
        iralogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent o = new Intent(MainActivity.this,loginActivity.class);
                startActivity(o);
            }
        });
    }
}
