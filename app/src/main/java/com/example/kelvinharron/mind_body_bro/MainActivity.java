package com.example.kelvinharron.mind_body_bro;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText goalEditText = (EditText) findViewById(R.id.goalEditText);
        goalEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (i == KeyEvent.KEYCODE_ENTER)) {

                    Toast.makeText(MainActivity.this, goalEditText.getText(), Toast.LENGTH_SHORT).show();
                    // HERE WE GET THE TEXT VALUE, NEED TO USE INTENT TO PASS TO ADD NEW GOAL ACTIVITY
                    Intent addNewGoalIntent = new Intent(MainActivity.this, AddAGoal.class);
                    addNewGoalIntent.putExtra("GoalText", goalEditText.getText().toString());

                    startActivity(addNewGoalIntent);
                    return true;
                }
                return false;
            }
        });
    }
}
