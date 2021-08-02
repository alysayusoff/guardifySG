package com.example.guardifysg;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questionnaire_page, container, false);
    }
}
