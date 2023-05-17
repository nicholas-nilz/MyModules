package sg.edu.rp.c346.id22014726.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Modules extends AppCompatActivity {

    TextView code;
    TextView information;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        Log.d("Modules", "onCreate() called.");

        code = findViewById(R.id.Code);
        information = findViewById(R.id.Modinfo);
        btnBack = findViewById(R.id.back);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleCode");

        if(moduleCode.equals("C218")) {
            code.setText("C218");
            information.setText("Module Code: C218\nModule Name: UI/UX Design For Apps\nAcademic Year: 2023\n" +
                    "Semester: 1\nModule Credit: 4\nVenue: W65C");
        }
        else if (moduleCode.equals("C203")) {
            code.setText("C203");
            information.setText("Module Code: C203\nModule Name: Web Appln Development in php\nAcademic Year: 2023\n" +
                    "Semester: 1\nModule Credit: 4\nVenue: W65C");
        }
        else if (moduleCode.equals("C206")) {
            code.setText("C206");
            information.setText("Module Code: C206\nModule Name: Software Development Process\nAcademic Year: 2023\n" +
                    "Semester: 1\nModule Credit: 4\nVenue: W65C");
        }
        else if (moduleCode.equals("C235")) {
            code.setText("C235");
            information.setText("Module Code: C235\nModule Name: IT Security and Management\nAcademic Year: 2023\n" +
                    "Semester: 1\nModule Credit: 4\nVenue: W65C");
        }
        else if (moduleCode.equals("C346")) {
            code.setText("C346");
            information.setText("Module Code: C346\nModule Name: Mobile App Development\nAcademic Year: 2023\n" +
                    "Semester: 1\nModule Credit: 4\nVenue: W65C");
        }
        else if (moduleCode.equals("G953")) {
            code.setText("G953");
            information.setText("Module Code: G953\nModule Name: Life Skills III \nAcademic Year: 2023\n" +
                    "Semester: 1\nModule Credit: 4\nVenue: HB02");
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


    @Override
    protected void onStart() {
        Log.d("Modules", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("Modules", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("Modules", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("Modules", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Modules", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("Modules", "onRestart() called.");
        super.onRestart();
    }
}