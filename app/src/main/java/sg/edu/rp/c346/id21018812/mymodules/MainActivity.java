package sg.edu.rp.c346.id21018812.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvD1;
    TextView tvD2;
    TextView tvD3;
    TextView tvD4;
    TextView tvD5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvD1 = findViewById(R.id.textViewD1);
        tvD2 = findViewById(R.id.textViewD2);
        tvD3 = findViewById(R.id.textViewD3);
        tvD4 = findViewById(R.id.textViewD4);
        tvD5 = findViewById(R.id.textViewD5);

        tvD1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Code", "C218");
                intent.putExtra("Name", "UI/UX Design for Apps");
                intent.putExtra("Year", "2022");
                intent.putExtra("Sem", "1");
                intent.putExtra("Cred", "4");
                intent.putExtra("Venue", "E66B");
                startActivity(intent);
            }
        });

        tvD2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Code", "C206");
                intent.putExtra("Name", "Software Development Process");
                intent.putExtra("Year", "2022");
                intent.putExtra("Sem", "1");
                intent.putExtra("Cred", "4");
                intent.putExtra("Venue", "E66K");
                startActivity(intent);
            }
        });

        tvD3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Mobile App Development");
                intent.putExtra("Year", "2022");
                intent.putExtra("Sem", "1");
                intent.putExtra("Cred", "4");
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });

        tvD4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Code", "C203");
                intent.putExtra("Name", "Web Appln Development in php");
                intent.putExtra("Year", "2022");
                intent.putExtra("Sem", "1");
                intent.putExtra("Cred", "4");
                intent.putExtra("Venue", "W65H");
                startActivity(intent);
            }
        });

        tvD5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Code", "C235");
                intent.putExtra("Name", "IT Security and Management");
                intent.putExtra("Year", "2022");
                intent.putExtra("Sem", "1");
                intent.putExtra("Cred", "4");
                intent.putExtra("Venue", "E65H");
                startActivity(intent);
            }
        });
    }
}