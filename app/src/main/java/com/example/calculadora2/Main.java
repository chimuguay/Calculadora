package com.example.calculadora2;

import android.view.View;
import android.widget.TextView;

public class Main {
    TextView tvdisplay;
    Double n1, n2, res;
    String Operador;

    public void b0(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"0");
    }
    public void b1(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"1");
    }
    public void b2(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void b3(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void b4(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"4");
    }
    public void b5(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"5");
    }
    public void b6(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"6");
    }
    public void b7(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"7");
    }
    public void b8(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"8");
    }
    public void b9(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+"9");
    }
    public void bpunto(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        tvdisplay.setText(tvdisplay.getText()+".");
    }
    public void onClickOperaticsCaptchaNumbers1(View view){
        tvdisplay = (TextView)view.findViewById(R.id.tv_dist);
        n1 = Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
    public void Sumar(View view){
        Operador = " + ";
        onClickOperaticsCaptchaNumbers1(view);
    }
    public void Restar(View view){
        Operador = " - ";
        onClickOperaticsCaptchaNumbers1(view);
    }
    public void Multiplicar(View view){
        Operador = " * ";
        onClickOperaticsCaptchaNumbers1(view);
    }
    public void Dividir(View view){
        Operador = " / ";
        onClickOperaticsCaptchaNumbers1(view);
    }
    public void Expn(View view){
        Operador = " exp ";
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
        }catch (NumberFormatException nfe) {}
    }
    public void Igual(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        n2 = Double.parseDouble(tvdisplay.getText().toString());
        if (Operador.equals(" + ")) {
            res = n1 + n2;
        }else if (Operador.equals(" - ")){
            res = n1 - n2;
        }else if(Operador.equals(" * ")){
            res = n1 * n2;
        }else if(Operador.equals(" / ")){
            res = n1 / n2;
        } else if(Operador.equals(" exp ")){
            tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
            n2 = Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText(" ");
            res = Math.pow(n1 , n2);
        }
        tvdisplay.setText(" "+res);
    }
    public void Rnd(View view){
        for (int x = 0; x <= 100; x++){
            int na = (int)Math.floor(Math.random() * (100 - (1 + 1) + ( 1 )));
            tvdisplay.setText(String.valueOf(na));
        }
    }
    public void Raiz(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.sqrt(n1);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void ExpCuadrado(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.pow(n1 , 2);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void ExpCubico(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.pow(n1 , 3);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Sin(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.sin(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Cos(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.cos(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Tan(View view){
        tvdisplay = (TextView) view.findViewById(R.id.tv_dist);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.tan(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Factorial(View view){
        int fact = 1;
        int x;
        try{
            for(x = 1; x <= n1; x++){
                fact = fact * x;
            }
        }catch (NumberFormatException nfe){}
    }
    public void borrarUlt(View view){
        if(tvdisplay.getText().toString().equals(" ")){
            tvdisplay.setText(tvdisplay.getText().subSequence(0, tvdisplay.getText().length() -1) + "");
        }
    }
    public void BorrarTodo(View view){
        n1=0.0;
        n2=0.0;
        tvdisplay=(TextView)view.findViewById(R.id.tv_dist);
        tvdisplay.setText("");
    }
    public void salir(View view) throws Throwable {
        finalize();
    }

}
 