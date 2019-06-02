package com.example.tiny4412_led_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean led_on = false;
    private Button button = null;
    private CheckBox checkBoxLED1 = null;
    private CheckBox checkBoxLED2 = null;
    private CheckBox checkBoxLED3 = null;
    private CheckBox checkBoxLED4 = null;

    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            led_on = !led_on;
            if(led_on) {
                button.setText("ALL OFF");
                checkBoxLED1.setChecked(true);
                checkBoxLED2.setChecked(true);
                checkBoxLED3.setChecked(true);
                checkBoxLED4.setChecked(true);
            } else {
                button.setText("ALL ON");
                checkBoxLED1.setChecked(false);
                checkBoxLED2.setChecked(false);
                checkBoxLED3.setChecked(false);
                checkBoxLED4.setChecked(false);
            }
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_id_led1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED1 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_id_led2:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED2 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED2 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_id_led3:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED3 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED3 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_id_led4:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED4 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED4 off", Toast.LENGTH_SHORT).show();
                }
                break;
            // TODO: Veggie sandwich
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_id);
        checkBoxLED1 = (CheckBox) findViewById(R.id.checkbox_id_led1);
        checkBoxLED2 = (CheckBox) findViewById(R.id.checkbox_id_led2);
        checkBoxLED3 = (CheckBox) findViewById(R.id.checkbox_id_led3);
        checkBoxLED4 = (CheckBox) findViewById(R.id.checkbox_id_led4);

        button.setOnClickListener(new MyButtonListener());

/*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                led_on = !led_on;
                if(led_on) {
                    button.setText("ALL OFF");
                } else {
                    button.setText("ALL ON");
                }
            }
        });
*/
    }
}
