package ingeniumbd.com.kidspoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BanglaPoems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_poems);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Button firstButtonBangla = (Button)findViewById(R.id.firstBtn);
        Button scondButtonBangla = (Button)findViewById(R.id.scondBtn);
        Button thirdButtonBangla = (Button)findViewById(R.id.thirdBtn);
        Button fourthButtonBangla = (Button)findViewById(R.id.fourthBtn);
        Button fifthButtonBangla = (Button)findViewById(R.id.fifthBtn);
        Button sixButtonBangla = (Button)findViewById(R.id.sixBtn);
        Button sevenButtonBangla = (Button)findViewById(R.id.sevenBtn);
        Button eightButtonBangla = (Button)findViewById(R.id.eightBtn);
        Button nineButtonBangla = (Button)findViewById(R.id.nineBtn);
        Button tenButtonBangla = (Button)findViewById(R.id.tenBtn);


        firstButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Intent = new Intent(view.getContext(), BfirstPoem.class);
                startActivity(new Intent(getApplicationContext(),BfifthPoem.class));
            }
        });
        scondButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BscondPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        thirdButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BthirdPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        fourthButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BfourthPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        fifthButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BfifthPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        sixButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BsixPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        sevenButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BsevenPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        eightButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BeightPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        nineButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BninePoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        tenButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BtenPoem.class);
                view.getContext().startActivity(Intent);
            }
        });

    }
}
