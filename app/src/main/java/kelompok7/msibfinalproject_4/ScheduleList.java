package kelompok7.msibfinalproject_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_list);
        ImageButton btnBack = findViewById(R.id.backSchedule);

        btnBack.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        Button btnDetail = findViewById(R.id.btnDetail);
        btnDetail.setOnClickListener(v -> {
            startActivity(new Intent(this, BusDetail.class));

        });
    }
}