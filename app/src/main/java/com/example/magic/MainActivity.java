package com.example.magic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int p1Vida;
    public int p2Vida;

    public int p1Veneno;
    public int p2Veneno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        p1Vida=20;
        p2Vida=20;
        p1Veneno=0;
        p2Veneno=0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void incrementarP1 (View vista){

        p1Vida++;
        actualizar();

    }

    public void decrementarP1 (View vista){

        p1Vida--;
        actualizar();
    }
    public void incrementarP2 (View vista){

        p2Vida++;
        actualizar();
    }

    public void decrementarP2 (View vista){

        p2Vida--;
        actualizar();
    }

    public void incrementarP1V (View vista){

        p1Veneno++;
        actualizar();
    }

    public void decrementarP1V (View vista){

        p1Veneno--;
        actualizar();
    }
    public void incrementarP2V (View vista){

        p2Veneno++;
        actualizar();
    }

    public void decrementarP2V (View vista){

        p2Veneno--;
        actualizar();
    }

    public void transferirP1 (View vista){

        p1Vida++;
        p2Vida--;
        actualizar();
    }

    public void transferirP2 (View vista){

        p1Vida--;
        p2Vida++;
        actualizar();

    }

    public void actualizar (){

        TextView player1 = (TextView) findViewById(R.id.p1Contador);
        TextView player2 = (TextView) findViewById(R.id.p2Contador);

        player1.setText(p1Vida + "/" + p1Veneno);
        player2.setText(p2Vida + "/" + p2Veneno);

    }

    public void incrementarP1VA (View vista){

        p1Veneno++;
        actualizarA();
    }
    public void incrementarP1A (View vista){

        p1Vida++;
        actualizarA();
    }

    public void incrementarP2A (View vista){

        p2Vida++;
        actualizarA();
    }
    public void incrementarP2VA (View vista){

        p2Veneno++;
        actualizarA();
    }

    public void transferirP1A (View vista){

        p1Vida++;
        p2Vida--;
        actualizarA();
    }

    public void transferirP2A (View vista){

        p1Vida--;
        p2Vida++;
        actualizarA();

    }

    public void decrementarP1VA (View vista){

        p1Veneno--;
        actualizarA();
    }
    public void decrementarP1A (View vista){

        p1Vida--;
        actualizarA();
    }

    public void decrementarP2A (View vista){

        p2Vida--;
        actualizarA();
    }
    public void decrementarP2VA (View vista){

        p2Veneno--;
        actualizarA();
    }


    public void actualizarA (){

        TextView player1A = (TextView) findViewById(R.id.p1ContadorA);
        TextView player2A = (TextView) findViewById(R.id.p2ContadorA);

        player1A.setText(p1Vida + "/" + p1Veneno);
        player2A.setText(p2Vida + "/" + p2Veneno);

    }

    public void reiniciar (View vista){

        p1Vida=20;
        p2Vida=20;
        p1Veneno=0;
        p2Veneno=0;
        actualizar();

    }

}
