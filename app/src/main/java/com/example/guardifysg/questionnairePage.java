package com.example.guardifysg;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link questionnairePage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class questionnairePage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public questionnairePage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment questionnairePage.
     */
    // TODO: Rename and change types and number of parameters
    public static questionnairePage newInstance(String param1, String param2) {
        questionnairePage fragment = new questionnairePage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questionnaire_page, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Questionnaire Spinner Codes (Gender)
        Spinner genderSpinner = (Spinner) getView().findViewById(R.id.genderSpinner);
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(genderSpinner.getContext() , R.array.gender_array, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        // Questionnaire Spinner Codes (Age Group)
        Spinner ageSpinner = (Spinner) getView().findViewById(R.id.ageSpinner);
        ArrayAdapter<CharSequence> ageAdapter = ArrayAdapter.createFromResource(ageSpinner.getContext(), R.array.age_array, android.R.layout.simple_spinner_item);
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(ageAdapter);

        // Questionnaire Spinner Codes (Budget)
        Spinner budgetSpinner = (Spinner) getView().findViewById(R.id.budgetSpinner);
        ArrayAdapter<CharSequence> budgetAdapter = ArrayAdapter.createFromResource(budgetSpinner.getContext(), R.array.budget_array, android.R.layout.simple_spinner_item);
        budgetAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        budgetSpinner.setAdapter(budgetAdapter);

        // Questionnaire Spinner Codes (Coverage)
        Spinner coverageSpinner = (Spinner) getView().findViewById(R.id.coverageSpinner);
        ArrayAdapter<CharSequence> coverageAdapter = ArrayAdapter.createFromResource(coverageSpinner.getContext(), R.array.coverage_array, android.R.layout.simple_spinner_item);
        coverageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coverageSpinner.setAdapter(coverageAdapter);

        // Questionnaire Spinner Codes (Term)
        Spinner termSpinner = (Spinner) getView().findViewById(R.id.durationSpinner);
        ArrayAdapter<CharSequence> termAdapter = ArrayAdapter.createFromResource(termSpinner.getContext(), R.array.term_array, android.R.layout.simple_spinner_item);
        termAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        termSpinner.setAdapter(termAdapter);

        // Questionnaire Spinner Codes (Expense)
        Spinner expenseSpinner = (Spinner) getView().findViewById(R.id.expenseSpinner);
        ArrayAdapter<CharSequence> expenseAdapter = ArrayAdapter.createFromResource(expenseSpinner.getContext(), R.array.expense_array, android.R.layout.simple_spinner_item);
        expenseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        expenseSpinner.setAdapter(expenseAdapter);

        Button submitButton = getView().findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genderValue = genderSpinner.getSelectedItem().toString();
                String ageValue = ageSpinner.getSelectedItem().toString();
                String budgetValue = budgetSpinner.getSelectedItem().toString();
                String coverageValue = coverageSpinner.getSelectedItem().toString();
                String termValue = termSpinner.getSelectedItem().toString();
                String expenseValue = expenseSpinner.getSelectedItem().toString();

                // Gender Value Check
                if (genderValue.equals("Male")){
                    System.out.println("Selected Gender is Male");
                } else if(genderValue.equals("Female")){
                    System.out.println("Selected Gender is Female");
                }

                // Age Value Check
                if (ageValue.equals("0 to 19")){
                    System.out.println("Selected Age Group is 0 to 19");
                } else if (ageValue.equals("20 to 24")) {
                    System.out.println("Selected Age Group is 20 to 24");
                } else if (ageValue.equals("25 to 29")) {
                    System.out.println("Selected Age Group is 25 to 29");
                } else if (ageValue.equals("30 to 34")) {
                    System.out.println("Selected Age Group is 30 to 34");
                } else if (ageValue.equals("35 to 39")) {
                    System.out.println("Selected Age Group is 35 to 39");
                } else if (ageValue.equals("40 to 44")) {
                    System.out.println("Selected Age Group is 40 to 44");
                } else if (ageValue.equals("45 to 49")) {
                    System.out.println("Selected Age Group is 45 to 49");
                } else if (ageValue.equals("50 to 54")) {
                    System.out.println("Selected Age Group is 50 to 54");
                } else if (ageValue.equals("55 to 59")) {
                    System.out.println("Selected Age Group is 55 to 59");
                } else if (ageValue.equals("60 to 64")) {
                    System.out.println("Selected Age Group is 60 to 64");
                } else if (ageValue.equals("65 to 69")) {
                    System.out.println("Selected Age Group is 65 to 69");
                } else if (ageValue.equals("70 and older")) {
                    System.out.println("Selected Age Group is 70 and older");
                }

                // Budget Value Check
                if (budgetValue.equals("$0 to $100")){
                    System.out.println("Selected Budget is $0 to $100");
                } else if (budgetValue.equals("$101 to $150")){
                    System.out.println("Selected Budget is $101 to $150");
                } else if (budgetValue.equals("$151 to $200")){
                    System.out.println("Selected Budget is $151 to $200");
                } else if (budgetValue.equals("$201 to $250")){
                    System.out.println("Selected Budget is $201 to $250");
                } else if (budgetValue.equals("$250 and above")){
                    System.out.println("Selected Budget is $250 and above");
                }

                // Coverage Value Check
                if (coverageValue.equals("Cover for Hospital Bills")){
                    System.out.println("Selected Coverage is Cover for Hospital Bills");
                } else if (coverageValue.equals("Cover for Accidents")){
                    System.out.println("Selected Coverage is Cover for Accidents");
                } else if (coverageValue.equals("Cover for Critical Illness")){
                    System.out.println("Selected Coverage is Cover For Critical Illness");
                } else if (coverageValue.equals("Cover for Life")){
                    System.out.println("Selected Coverage is Cover for Life");
                }

                // Term Value Check
                if (termValue.equals("Up to age 65")){
                    System.out.println("Selected Term is Up to age 65");
                } else if (termValue.equals("Up to age 85")){
                    System.out.println("Selected Term is Up to age 85");
                } else if (termValue.equals("Life Time Coverage")){
                    System.out.println("Selected Term is Life Time Coverage");
                }

                // Expense Value Check
                if (expenseValue.equals("$0 to $500")){
                    System.out.println("Selected Expense is $0 to $500");
                } else if (expenseValue.equals("$501 to $1,000")){
                    System.out.println("Selected Expense is $501 to $1,000");
                } else if (expenseValue.equals("$1,001 to $1,500")){
                    System.out.println("Selected Expense is $1,001 to $1,500");
                } else if (expenseValue.equals("$1,501 and above")) {
                    System.out.println("Selected Expense is $1,501 and above");
                }

            }
        });

    }

}
