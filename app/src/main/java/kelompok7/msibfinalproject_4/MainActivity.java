package kelompok7.msibfinalproject_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView ivSearch, ivNote, ivNotification, ivProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivSearch = findViewById(R.id.ivSearch);
        ivNote = findViewById(R.id.ivNote);
        ivNotification = findViewById(R.id.ivNotification);
        ivProfile = findViewById(R.id.ivProfile);

        ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InputTrip.class));
            }
        });
        ivNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TicketItem.class));
            }
        });
        ivNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Soon.class));
            }
        });
    }
    public void scheduleList(View view){
        startActivity(new Intent(MainActivity.this, InputTrip.class));}

    public void ticketList(View view){
        startActivity(new Intent(MainActivity.this, TicketList.class));}
}