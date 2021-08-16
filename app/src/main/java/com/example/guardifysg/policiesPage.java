package com.example.guardifysg;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link policiesPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class policiesPage extends Fragment {

    //GLOBAL VARS HERE
    CardView cardView1, cardView2;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public policiesPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment policiesPage.
     */
    // TODO: Rename and change types and number of parameters
    public static policiesPage newInstance(String param1, String param2) {
        policiesPage fragment = new policiesPage();
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
        return inflater.inflate(R.layout.fragment_policies_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //navController
        final NavController navController = Navigation.findNavController(view);

        //handlers for filter
        ImageView imgBtn1 = view.findViewById(R.id.typeCriticalIllness);
        ImageView imgBtn2 = view.findViewById(R.id.typeAccident);
        ImageView imgBtn3 = view.findViewById(R.id.typeDisability);
        ImageView imgBtn4 = view.findViewById(R.id.typeHospitalisation);
        imgBtn1.setOnClickListener(typeListener);
        imgBtn2.setOnClickListener(typeListener);
        imgBtn3.setOnClickListener(typeListener);
        imgBtn4.setOnClickListener(typeListener);

        //handlers for policies
        View.OnClickListener cardListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardView1.isPressed()) {
                    TextView nameData = view.findViewById(R.id.cardTitle1);
                    TextView descData = view.findViewById(R.id.cardDesc1);
                    TextView termData = view.findViewById(R.id.cardTerm1);
                    TextView coverageData = view.findViewById(R.id.cardCoverage1);
                    TextView payoutData = view.findViewById(R.id.cardPayout1);
                    TextView premiumData = view.findViewById(R.id.cardPremium1);
                    TextView costData = view.findViewById(R.id.cardCost1);
                    TextView websiteData = view.findViewById(R.id.cardWebsite1);
                    TextView contactData = view.findViewById(R.id.cardContact1);
                    NavDirections action = policiesPageDirections.actionPoliciesPageToDetailsPage(
                            nameData.getText().toString(),
                            descData.getText().toString(),
                            termData.getText().toString(),
                            coverageData.getText().toString(),
                            payoutData.getText().toString(),
                            premiumData.getText().toString(),
                            costData.getText().toString(),
                            websiteData.getText().toString(),
                            contactData.getText().toString());
                    navController.navigate(action);
                }
                else if (cardView2.isPressed()) {
                    TextView nameData = view.findViewById(R.id.cardTitle2);
                    TextView descData = view.findViewById(R.id.cardDesc2);
                    TextView termData = view.findViewById(R.id.cardTerm2);
                    TextView coverageData = view.findViewById(R.id.cardCoverage2);
                    TextView payoutData = view.findViewById(R.id.cardPayout2);
                    TextView premiumData = view.findViewById(R.id.cardPremium2);
                    TextView costData = view.findViewById(R.id.cardCost2);
                    TextView websiteData = view.findViewById(R.id.cardWebsite2);
                    TextView contactData = view.findViewById(R.id.cardContact2);
                    NavDirections action = policiesPageDirections.actionPoliciesPageToDetailsPage(
                            nameData.getText().toString(),
                            descData.getText().toString(),
                            termData.getText().toString(),
                            coverageData.getText().toString(),
                            payoutData.getText().toString(),
                            premiumData.getText().toString(),
                            costData.getText().toString(),
                            websiteData.getText().toString(),
                            contactData.getText().toString());
                    navController.navigate(action);
                }
            }
        };

        cardView1 = view.findViewById(R.id.cardView1);
        cardView1.setOnClickListener(cardListener);
        cardView2 = view.findViewById(R.id.cardView2);
        cardView2.setOnClickListener(cardListener);
    }

    private View.OnClickListener typeListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(getContext(), "Image clicked", Toast.LENGTH_SHORT).show();
        }
    };
}