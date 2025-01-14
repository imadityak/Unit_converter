package com.imadityak.unconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connecting the view to the java object
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView_2);
        editText = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText("The corresponding value in pounds is \n" + pound);
                Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}