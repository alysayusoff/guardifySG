package com.example.guardifysg;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.NavDirections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

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
    int cardView1Score = 0;
    int cardView2Score = 0;
    int cardView3Score = 0;
    int cardView4Score = 0;
    int cardView5Score = 0;
    int cardView6Score = 0;
    int cardView7Score = 0;
    int cardView8Score = 0;
    int cardView9Score = 0;
    int cardView10Score = 0;
    int cardView11Score = 0;
    int cardView12Score = 0;
    int cardView13Score = 0;
    int cardView14Score = 0;
    int cardView15Score = 0;
    int cardView16Score = 0;
    int cardView17Score = 0;
    int cardView18Score = 0;
    int cardView19Score = 0;
    int cardView20Score = 0;
    int cardView21Score = 0;
    int cardView22Score = 0;
    int cardView23Score = 0;
    int cardView24Score = 0;



    public policiesPage policyPage;


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
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int[] cardViewScore = {cardView1Score, cardView2Score, cardView3Score, cardView4Score, cardView5Score, cardView6Score, cardView7Score, cardView8Score, cardView9Score, cardView10Score, cardView11Score, cardView12Score,
                cardView13Score, cardView14Score, cardView15Score, cardView16Score, cardView17Score, cardView18Score, cardView19Score, cardView20Score, cardView21Score, cardView22Score, cardView23Score, cardView24Score};

        policyPage = new policiesPage();
        List<String> cardViewsList = new ArrayList<String>();

        for(int i = 0; i < cardViewScore.length; i++) {
            cardViewScore[i] = 0;
        }

        final NavController navController = Navigation.findNavController(view);

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

                // Score Reset
                for (int i = 0; i < cardViewScore.length; i++){
                    cardViewScore[i] = 0;
                }

                // Gender Value Check
                if (genderValue.equals("Male")){
                    System.out.println("Selected Gender is Male");
                } else if(genderValue.equals("Female")){
                    System.out.println("Selected Gender is Female");
                }

                // Age Value Check
                if (ageValue.equals("0 to 19")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("20 to 24")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("25 to 29")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("30 to 34")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("35 to 39")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("40 to 44")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("45 to 49")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("50 to 54")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("55 to 59")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("60 to 64")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (ageValue.equals("65 to 69")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 2 || i == 5 || i == 7 || i == 8 || i==9 || i == 11 || i == 17 || i == 18 || i  == 23){
                            System.out.println("Out of Range");
                        }else{
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                } else if (ageValue.equals("70 and older")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 2 || i == 5 || i == 7 || i == 8 || i==9 || i == 11 || i == 17 || i == 18 || i  == 23){
                            System.out.println("Out of Range");
                        }else{
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                }

                // Budget Value Check
                if (budgetValue.equals("$0 to $100")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 3 || i == 4 || i == 9 || i == 21){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }else{
                            System.out.println("Out of Range");
                        }
                    }
                } else if (budgetValue.equals("$101 to $150")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 5){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }else{
                            System.out.println("Out of Range");
                        }
                    }
                } else if (budgetValue.equals("$151 to $200")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 10 || i == 16 || i == 20){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }else{
                            System.out.println("Out of Range");
                        }
                    }
                } else if (budgetValue.equals("$201 to $250")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 1 || i == 6 || i == 18 || i == 22){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                } else if (budgetValue.equals("$250 and above")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 3 || i == 4 || i == 9 || i == 21 || i == 5 || i == 10 || i == 16 || i == 20 || i == 1 || i == 6 || i == 18 || i == 22){
                            System.out.println("Out of Range");
                        }else{
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                }

                // Coverage Value Check
                if (coverageValue.equals("Cover for Hospital Bills")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 3 || i == 7 || i == 11 || i == 15|| i == 17 || i == 22){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                } else if (coverageValue.equals("Cover for Accidents")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 1 || i == 5 || i == 9 || i == 14 || i == 18 || i == 20){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                } else if (coverageValue.equals("Cover for Critical Illness")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 0 || i == 6 || i == 8 || i == 16 || i == 21 || i == 12){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }else{
                            System.out.println("Out of Range");
                        }
                    }
                } else if (coverageValue.equals("Cover for Disability")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 2 || i == 5 || i == 10 || i == 13 || i == 19 || i == 23){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                }

                // Term Value Check
                if (termValue.equals("Up to age 65")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (termValue.equals("Up to age 85")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 2 || i == 5 || i == 7 || i == 8 || i==9 || i == 11 || i == 17 || i == 18 || i  == 23){
                            System.out.println("Out of Range");
                        }
                    }
                } else if (termValue.equals("Life Time Coverage")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 3 || i == 15 || i == 19 || i == 22){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                }

                // Expense Value Check
                if (expenseValue.equals("$0 to $500")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        cardViewScore[i] = cardViewScore[i] + 1;
                    }
                } else if (expenseValue.equals("$501 to $1,000")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 1 || i == 6 || i == 18 || i == 22 || i == 10 || i == 16 || i == 20 || i == 5 || i == 3 || i == 4 || i == 9 || i == 21){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                } else if (expenseValue.equals("$1,001 to $1,500")){
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 10 || i == 16 || i == 20 || i == 5 || i == 3 || i == 4 || i == 9 || i == 21){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                } else if (expenseValue.equals("$1,501 and above")) {
                    for(int i = 0; i < cardViewScore.length; i++){
                        if(i == 5 || i == 3 || i == 4 || i == 9 || i == 21){
                            cardViewScore[i] = cardViewScore[i] + 1;
                        }
                    }
                }

                for (int i = 0; i < cardViewScore.length; i++){
                    if(cardViewScore[i] > 3){
                        String newString = "cardView" + String.valueOf(i+1);
                        cardViewsList.add(newString);
                    }

                }

                policyPage.qnDone = true;
                policyPage.policiesRecommended = cardViewsList;

                final NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_questionnairePage_to_policiesPage);

            }
        });

    }

}
