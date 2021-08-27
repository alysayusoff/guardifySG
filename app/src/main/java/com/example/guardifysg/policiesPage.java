package com.example.guardifysg;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link policiesPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class policiesPage extends Fragment {

    //GLOBAL VARS HERE
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10,
            cardView11, cardView12, cardView13, cardView14, cardView15, cardView16, cardView17, cardView18, cardView19,
            cardView20, cardView21, cardView22, cardView23, cardView24;

    String[] ciList = {"1","7","9","13","17","22"};
    String[] aList = {"2","6","10","15","19","21"};
    String[] dList = {"3","5","11","14","20","24"};
    String[] hList = {"4","8","12","16","18","23"};
    String[] fullList = {"1","7","9","13","17","22","2","6","10","15","19","21","3","5","11","14","20","24","4","8","12","16","18","23"};

    public static boolean qnDone;
    public static List<String> policiesRecommended = new ArrayList<String>();



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
        TextView refreshBtn = view.findViewById(R.id.refresh);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1,7,9,13,17,22 Crit Ill
                setAllGone();
                //card visibility
                cardView1.setVisibility(View.VISIBLE);
                cardView7.setVisibility(View.VISIBLE);
                cardView9.setVisibility(View.VISIBLE);
                cardView13.setVisibility(View.VISIBLE);
                cardView17.setVisibility(View.VISIBLE);
                cardView22.setVisibility(View.VISIBLE);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2,6,10,15,19,21 Acci
                setAllGone();
                cardView2.setVisibility(View.VISIBLE);
                cardView6.setVisibility(View.VISIBLE);
                cardView10.setVisibility(View.VISIBLE);
                cardView15.setVisibility(View.VISIBLE);
                cardView19.setVisibility(View.VISIBLE);
                cardView21.setVisibility(View.VISIBLE);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3,5,11,14,20,24 Disab
                setAllGone();
                cardView3.setVisibility(View.VISIBLE);
                cardView5.setVisibility(View.VISIBLE);
                cardView11.setVisibility(View.VISIBLE);
                cardView14.setVisibility(View.VISIBLE);
                cardView20.setVisibility(View.VISIBLE);
                cardView24.setVisibility(View.VISIBLE);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //4,8,12,16,18,23 Hosp
                setAllGone();
                cardView4.setVisibility(View.VISIBLE);
                cardView8.setVisibility(View.VISIBLE);
                cardView12.setVisibility(View.VISIBLE);
                cardView16.setVisibility(View.VISIBLE);
                cardView18.setVisibility(View.VISIBLE);
                cardView23.setVisibility(View.VISIBLE);
            }
        });

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView1.setVisibility(View.VISIBLE);
                cardView2.setVisibility(View.VISIBLE);
                cardView3.setVisibility(View.VISIBLE);
                cardView4.setVisibility(View.VISIBLE);
                cardView5.setVisibility(View.VISIBLE);
                cardView6.setVisibility(View.VISIBLE);
                cardView7.setVisibility(View.VISIBLE);
                cardView8.setVisibility(View.VISIBLE);
                cardView9.setVisibility(View.VISIBLE);
                cardView10.setVisibility(View.VISIBLE);
                cardView11.setVisibility(View.VISIBLE);
                cardView12.setVisibility(View.VISIBLE);
                cardView13.setVisibility(View.VISIBLE);
                cardView14.setVisibility(View.VISIBLE);
                cardView15.setVisibility(View.VISIBLE);
                cardView16.setVisibility(View.VISIBLE);
                cardView17.setVisibility(View.VISIBLE);
                cardView18.setVisibility(View.VISIBLE);
                cardView19.setVisibility(View.VISIBLE);
                cardView20.setVisibility(View.VISIBLE);
                cardView21.setVisibility(View.VISIBLE);
                cardView22.setVisibility(View.VISIBLE);
                cardView23.setVisibility(View.VISIBLE);
                cardView24.setVisibility(View.VISIBLE);
            }
        });

        //handlers for policies
        View.OnClickListener cardListener = new View.OnClickListener() {
            //handler TextViews
            String nameData, descData, termData, coverageData, payoutData, premiumData, costData, websiteData, contactData;
            int imgData;
            @Override
            public void onClick(View v) {
                if (cardView1.isPressed()) {
                    nameData = getString(R.string.cardTitle1);
                    descData = getString(R.string.cardDesc1);
                    termData = getString(R.string.cardTerm1);
                    coverageData = getString(R.string.cardCoverage1);
                    payoutData = getString(R.string.cardPayout1);
                    premiumData = getString(R.string.cardPremium1);
                    costData = getString(R.string.cardCost1);
                    websiteData = getString(R.string.cardWebsite1);
                    contactData = getString(R.string.cardContact1);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView2.isPressed()) {
                    nameData = getString(R.string.cardTitle2);
                    descData = getString(R.string.cardDesc2);
                    termData = getString(R.string.cardTerm2);
                    coverageData = getString(R.string.cardCoverage2);
                    payoutData = getString(R.string.cardPayout2);
                    premiumData = getString(R.string.cardPremium2);
                    costData = getString(R.string.cardCost2);
                    websiteData = getString(R.string.cardWebsite2);
                    contactData = getString(R.string.cardContact2);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView3.isPressed()) {
                    nameData = getString(R.string.cardTitle3);
                    descData = getString(R.string.cardDesc3);
                    termData = getString(R.string.cardTerm3);
                    coverageData = getString(R.string.cardCoverage3);
                    payoutData = getString(R.string.cardPayout3);
                    premiumData = getString(R.string.cardPremium3);
                    costData = getString(R.string.cardCost3);
                    websiteData = getString(R.string.cardWebsite3);
                    contactData = getString(R.string.cardContact3);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView4.isPressed()) {
                    nameData = getString(R.string.cardTitle4);
                    descData = getString(R.string.cardDesc4);
                    termData = getString(R.string.cardTerm4);
                    coverageData = getString(R.string.cardCoverage4);
                    payoutData = getString(R.string.cardPayout4);
                    premiumData = getString(R.string.cardPremium4);
                    costData = getString(R.string.cardCost4);
                    websiteData = getString(R.string.cardWebsite4);
                    contactData = getString(R.string.cardContact4);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView5.isPressed()) {
                    nameData = getString(R.string.cardTitle5);
                    descData = getString(R.string.cardDesc5);
                    termData = getString(R.string.cardTerm5);
                    coverageData = getString(R.string.cardCoverage5);
                    payoutData = getString(R.string.cardPayout5);
                    premiumData = getString(R.string.cardPremium5);
                    costData = getString(R.string.cardCost5);
                    websiteData = getString(R.string.cardWebsite5);
                    contactData = getString(R.string.cardContact5);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView6.isPressed()) {
                    nameData = getString(R.string.cardTitle6);
                    descData = getString(R.string.cardDesc6);
                    termData = getString(R.string.cardTerm6);
                    coverageData = getString(R.string.cardCoverage6);
                    payoutData = getString(R.string.cardPayout6);
                    premiumData = getString(R.string.cardPremium6);
                    costData = getString(R.string.cardCost6);
                    websiteData = getString(R.string.cardWebsite6);
                    contactData = getString(R.string.cardContact6);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView7.isPressed()) {
                    nameData = getString(R.string.cardTitle7);
                    descData = getString(R.string.cardDesc7);
                    termData = getString(R.string.cardTerm7);
                    coverageData = getString(R.string.cardCoverage7);
                    payoutData = getString(R.string.cardPayout7);
                    premiumData = getString(R.string.cardPremium7);
                    costData = getString(R.string.cardCost7);
                    websiteData = getString(R.string.cardWebsite7);
                    contactData = getString(R.string.cardContact7);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView8.isPressed()) {
                    nameData = getString(R.string.cardTitle8);
                    descData = getString(R.string.cardDesc8);
                    termData = getString(R.string.cardTerm8);
                    coverageData = getString(R.string.cardCoverage8);
                    payoutData = getString(R.string.cardPayout8);
                    premiumData = getString(R.string.cardPremium8);
                    costData = getString(R.string.cardCost8);
                    websiteData = getString(R.string.cardWebsite8);
                    contactData = getString(R.string.cardContact8);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView9.isPressed()) {
                    nameData = getString(R.string.cardTitle9);
                    descData = getString(R.string.cardDesc9);
                    termData = getString(R.string.cardTerm9);
                    coverageData = getString(R.string.cardCoverage9);
                    payoutData = getString(R.string.cardPayout9);
                    premiumData = getString(R.string.cardPremium9);
                    costData = getString(R.string.cardCost9);
                    websiteData = getString(R.string.cardWebsite9);
                    contactData = getString(R.string.cardContact9);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView10.isPressed()) {
                    nameData = getString(R.string.cardTitle10);
                    descData = getString(R.string.cardDesc10);
                    termData = getString(R.string.cardTerm10);
                    coverageData = getString(R.string.cardCoverage10);
                    payoutData = getString(R.string.cardPayout10);
                    premiumData = getString(R.string.cardPremium10);
                    costData = getString(R.string.cardCost10);
                    websiteData = getString(R.string.cardWebsite10);
                    contactData = getString(R.string.cardContact10);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView11.isPressed()) {
                    nameData = getString(R.string.cardTitle11);
                    descData = getString(R.string.cardDesc11);
                    termData = getString(R.string.cardTerm11);
                    coverageData = getString(R.string.cardCoverage11);
                    payoutData = getString(R.string.cardPayout11);
                    premiumData = getString(R.string.cardPremium11);
                    costData = getString(R.string.cardCost11);
                    websiteData = getString(R.string.cardWebsite11);
                    contactData = getString(R.string.cardContact11);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView12.isPressed()) {
                    nameData = getString(R.string.cardTitle12);
                    descData = getString(R.string.cardDesc12);
                    termData = getString(R.string.cardTerm12);
                    coverageData = getString(R.string.cardCoverage12);
                    payoutData = getString(R.string.cardPayout12);
                    premiumData = getString(R.string.cardPremium12);
                    costData = getString(R.string.cardCost12);
                    websiteData = getString(R.string.cardWebsite12);
                    contactData = getString(R.string.cardContact12);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView13.isPressed()) {
                    nameData = getString(R.string.cardTitle13);
                    descData = getString(R.string.cardDesc13);
                    termData = getString(R.string.cardTerm13);
                    coverageData = getString(R.string.cardCoverage13);
                    payoutData = getString(R.string.cardPayout13);
                    premiumData = getString(R.string.cardPremium13);
                    costData = getString(R.string.cardCost13);
                    websiteData = getString(R.string.cardWebsite13);
                    contactData = getString(R.string.cardContact13);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView14.isPressed()) {
                    nameData = getString(R.string.cardTitle14);
                    descData = getString(R.string.cardDesc14);
                    termData = getString(R.string.cardTerm14);
                    coverageData = getString(R.string.cardCoverage14);
                    payoutData = getString(R.string.cardPayout14);
                    premiumData = getString(R.string.cardPremium14);
                    costData = getString(R.string.cardCost14);
                    websiteData = getString(R.string.cardWebsite14);
                    contactData = getString(R.string.cardContact14);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView15.isPressed()) {
                    nameData = getString(R.string.cardTitle15);
                    descData = getString(R.string.cardDesc15);
                    termData = getString(R.string.cardTerm15);
                    coverageData = getString(R.string.cardCoverage15);
                    payoutData = getString(R.string.cardPayout15);
                    premiumData = getString(R.string.cardPremium15);
                    costData = getString(R.string.cardCost15);
                    websiteData = getString(R.string.cardWebsite15);
                    contactData = getString(R.string.cardContact15);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView16.isPressed()) {
                    nameData = getString(R.string.cardTitle16);
                    descData = getString(R.string.cardDesc16);
                    termData = getString(R.string.cardTerm16);
                    coverageData = getString(R.string.cardCoverage16);
                    payoutData = getString(R.string.cardPayout16);
                    premiumData = getString(R.string.cardPremium16);
                    costData = getString(R.string.cardCost16);
                    websiteData = getString(R.string.cardWebsite16);
                    contactData = getString(R.string.cardContact16);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView17.isPressed()) {
                    nameData = getString(R.string.cardTitle17);
                    descData = getString(R.string.cardDesc17);
                    termData = getString(R.string.cardTerm17);
                    coverageData = getString(R.string.cardCoverage17);
                    payoutData = getString(R.string.cardPayout17);
                    premiumData = getString(R.string.cardPremium17);
                    costData = getString(R.string.cardCost17);
                    websiteData = getString(R.string.cardWebsite17);
                    contactData = getString(R.string.cardContact17);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView18.isPressed()) {
                    nameData = getString(R.string.cardTitle18);
                    descData = getString(R.string.cardDesc18);
                    termData = getString(R.string.cardTerm18);
                    coverageData = getString(R.string.cardCoverage18);
                    payoutData = getString(R.string.cardPayout18);
                    premiumData = getString(R.string.cardPremium18);
                    costData = getString(R.string.cardCost18);
                    websiteData = getString(R.string.cardWebsite18);
                    contactData = getString(R.string.cardContact18);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView19.isPressed()) {
                    nameData = getString(R.string.cardTitle19);
                    descData = getString(R.string.cardDesc19);
                    termData = getString(R.string.cardTerm19);
                    coverageData = getString(R.string.cardCoverage19);
                    payoutData = getString(R.string.cardPayout19);
                    premiumData = getString(R.string.cardPremium19);
                    costData = getString(R.string.cardCost19);
                    websiteData = getString(R.string.cardWebsite19);
                    contactData = getString(R.string.cardContact19);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView20.isPressed()) {
                    nameData = getString(R.string.cardTitle20);
                    descData = getString(R.string.cardDesc20);
                    termData = getString(R.string.cardTerm20);
                    coverageData = getString(R.string.cardCoverage20);
                    payoutData = getString(R.string.cardPayout20);
                    premiumData = getString(R.string.cardPremium20);
                    costData = getString(R.string.cardCost20);
                    websiteData = getString(R.string.cardWebsite20);
                    contactData = getString(R.string.cardContact20);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView21.isPressed()) {
                    nameData = getString(R.string.cardTitle21);
                    descData = getString(R.string.cardDesc21);
                    termData = getString(R.string.cardTerm21);
                    coverageData = getString(R.string.cardCoverage21);
                    payoutData = getString(R.string.cardPayout21);
                    premiumData = getString(R.string.cardPremium21);
                    costData = getString(R.string.cardCost21);
                    websiteData = getString(R.string.cardWebsite21);
                    contactData = getString(R.string.cardContact21);
                    imgData = R.drawable.prudential_plc;
                }
                else if (cardView22.isPressed()) {
                    nameData = getString(R.string.cardTitle22);
                    descData = getString(R.string.cardDesc22);
                    termData = getString(R.string.cardTerm22);
                    coverageData = getString(R.string.cardCoverage22);
                    payoutData = getString(R.string.cardPayout22);
                    premiumData = getString(R.string.cardPremium22);
                    costData = getString(R.string.cardCost22);
                    websiteData = getString(R.string.cardWebsite22);
                    contactData = getString(R.string.cardContact22);
                    imgData = R.drawable.prudential_plc;
                }
                else if (cardView23.isPressed()) {
                    nameData = getString(R.string.cardTitle23);
                    descData = getString(R.string.cardDesc23);
                    termData = getString(R.string.cardTerm23);
                    coverageData = getString(R.string.cardCoverage23);
                    payoutData = getString(R.string.cardPayout23);
                    premiumData = getString(R.string.cardPremium23);
                    costData = getString(R.string.cardCost23);
                    websiteData = getString(R.string.cardWebsite23);
                    contactData = getString(R.string.cardContact23);
                    imgData = R.drawable.prudential_plc;
                }
                else if (cardView24.isPressed()) {
                    nameData = getString(R.string.cardTitle24);
                    descData = getString(R.string.cardDesc24);
                    termData = getString(R.string.cardTerm24);
                    coverageData = getString(R.string.cardCoverage24);
                    payoutData = getString(R.string.cardPayout24);
                    premiumData = getString(R.string.cardPremium24);
                    costData = getString(R.string.cardCost24);
                    websiteData = getString(R.string.cardWebsite24);
                    contactData = getString(R.string.cardContact24);
                    imgData = R.drawable.prudential_plc;
                }
                toDetailsPage(nameData, descData, termData, coverageData, payoutData, premiumData, costData, websiteData, contactData, imgData, navController);
            }
        };

        cardView1 = view.findViewById(R.id.cardView1);
        cardView1.setOnClickListener(cardListener);
        cardView2 = view.findViewById(R.id.cardView2);
        cardView2.setOnClickListener(cardListener);
        cardView3 = view.findViewById(R.id.cardView3);
        cardView3.setOnClickListener(cardListener);
        cardView4 = view.findViewById(R.id.cardView4);
        cardView4.setOnClickListener(cardListener);
        cardView5 = view.findViewById(R.id.cardView5);
        cardView5.setOnClickListener(cardListener);
        cardView6 = view.findViewById(R.id.cardView6);
        cardView6.setOnClickListener(cardListener);
        cardView7 = view.findViewById(R.id.cardView7);
        cardView7.setOnClickListener(cardListener);
        cardView8 = view.findViewById(R.id.cardView8);
        cardView8.setOnClickListener(cardListener);
        cardView9 = view.findViewById(R.id.cardView9);
        cardView9.setOnClickListener(cardListener);
        cardView10 = view.findViewById(R.id.cardView10);
        cardView10.setOnClickListener(cardListener);
        cardView11 = view.findViewById(R.id.cardView11);
        cardView11.setOnClickListener(cardListener);
        cardView12 = view.findViewById(R.id.cardView12);
        cardView12.setOnClickListener(cardListener);
        cardView13 = view.findViewById(R.id.cardView13);
        cardView13.setOnClickListener(cardListener);
        cardView14 = view.findViewById(R.id.cardView14);
        cardView14.setOnClickListener(cardListener);
        cardView15 = view.findViewById(R.id.cardView15);
        cardView15.setOnClickListener(cardListener);
        cardView16 = view.findViewById(R.id.cardView16);
        cardView16.setOnClickListener(cardListener);
        cardView17 = view.findViewById(R.id.cardView17);
        cardView17.setOnClickListener(cardListener);
        cardView18 = view.findViewById(R.id.cardView18);
        cardView18.setOnClickListener(cardListener);
        cardView19 = view.findViewById(R.id.cardView19);
        cardView19.setOnClickListener(cardListener);
        cardView20 = view.findViewById(R.id.cardView20);
        cardView20.setOnClickListener(cardListener);
        cardView21 = view.findViewById(R.id.cardView21);
        cardView21.setOnClickListener(cardListener);
        cardView22 = view.findViewById(R.id.cardView22);
        cardView22.setOnClickListener(cardListener);
        cardView23 = view.findViewById(R.id.cardView23);
        cardView23.setOnClickListener(cardListener);
        cardView24 = view.findViewById(R.id.cardView24);
        cardView24.setOnClickListener(cardListener);

        if(qnDone){
            setAllGone();
            setPoliciesRecommended(policiesRecommended);
        }

        // handlers for search
        SearchView searchview = view.findViewById(R.id.searchView);
        searchview.setQueryHint("Search for Policies");

        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
