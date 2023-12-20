package kelompok7.msibfinalproject_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class OrderPayment extends AppCompatActivity {
    ImageView btnBack, btnSelect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_payment);
        btnBack = findViewById(R.id.btnBack);
        btnSelect = findViewById(R.id.btnSelect);

        btnBack.setOnClickListener(v -> {
            startActivity(new Intent(this, TicketDetail.class));
            finish();
        });
        btnSelect.setOnClickListener(v -> {
            startActivity(new Intent(this, VerifyPayment.class));
        });
    }
}