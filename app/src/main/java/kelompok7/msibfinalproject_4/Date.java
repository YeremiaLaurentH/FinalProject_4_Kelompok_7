package kelompok7.msibfinalproject_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Date extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        Button select = findViewById(R.id.select);
        ImageView back = findViewById(R.id.ivBackArrow);

        select.setOnClickListener(v -> {
            startActivity(new Intent(this, InputTrip.class));
            finish();
        });
        back.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}