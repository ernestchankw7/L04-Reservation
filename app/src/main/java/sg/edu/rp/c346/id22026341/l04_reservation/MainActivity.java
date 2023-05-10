package sg.edu.rp.c346.id22026341.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView nameView;
    EditText nameEdit;
    TextView mobileView;
    EditText mobileEdit;
    TextView sizeView;
    EditText sizeEdit;
    DatePicker dp;
    TimePicker tp;
    RadioGroup pickArea;
    Button cnfrm;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameView = findViewById(R.id.textViewName);
        nameEdit = findViewById(R.id.editTextName);
        mobileView = findViewById(R.id.textViewMobile);
        mobileEdit = findViewById(R.id.editTextMobile);
        sizeView = findViewById(R.id.textViewSize);
        sizeEdit = findViewById(R.id.editTextSize);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        pickArea = findViewById(R.id.radioButtonArea);
        cnfrm = findViewById(R.id.buttonConfirm);
        reset = findViewById(R.id.buttonReset);
        cnfrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int CheckRadioId =pickArea.getCheckedRadioButtonId();
                if(CheckRadioId == R.id.radioButtonSmoke)
                {
                    Toast.makeText(MainActivity.this, "Name: " + nameEdit, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Name: " + nameEdit, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}