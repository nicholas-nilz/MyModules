package sg.edu.rp.c346.id22014726.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC218;
    TextView tvC203;
    TextView tvC206;
    TextView tvC235;
    TextView tvC346;
    TextView tvG953;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");

        tvC218 = findViewById(R.id.C218);
        tvC203 = findViewById(R.id.C203);
        tvC206 = findViewById(R.id.C206);
        tvC235 = findViewById(R.id.C235);
        tvC346 = findViewById(R.id.C346);
        tvG953 = findViewById(R.id.G953);

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("ModuleCode", "C218");
                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("ModuleCode", "C203");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("ModuleCode", "C206");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("ModuleCode", "C235");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);
            }
        });

        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("ModuleCode", "G953");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }
}