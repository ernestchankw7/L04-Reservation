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

import java.util.Calendar;

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
                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();
                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();
                if(CheckRadioId == R.id.radioButtonSmoke)
                {
                    String message = "Name: " + nameEdit.getText() + "\nMobile: " + mobileEdit.getText() + "\nDate: " + day + "/" + month + "/" + year + "\nTime: " + hour + ":" + minute + "\n" + "Smoking area";
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String message = "Name: " + nameEdit.getText() + "\nMobile: " + mobileEdit.getText() + "\nDate: " + day + "/" + month + "/" + year + "\nTime: " + hour + ":" + minute + "\n" + "Non-Smoking area";
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEdit.setText("");
                mobileEdit.setText("");
                sizeEdit.setText("");
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(year, month, day);
                pickArea.clearCheck();
            }
        });
    }
}