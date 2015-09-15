package com.otherwisestudios.hipotenusa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_resultado;
    EditText et_primercateto, et_segundocateto;
    Button bt_operar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        et_primercateto = (EditText) findViewById(R.id.et_primercateto);
        et_segundocateto = (EditText) findViewById(R.id.et_segundocateto);
        bt_operar = (Button) findViewById(R.id.bt_calcular);

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

    public void calcular(View view){

        String xs = et_primercateto.getText().toString(),
                ys = et_segundocateto.getText().toString();


        float x = Float.parseFloat(xs);
        float y = Float.parseFloat(ys);

        float h = (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        tv_resultado.setText(String.valueOf(h));

    }

}
