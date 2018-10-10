package a.simpleapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle ade = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user);
        nama.setText(ade.getCharSequence("nama"));
    }

    @Override
    public void onClick(View view) {

    }
    public void addu(View view) {


    }
    public void listu(View view) {

    }


    public void gotofragment(View view) {
    Intent intent = new Intent(MainActivity.this , TigaActivity.class);
    startActivity(intent);
    }

    public void gotoactivity(View view) {
        Intent intent = new Intent(MainActivity.this , EmpatActivity.class);
        startActivity(intent);
    }
}

