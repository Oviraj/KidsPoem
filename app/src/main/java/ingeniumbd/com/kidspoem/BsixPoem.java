package ingeniumbd.com.kidspoem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BsixPoem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsix_poem);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
}
