package sg.edu.rp.c346.id21018812.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCred;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCred = findViewById(R.id.textViewCred);
        tvVenue = findViewById(R.id.textViewVenue);
        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Code");
        if (moduleSelected.trim().equalsIgnoreCase("C218")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: " + intentReceived.getStringExtra("Name"));
            tvYear.setText("Academic Year: " + intentReceived.getStringExtra("Year"));
            tvSem.setText("Semester: " + intentReceived.getStringExtra("Sem"));
            tvCred.setText("Module Credit: " + intentReceived.getStringExtra("Cred"));
            tvVenue.setText("Venue: " + intentReceived.getStringExtra("Venue"));
        } else if (moduleSelected.trim().equalsIgnoreCase("C206")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: " + intentReceived.getStringExtra("Name"));
            tvYear.setText("Academic Year: " + intentReceived.getStringExtra("Year"));
            tvSem.setText("Semester: " + intentReceived.getStringExtra("Sem"));
            tvCred.setText("Module Credit: " + intentReceived.getStringExtra("Cred"));
            tvVenue.setText("Venue: " + intentReceived.getStringExtra("Venue"));
        } else if (moduleSelected.trim().equalsIgnoreCase("C346")) {            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: " + intentReceived.getStringExtra("Name"));
            tvYear.setText("Academic Year: " + intentReceived.getStringExtra("Year"));
            tvSem.setText("Semester: " + intentReceived.getStringExtra("Sem"));
            tvCred.setText("Module Credit: " + intentReceived.getStringExtra("Cred"));
            tvVenue.setText("Venue: " + intentReceived.getStringExtra("Venue"));
        } else if (moduleSelected.trim().equalsIgnoreCase("C203")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: " + intentReceived.getStringExtra("Name"));
            tvYear.setText("Academic Year: " + intentReceived.getStringExtra("Year"));
            tvSem.setText("Semester: " + intentReceived.getStringExtra("Sem"));
            tvCred.setText("Module Credit: " + intentReceived.getStringExtra("Cred"));
            tvVenue.setText("Venue: " + intentReceived.getStringExtra("Venue"));
        } else if (moduleSelected.trim().equalsIgnoreCase("C235")) {
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: " + intentReceived.getStringExtra("Name"));
            tvYear.setText("Academic Year: " + intentReceived.getStringExtra("Year"));
            tvSem.setText("Semester: " + intentReceived.getStringExtra("Sem"));
            tvCred.setText("Module Credit: " + intentReceived.getStringExtra("Cred"));
            tvVenue.setText("Venue: " + intentReceived.getStringExtra("Venue"));
        }
    }
}