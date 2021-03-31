package com.bendavey.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    EditText editTextInput;

    ImageButton buttonTemp;
    ImageButton buttonWeight;
    ImageButton buttonLength;

    TextView unitName1;
    TextView unitName2;
    TextView unitName3;

    TextView unitValue1;
    TextView unitValue2;
    TextView unitValue3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        editTextInput = findViewById(R.id.editTextInput);

        unitName1 = findViewById(R.id.unitName1);
        unitName2 = findViewById(R.id.unitName2);
        unitName3 = findViewById(R.id.unitName3);

        unitValue1 = findViewById(R.id.unitValue1);
        unitValue2 = findViewById(R.id.unitValue2);
        unitValue3 = findViewById(R.id.unitValue3);

        buttonTemp = findViewById(R.id.buttonTemp);

        buttonTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals("Celsius")) {
                    double celsius = Double.parseDouble(editTextInput.getText().toString());

                    // Fahrenheit
                    double fahrenheit = (celsius * 2) + 30;
                    unitName1.setText(R.string.fahrenheit);
                    unitName1.setVisibility(View.VISIBLE);

                    unitValue1.setText(new DecimalFormat("0.##").format(fahrenheit));
                    unitValue1.setVisibility(View.VISIBLE);

                    // Kelvin
                    double kelvin = celsius + 273.15;
                    unitName2.setText(R.string.kelvin);
                    unitName2.setVisibility(View.VISIBLE);

                    unitValue2.setText(new DecimalFormat("0.##").format(kelvin));
                    unitValue2.setVisibility(View.VISIBLE);

                    // Blank
                    unitName3.setText(R.string.blank);
                    unitName3.setVisibility(View.INVISIBLE);

                    unitValue3.setText(R.string.blank);
                    unitValue3.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Choose correct unit for conversion", Toast.LENGTH_SHORT).show();
                }
            }

        });

        buttonWeight = findViewById(R.id.buttonWeight);

        buttonWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals("Kilograms")) {
                    double kilogram = Double.parseDouble(editTextInput.getText().toString());

                    // Grams
                    double gram = kilogram * 1000;
                    unitName1.setText(R.string.gram);
                    unitName1.setVisibility(View.VISIBLE);

                    unitValue1.setText(new DecimalFormat("0.##").format(gram));
                    unitValue1.setVisibility(View.VISIBLE);

                    // Ounces
                    double ounce = kilogram * 35.274;
                    unitName2.setText(R.string.ounce);
                    unitName2.setVisibility(View.VISIBLE);

                    unitValue2.setText(new DecimalFormat("0.##").format(ounce));
                    unitValue2.setVisibility(View.VISIBLE);

                    // Pounds
                    double pound = kilogram * 2.205;
                    unitName3.setText(R.string.pound);
                    unitName3.setVisibility(View.VISIBLE);

                    unitValue3.setText(new DecimalFormat("0.##").format(pound));
                    unitValue3.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Choose correct unit for conversion", Toast.LENGTH_SHORT).show();
                }
            }

        });


        buttonLength = findViewById(R.id.buttonLength);

        buttonLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals("Metre")) {
                    double metre = Double.parseDouble(editTextInput.getText().toString());

                    // Centimetres
                    double centimetre = metre * 100;
                    unitName1.setText(R.string.centimetre);
                    unitName1.setVisibility(View.VISIBLE);

                    unitValue1.setText(new DecimalFormat("0.##").format(centimetre));
                    unitValue1.setVisibility(View.VISIBLE);

                    // Feet
                    double foot = metre * 3.281;
                    unitName2.setText(R.string.foot);
                    unitName2.setVisibility(View.VISIBLE);

                    unitValue2.setText(new DecimalFormat("0.##").format(foot));
                    unitValue2.setVisibility(View.VISIBLE);

                    // Inches
                    double inch = metre * 39.37;
                    unitName3.setText(R.string.inch);
                    unitName3.setVisibility(View.VISIBLE);

                    unitValue3.setText(new DecimalFormat("0.##").format(inch));
                    unitValue3.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Choose correct unit for conversion", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