// Check for Term Coverage premium Description
                setAllGone();
                for (int i = 1; i < 25; i++){
                    if(i == 1){
                        String descDataString = getString(R.string.cardDesc1);
                        String termDataString = getString(R.string.cardTerm1);
                        String coverageDataString = getString(R.string.cardCoverage1);
                        String premiumDataString = getString(R.string.cardPremium1);
                      if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aia")){
                          cardView1.setVisibility(View.VISIBLE);
                      }
                    }

                    else if(i == 2){
                        String descDataString = getString(R.string.cardDesc2);
                        String termDataString = getString(R.string.cardTerm2);
                        String coverageDataString = getString(R.string.cardCoverage2);
                        String premiumDataString = getString(R.string.cardPremium2);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aia")){
                            cardView2.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 3){
                        String descDataString = getString(R.string.cardDesc3);
                        String termDataString = getString(R.string.cardTerm3);
                        String coverageDataString = getString(R.string.cardCoverage3);
                        String premiumDataString = getString(R.string.cardPremium3);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aia")){
                            cardView3.setVisibility(View.VISIBLE);
                        }

                    }

                    else if(i == 4){
                        String descDataString = getString(R.string.cardDesc4);
                        String termDataString = getString(R.string.cardTerm4);
                        String coverageDataString = getString(R.string.cardCoverage4);
                        String premiumDataString = getString(R.string.cardPremium4);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aia")){
                            cardView4.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 5){
                        String descDataString = getString(R.string.cardDesc5);
                        String termDataString = getString(R.string.cardTerm5);
                        String coverageDataString = getString(R.string.cardCoverage5);
                        String premiumDataString = getString(R.string.cardPremium5);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("fwd")){
                            cardView5.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 6){
                        String descDataString = getString(R.string.cardDesc6);
                        String termDataString = getString(R.string.cardTerm6);
                        String coverageDataString = getString(R.string.cardCoverage6);
                        String premiumDataString = getString(R.string.cardPremium6);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("fwd")){
                            cardView6.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 7){
                        String descDataString = getString(R.string.cardDesc7);
                        String termDataString = getString(R.string.cardTerm7);
                        String coverageDataString = getString(R.string.cardCoverage7);
                        String premiumDataString = getString(R.string.cardPremium7);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("fwd")){
                            cardView7.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 8){
                        String descDataString = getString(R.string.cardDesc8);
                        String termDataString = getString(R.string.cardTerm8);
                        String coverageDataString = getString(R.string.cardCoverage8);
                        String premiumDataString = getString(R.string.cardPremium8);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("fwd")){
                            cardView8.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 9){
                        String descDataString = getString(R.string.cardDesc9);
                        String termDataString = getString(R.string.cardTerm9);
                        String coverageDataString = getString(R.string.cardCoverage9);
                        String premiumDataString = getString(R.string.cardPremium9);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("ntuc") || newText.toLowerCase(Locale.ROOT).contains("income")){
                            cardView9.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 10){
                        String descDataString = getString(R.string.cardDesc10);
                        String termDataString = getString(R.string.cardTerm10);
                        String coverageDataString = getString(R.string.cardCoverage10);
                        String premiumDataString = getString(R.string.cardPremium10);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("ntuc") || newText.toLowerCase(Locale.ROOT).contains("income")){
                            cardView10.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 11){
                        String descDataString = getString(R.string.cardDesc11);
                        String termDataString = getString(R.string.cardTerm11);
                        String coverageDataString = getString(R.string.cardCoverage11);
                        String premiumDataString = getString(R.string.cardPremium11);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("ntuc") || newText.toLowerCase(Locale.ROOT).contains("income")){
                            cardView11.setVisibility(View.VISIBLE);
                        }

                    }

                    else if(i == 12){
                        String descDataString = getString(R.string.cardDesc12);
                        String termDataString = getString(R.string.cardTerm12);
                        String coverageDataString = getString(R.string.cardCoverage12);
                        String premiumDataString = getString(R.string.cardPremium12);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("ntuc") || newText.toLowerCase(Locale.ROOT).contains("income")){
                            cardView12.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 13){
                        String descDataString = getString(R.string.cardDesc13);
                        String termDataString = getString(R.string.cardTerm13);
                        String coverageDataString = getString(R.string.cardCoverage13);
                        String premiumDataString = getString(R.string.cardPremium13);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aviva")){
                            cardView13.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 14){
                        String descDataString = getString(R.string.cardDesc14);
                        String termDataString = getString(R.string.cardTerm14);
                        String coverageDataString = getString(R.string.cardCoverage14);
                        String premiumDataString = getString(R.string.cardPremium14);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aviva")){
                            cardView14.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 15){
                        String descDataString = getString(R.string.cardDesc15);
                        String termDataString = getString(R.string.cardTerm15);
                        String coverageDataString = getString(R.string.cardCoverage15);
                        String premiumDataString = getString(R.string.cardPremium15);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aviva")){
                            cardView15.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 16){
                        String descDataString = getString(R.string.cardDesc16);
                        String termDataString = getString(R.string.cardTerm16);
                        String coverageDataString = getString(R.string.cardCoverage16);
                        String premiumDataString = getString(R.string.cardPremium16);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("aviva")){
                            cardView16.setVisibility(View.VISIBLE);
                        }
                    }

                    if(i == 17){
                        String descDataString = getString(R.string.cardDesc17);
                        String termDataString = getString(R.string.cardTerm17);
                        String coverageDataString = getString(R.string.cardCoverage17);
                        String premiumDataString = getString(R.string.cardPremium17);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("great") || newText.toLowerCase(Locale.ROOT).contains("eastern")){
                            cardView17.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 18){
                        String descDataString = getString(R.string.cardDesc18);
                        String termDataString = getString(R.string.cardTerm18);
                        String coverageDataString = getString(R.string.cardCoverage18);
                        String premiumDataString = getString(R.string.cardPremium18);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("great") || newText.toLowerCase(Locale.ROOT).contains("eastern")){
                            cardView18.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 19){
                        String descDataString = getString(R.string.cardDesc19);
                        String termDataString = getString(R.string.cardTerm19);
                        String coverageDataString = getString(R.string.cardCoverage19);
                        String premiumDataString = getString(R.string.cardPremium19);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("great") || newText.toLowerCase(Locale.ROOT).contains("eastern")){
                            cardView19.setVisibility(View.VISIBLE);
                        }

                    }

                    else if(i == 20){
                        String descDataString = getString(R.string.cardDesc20);
                        String termDataString = getString(R.string.cardTerm20);
                        String coverageDataString = getString(R.string.cardCoverage20);
                        String premiumDataString = getString(R.string.cardPremium20);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("great") || newText.toLowerCase(Locale.ROOT).contains("eastern")){
                            cardView20.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 21){
                        String descDataString = getString(R.string.cardDesc21);
                        String termDataString = getString(R.string.cardTerm21);
                        String coverageDataString = getString(R.string.cardCoverage21);
                        String premiumDataString = getString(R.string.cardPremium21);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("prudential")){
                            cardView21.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 22){
                        String descDataString = getString(R.string.cardDesc22);
                        String termDataString = getString(R.string.cardTerm22);
                        String coverageDataString = getString(R.string.cardCoverage22);
                        String premiumDataString = getString(R.string.cardPremium22);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("prudential")){
                            cardView22.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 23){
                        String descDataString = getString(R.string.cardDesc23);
                        String termDataString = getString(R.string.cardTerm23);
                        String coverageDataString = getString(R.string.cardCoverage23);
                        String premiumDataString = getString(R.string.cardPremium23);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("prudential")){
                            cardView23.setVisibility(View.VISIBLE);
                        }
                    }

                    else if(i == 24){
                        String descDataString = getString(R.string.cardDesc24);
                        String termDataString = getString(R.string.cardTerm24);
                        String coverageDataString = getString(R.string.cardCoverage24);
                        String premiumDataString = getString(R.string.cardPremium24);
                        if(descDataString.contains(newText) || termDataString.contains(newText) || coverageDataString.contains(newText) || premiumDataString.contains(newText) || newText.toLowerCase(Locale.ROOT).contains("prudential")){
                            cardView24.setVisibility(View.VISIBLE);
                        }
                    }
                }
                return false;
            }
        });

    }

    private void toDetailsPage(String name, String desc, String term, String coverage, String payout, String premium, String cost, String website, String contact, int img, NavController nav) {
        NavDirections action = policiesPageDirections.actionPoliciesPageToDetailsPage(name, desc, term, coverage, payout, premium, cost, website, contact, img);
        nav.navigate(action);
    }

    private void setAllGone(){
        cardView1.setVisibility(View.GONE);
        cardView2.setVisibility(View.GONE);
        cardView3.setVisibility(View.GONE);
        cardView4.setVisibility(View.GONE);
        cardView5.setVisibility(View.GONE);
        cardView6.setVisibility(View.GONE);
        cardView7.setVisibility(View.GONE);
        cardView8.setVisibility(View.GONE);
        cardView9.setVisibility(View.GONE);
        cardView10.setVisibility(View.GONE);
        cardView11.setVisibility(View.GONE);
        cardView12.setVisibility(View.GONE);
        cardView13.setVisibility(View.GONE);
        cardView14.setVisibility(View.GONE);
        cardView15.setVisibility(View.GONE);
        cardView16.setVisibility(View.GONE);
        cardView17.setVisibility(View.GONE);
        cardView18.setVisibility(View.GONE);
        cardView19.setVisibility(View.GONE);
        cardView20.setVisibility(View.GONE);
        cardView21.setVisibility(View.GONE);
        cardView22.setVisibility(View.GONE);
        cardView23.setVisibility(View.GONE);
        cardView24.setVisibility(View.GONE);
    }

    private void setPoliciesRecommended(List<String> policiesRecommended){

        if(policiesRecommended.isEmpty()){
            CharSequence text = "No Products to Recommend";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(getActivity(), text, duration).show();
        }

        for(int i = 0; i < policiesRecommended.size(); i++){
            if("cardView1".equals(policiesRecommended.get(i))){
                cardView1.setVisibility(View.VISIBLE);
            }
            else if("cardView2".equals(policiesRecommended.get(i))){
                cardView2.setVisibility(View.VISIBLE);
            }
            else if("cardView3".equals(policiesRecommended.get(i))){
                cardView3.setVisibility(View.VISIBLE);
            }
            else if("cardView4".equals(policiesRecommended.get(i))){
                cardView4.setVisibility(View.VISIBLE);
            }
            else if("cardView5".equals(policiesRecommended.get(i))){
                cardView5.setVisibility(View.VISIBLE);
            }
            else if("cardView6".equals(policiesRecommended.get(i))){
                cardView6.setVisibility(View.VISIBLE);
            }
            else if("cardView7".equals(policiesRecommended.get(i))){
                cardView7.setVisibility(View.VISIBLE);
            }
            else if("cardView8".equals(policiesRecommended.get(i))){
                cardView8.setVisibility(View.VISIBLE);
            }
            else if("cardView9".equals(policiesRecommended.get(i))){
                cardView9.setVisibility(View.VISIBLE);
            }
            else if("cardView10".equals(policiesRecommended.get(i))){
                cardView10.setVisibility(View.VISIBLE);
            }
            else if("cardView11".equals(policiesRecommended.get(i))){
                cardView11.setVisibility(View.VISIBLE);
            }
            else if("cardView12".equals(policiesRecommended.get(i))){
                cardView12.setVisibility(View.VISIBLE);
            }
            else if("cardView13".equals(policiesRecommended.get(i))){
                cardView13.setVisibility(View.VISIBLE);
            }
            else if("cardView14".equals(policiesRecommended.get(i))){
                cardView14.setVisibility(View.VISIBLE);
            }
            else if("cardView15".equals(policiesRecommended.get(i))){
                cardView15.setVisibility(View.VISIBLE);
            }
            else if("cardView16".equals(policiesRecommended.get(i))){
                cardView16.setVisibility(View.VISIBLE);
            }
            else if("cardView17".equals(policiesRecommended.get(i))){
                cardView17.setVisibility(View.VISIBLE);
            }
            else if("cardView18".equals(policiesRecommended.get(i))){
                cardView18.setVisibility(View.VISIBLE);
            }
            else if("cardView19".equals(policiesRecommended.get(i))){
                cardView19.setVisibility(View.VISIBLE);
            }
            else if("cardView20".equals(policiesRecommended.get(i))){
                cardView20.setVisibility(View.VISIBLE);
            }
            else if("cardView21".equals(policiesRecommended.get(i))){
                cardView21.setVisibility(View.VISIBLE);
            }
            else if("cardView22".equals(policiesRecommended.get(i))){
                cardView22.setVisibility(View.VISIBLE);
            }
            else if("cardView23".equals(policiesRecommended.get(i))){
                cardView23.setVisibility(View.VISIBLE);
            }
            else if("cardView24".equals(policiesRecommended.get(i))){
                cardView24.setVisibility(View.VISIBLE);
            }
        }
    }
}