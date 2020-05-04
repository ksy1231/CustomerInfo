package org.techtown.customerinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DateActivity extends AppCompatActivity {

    EditText monthEditText, dayEditText, yearEditText;
    String month, day, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        monthEditText = (EditText) findViewById(R.id.monthEditText);
        dayEditText = (EditText) findViewById(R.id.dayEditText);
        yearEditText = (EditText) findViewById(R.id.yearEditText);

        Button setButton = (Button) findViewById(R.id.setButton);
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                month = monthEditText.getText().toString();
                day = dayEditText.getText().toString();
                year = yearEditText.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("month", month);
                intent.putExtra("day", day);
                intent.putExtra("year", year);

                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button closeButton = (Button) findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
