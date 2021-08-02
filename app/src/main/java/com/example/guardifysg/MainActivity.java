package com.example.guardifysg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //navbar codes
        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);
        final NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        final NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(navView, navController);

        // Questionnaire Spinner Codes (Gender)
        Spinner genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this, R.array.gender_array, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        // Questionnaire Spinner Codes (Age Group)
        Spinner ageSpinner = (Spinner) findViewById(R.id.ageSpinner);
        ArrayAdapter<CharSequence> ageAdapter = ArrayAdapter.createFromResource(this, R.array.age_array, android.R.layout.simple_spinner_item);
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(ageAdapter);

        // Questionnaire Spinner Codes (Budget)
        Spinner budgetSpinner = (Spinner) findViewById(R.id.budgetSpinner);
        ArrayAdapter<CharSequence> budgetAdapter = ArrayAdapter.createFromResource(this, R.array.budget_array, android.R.layout.simple_spinner_item);
        budgetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(budgetAdapter);

        // Questionnaire Spinner Codes (Coverage)
        Spinner coverageSpinner = (Spinner) findViewById(R.id.coverageSpinner);
        ArrayAdapter<CharSequence> coverageAdapter = ArrayAdapter.createFromResource(this, R.array.coverage_array, android.R.layout.simple_spinner_item);
        coverageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(coverageAdapter);

        // Questionnaire Spinner Codes (Term)
        Spinner termSpinner = (Spinner) findViewById(R.id.durationSpinner);
        ArrayAdapter<CharSequence> termAdapter = ArrayAdapter.createFromResource(this, R.array.term_array, android.R.layout.simple_spinner_item);
        termAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(termAdapter);

        // Questionnaire Spinner Codes (Expense)
        Spinner expenseSpinner = (Spinner) findViewById(R.id.expenseSpinner);
        ArrayAdapter<CharSequence> expenseAdapter = ArrayAdapter.createFromResource(this, R.array.expense_array, android.R.layout.simple_spinner_item);
        expenseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(expenseAdapter);

        //topbar (logo codes)
        ImageView backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Back button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void handleSelection(View view) {
        Toast.makeText(this, "Image clicked", Toast.LENGTH_SHORT).show();
    }
}