package ingeniumbd.com.kidspoem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton simpleImageButtonEnglish = (ImageButton)findViewById(R.id.btnEnglish);
        ImageButton simpleImageButtonBangla = (ImageButton)findViewById(R.id.btnBangla);

        simpleImageButtonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EnglishPoems.class);
                view.getContext().startActivity(Intent);
            }
        });
        simpleImageButtonBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BanglaPoems.class);
                view.getContext().startActivity(Intent);
            }
        });
    }
}
