package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickGender(View view) {
        TextView mytext = findViewById(R.id.txtDisplay);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.rbMale:
                mytext.setText("Male");
                break;

            case R.id.rbFemale:
                mytext.setText("Female");
                break;
        }
    }

    public void checkedBox(View view) {
        TextView myoption = findViewById(R.id.txtDisplayOption);
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.cboTea:
                if (checked){
                    myoption.setText("Tea");
                    break;
                }
            case R.id.cboCoffee:
                if (checked){
                    myoption.setText("Coffee");
                    break;
                }
        }
    }
}
