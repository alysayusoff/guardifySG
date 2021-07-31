package com.example.guardifysg;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        Spinner genderSpinner = (Spinner) getView().findViewById(R.id.genderSpinner);
        ArrayList<String> genderChoice = new ArrayList<>();
        genderChoice.add("Male");
        genderChoice.add("Female");

        Spinner ageSpinner = (Spinner) getView().findViewById(R.id.ageSpinner);
        ArrayList<String> ageGroupChoice = new ArrayList<>();
        ageGroupChoice.add("0 - 19");
        ageGroupChoice.add("20 - 24");
        ageGroupChoice.add("25 - 29");
        ageGroupChoice.add("30 - 34");
        ageGroupChoice.add("35 - 39");
        ageGroupChoice.add("40 - 44");
        ageGroupChoice.add("45 - 49");
        ageGroupChoice.add("50 - 54");
        ageGroupChoice.add("55 - 59");
        ageGroupChoice.add("60 - 64");
        ageGroupChoice.add("65 - 69");
        ageGroupChoice.add("70 and older");

        Spinner budgetSpinner = (Spinner) getView().findViewById(R.id.budgetSpinner);
        ArrayList<String> budgetChoice = new ArrayList<>();
        budgetChoice.add("$0 - $100");
        ageGroupChoice.add("$101 - $150");
        ageGroupChoice.add("$151 - $200");
        ageGroupChoice.add("$201 - $250");
        ageGroupChoice.add("$251 and above");

        Spinner coverageSpinner = (Spinner) getView().findViewById(R.id.coverageSpinner);
        ArrayList<String> coverageChoice = new ArrayList<>();
        budgetChoice.add("Cover for Hospital bills");
        ageGroupChoice.add("Cover for Accidents");
        ageGroupChoice.add("Cover for Critical Illness");
        ageGroupChoice.add("Cover for Life");

        Spinner durationSpinner = (Spinner) getView().findViewById(R.id.durationSpinner);
        ArrayList<String> durationChoice = new ArrayList<>();
        budgetChoice.add("Up to age 65");
        ageGroupChoice.add("Up to age 85");
        ageGroupChoice.add("Life Time Coverage");

        Spinner expenseSpinner = (Spinner) getView().findViewById(R.id.expenseSpinner);
        ArrayList<String> expenseChoice = new ArrayList<>();
        budgetChoice.add("$0 - $500");
        ageGroupChoice.add("$501 - $1,000");
        ageGroupChoice.add("$1,000 - $1,500");
        ageGroupChoice.add("$1,500 and above");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questionnaire_page, container, false);
    }
}
