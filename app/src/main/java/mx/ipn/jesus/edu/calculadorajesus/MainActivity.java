package mx.ipn.jesus.edu.calculadorajesus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    Double numero1, numero2, resultado;
    boolean posible = true, nuevo = false;
    String operador = "";
    TextView tv, tv2;
    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
    }

    public void onClickCero(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        if(tv.getText().length() == 1){
            if (tv.getText().toString().charAt(0) != '0')
                tv.setText(tv.getText() + "0");
        }
        else
            tv.setText(tv.getText() + "0");
    }

    public void onClickUno(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "1");
    }

    public void onClickDos(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "2");
    }

    public void onClickTres(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "3");
    }

    public void onClickCuatro(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "4");
    }

    public void onClickCinco(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "5");
    }

    public void onClickSeis(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "6");
    }

    public void onClickSiete(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "7");
    }

    public void onClickOcho(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "8");
    }

    public void onClickNueve(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        tv.setText(tv.getText() + "9");
    }

    public void onClickPunto(View miView){
        if(nuevo == true){
            tv.setText("");
            nuevo = false;
        }
        int longitud = tv.getText().length();
        boolean encontrado = false;
        for (int i = 0; i < longitud; i++) {
            if (tv.getText().toString().charAt(i) == '.'){
                encontrado = true;
                break;
            }
        }
        if(encontrado == false)
            tv.setText(tv.getText() + ".");
    }

    public void onClickSuma(View miView){
        if(posible == true && !(tv.getText().toString().equals(""))){
            posible = false;
            numero1 = Double.parseDouble((String)tv.getText());
            tv2.setText(tv.getText() + " +");
            tv.setText("");
            operador = "+";
        }
    }

    public void onClickMulti(View miView){
        if(posible == true && !(tv.getText().toString().equals(""))){
            posible = false;
            numero1 = Double.parseDouble((String)tv.getText());
            tv2.setText(tv.getText() + " x");
            tv.setText("");
            operador = "*";
        }
    }

    public void onClickResta(View miView){
        if(posible == true && !(tv.getText().toString().equals(""))){
            posible = false;
            numero1 = Double.parseDouble((String)tv.getText());
            tv2.setText(tv.getText() + " -");
            tv.setText("");
            operador = "-";
        }
    }

    public void onClickDivi(View miView){
        if(posible == true && !(tv.getText().toString().equals(""))){
            posible = false;
            numero1 = Double.parseDouble((String)tv.getText());
            tv2.setText(tv.getText() + " ÷");
            tv.setText("");
            operador = "/";
        }
    }

    public void onClickIgual(View miView){
        if(posible == false && !(tv.getText().toString().equals(""))){
            tv2.setText("");
            numero2 = Double.parseDouble(tv.getText().toString());
            try {
                if (operador.equals("+")) {
                    resultado = numero1 + numero2;
                } else if (operador.equals("-")) {
                    resultado = numero1 - numero2;
                } else if (operador.equals("*")) {
                    resultado = numero1 * numero2;
                } else if (operador.equals("/")) {
                    resultado = numero1 / numero2;
                }
                tv.setText(resultado.toString());
                posible = true;
                nuevo = true;
            }catch(NumberFormatException nfe){
                Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
            }
        }
    }

    public void onClickLimpia(View miView){
        numero1=0.0;
        numero2=0.0;
        posible = true;
        nuevo = false;
        tv.setText("");
        tv2.setText("");
    }
}
