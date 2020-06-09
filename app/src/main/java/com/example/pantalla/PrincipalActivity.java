package com.example.pantalla;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class PrincipalActivity extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        int images[] = {R.drawable.celular,R.drawable.celular2,R.drawable.celular3};
        v_flipper = findViewById(R.id.v_flipper);
        for (int i = 0; i < images.length; i++){
            flipperImages(images[i]);
        }
        for (int image: images){
            flipperImages(image);
        }
        Button iradescripcion = findViewById(R.id.iradescripcion);
        iradescripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(PrincipalActivity.this,descripcionActivity.class);
                startActivity(o);
            }
        });
    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView( this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000); //2 sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
