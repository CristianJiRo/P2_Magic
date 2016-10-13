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

    public int p1Vida=20;
    public int p2Vida=20;
    public int p1Veneno=0;
    public int p2Veneno=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actualizar();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("p1VidaS", p1Vida);
        outState.putInt("p2VidaS", p2Vida);
        outState.putInt("p1VenenoS", p1Veneno);
        outState.putInt("p2VenenoS", p2Veneno);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        p1Vida = savedInstanceState.getInt("p1VidaS");
        p2Vida = savedInstanceState.getInt("p2VidaS");
        p1Veneno = savedInstanceState.getInt("p1VenenoS");
        p2Veneno = savedInstanceState.getInt("p2VenenoS");
        actualizar();
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

    public void reiniciar (View vista){

        p1Vida=20;
        p2Vida=20;
        p1Veneno=0;
        p2Veneno=0;
        actualizar();

    }
}
