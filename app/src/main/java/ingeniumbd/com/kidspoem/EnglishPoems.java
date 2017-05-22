package ingeniumbd.com.kidspoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishPoems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_poems);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Button firstButtonEnglish = (Button)findViewById(R.id.firstBtn);
        Button scondButtonEnglish = (Button)findViewById(R.id.scondBtn);
        Button thirdButtonEnglish = (Button)findViewById(R.id.thirdBtn);
        Button fourthButtonEnglish = (Button)findViewById(R.id.fourthBtn);
        Button fifthButtonEnglish = (Button)findViewById(R.id.fifthBtn);
        Button sixButtonEnglish = (Button)findViewById(R.id.sixBtn);
        Button sevenButtonEnglish = (Button)findViewById(R.id.sevenBtn);
        Button eightButtonEnglish = (Button)findViewById(R.id.eightBtn);
        Button nineButtonEnglish = (Button)findViewById(R.id.nineBtn);
        Button tenButtonEnglish = (Button)findViewById(R.id.tenBtn);


        firstButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EfirstPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        scondButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EscondPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        thirdButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EthirdPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        fourthButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EfourthPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        fifthButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EfifthPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        sixButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EsixPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        sevenButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EsevenPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        eightButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EeightPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        nineButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EninePoem.class);
                view.getContext().startActivity(Intent);
            }
        });
        tenButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EtenPoem.class);
                view.getContext().startActivity(Intent);
            }
        });
    }
}
