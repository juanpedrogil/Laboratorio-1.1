package com.debug.prueba.aplicacion.juanpedrog.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    TextView lblResultado;
    TextView txtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular=findViewById(R.id.calcular);
        lblResultado=findViewById(R.id.lblResultado);
        txtNum=(TextView) findViewById(R.id.txtNum);
    }
    public void onClickCalcular(View v){
        int num=Integer.parseInt(txtNum.getText().toString());
        lblResultado.setText("La tabla de "+num+"\n"
        +num+"x1= "+num*1+"\n"+num+"x2= "+num*2+"\n"+num+"x3= "+num*3+"\n"
                +num+"x4= "+num*4+"\n"+num+"x5= "+num*5+"\n"
                +num+"x6= "+num*6+"\n"+num+"x7= "+num*7+"\n"
                +num+"x8= "+num*8+"\n"+num+"x9= "+num*9+"\n"
                +num+"x10= "+num*10+"\n");
    }
}
