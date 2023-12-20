package kelompok7.msibfinalproject_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class InputTrip extends AppCompatActivity {
    public EditText editTextseat, editTextDeparture, editTextArrival, editTextDate;
    public TextView textviewSeekbar;
    public SeekBar seekBar;
    public Button cancel, select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_trip);
        editTextseat = findViewById(R.id.seatss);
        editTextDeparture = findViewById(R.id.inputdeparture);
        editTextArrival = findViewById(R.id.inputarrival);
        editTextDate = findViewById(R.id.datepick);
        Button searchBus = findViewById(R.id.searchBus);

        searchBus.setOnClickListener(v->{
            startActivity(new Intent(this, ScheduleList.class));
            finish();
        });
        editTextseat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                addPopupSeekbar();
            }

        });
        editTextDeparture.setOnClickListener(view ->{
            startActivity(new Intent(InputTrip.this, DestinationAdapter.class));
        });
        editTextArrival.setOnClickListener(view ->{
            startActivity(new Intent(InputTrip.this, DestinationAdapter.class));
        });
        editTextDate.setOnClickListener(view ->{
            startActivity(new Intent(InputTrip.this, Date.class));
        });
    }

    private void addPopupSeekbar() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        View dialogView = layoutInflater.inflate(R.layout.passengger,null);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        seekBar = dialogView.findViewById(R.id.seekbarr);
        textviewSeekbar = dialogView.findViewById(R.id.count);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textviewSeekbar.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cancel = dialogView.findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        select = dialogView.findViewById(R.id.select);
    }
    public void ticketList(View view){
        startActivity(new Intent(InputTrip.this, MainActivity.class));
        finish();}

    public void soon(View view){
        startActivity(new Intent(InputTrip.this, Soon.class));
        finish();}
}