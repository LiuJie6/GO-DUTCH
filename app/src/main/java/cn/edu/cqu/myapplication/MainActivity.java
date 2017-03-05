package cn.edu.cqu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String amount;
    EditText totalamount,persNBR;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalamount=(EditText)findViewById(R.id.etAmount);
        persNBR=(EditText)findViewById(R.id.etNbr);
        display=(TextView)findViewById(R.id.tvAmountPerPerson);


    }

    public void btnExit(){
        System.exit(0);
    }

    public void btnCompute(View v){
        if(totalamount.getText().length()==0||persNBR.getText().length()==0){

           display.setText("You have not input!");
        }
       /* if(totalamount.getText().length()>9||persNBR.getText().length()>9){
            display.setText("The number is too big!");
        }*/
       /* if(persNBR.getText().equals(0)){
            display.setText("can't be zero");
        }*/
        else{
        Double total=Double.parseDouble(totalamount.getText().toString());
        Double persons=Double.parseDouble(persNBR.getText().toString());
        Double share=total/persons;
        share=Double.valueOf(Math.round(share+100));
        share=share/100;
        display.setText("The amoute to share is:"+String.valueOf(share));
        }

     // Toast.makeText(getBaseContext(),"The amount to share is:"+share,Toast.LENGTH_LONG).show();

    }
}
