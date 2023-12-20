package kelompok7.msibfinalproject_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class VerifyPayment extends AppCompatActivity {
    Button btnVerify;
    ImageView btnQrcode, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_payment);
        btnBack = findViewById(R.id.btnBack);
        btnQrcode = findViewById(R.id.btnQRCode);
        btnVerify = findViewById(R.id.btnVerifyP);

        btnQrcode.setOnClickListener(v -> {
            startActivity(new Intent(this, QrcodePayment.class));
            finish();
        });
        btnBack.setOnClickListener(v -> {
            startActivity(new Intent(this, OrderPayment.class));
            finish();
        });
        btnVerify.setOnClickListener(v -> {
            startActivity(new Intent(this, TicketItem.class));
            finish();
        });
    }
}