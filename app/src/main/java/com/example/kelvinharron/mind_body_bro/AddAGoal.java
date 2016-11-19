package com.example.kelvinharron.mind_body_bro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class AddAGoal extends AppCompatActivity
{
    Button submitGoalButton;
    public int priority;
    RadioGroup radioGroup;
    String typeOption;
    Spinner dropdown;
    String goalNameText;
    EditText addAGoalEditText;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_agoal);
        radioGroup = (RadioGroup) findViewById(R.id.priorityRadioGroup);
        addAGoalEditText = (EditText) findViewById(R.id.addAGoalEditText);
        submitGoalButton = (Button) findViewById(R.id.submitGoalButton);
        //priority=-1;




         dropdown = (Spinner) findViewById(R.id.typeSpinner);
        String[] items = new String[]{"Move", "Grow", "Bro", "Bros"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        typeOption = dropdown.getSelectedItem().toString();

        submitGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                goalNameText = addAGoalEditText.getText().toString();
                typeOption = dropdown.getSelectedItem().toString();
                Toast.makeText(AddAGoal.this, priority+" "+typeOption+" "+goalNameText, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onRadioButtonClicked(View view)
    {
        switch (view.getId()) {
            case R.id.priority1radioButton:
                priority = 1;
                break;
            case R.id.priority2radioButton:
                priority = 2;
                break;
            case R.id.priority3radioButton:
                priority = 3;
                break;

        }
       // Toast.makeText(AddAGoal.this, "lol" + priority, Toast.LENGTH_SHORT).show();
    }


}