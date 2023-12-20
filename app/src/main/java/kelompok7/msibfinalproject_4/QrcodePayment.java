package kelompok7.msibfinalproject_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class QrcodePayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_payment);

        TextView btnBackDetail = findViewById(R.id.back_detail);

        btnBackDetail.setOnClickListener(v -> {
            startActivity(new Intent(this, VerifyPayment.class));
            finish();
        });
    }
}