package com.example.guardifysg;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
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

import java.util.ArrayList;
import java.util.List;

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
        ImageView refreshBtn = view.findViewById(R.id.refresh);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1,7,9,13,17,22 CI
                setAllGone();
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
                //2,6,10,15,19,21 A
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
                //3,5,11,14,20,24 D
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
                //4,8,12,16,18,23 H
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
            TextView nameData, descData, termData, coverageData, payoutData, premiumData, costData, websiteData, contactData;
            int imgData;
            @Override
            public void onClick(View v) {
                if (cardView1.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle1);
                    descData = view.findViewById(R.id.cardDesc1);
                    termData = view.findViewById(R.id.cardTerm1);
                    coverageData = view.findViewById(R.id.cardCoverage1);
                    payoutData = view.findViewById(R.id.cardPayout1);
                    premiumData = view.findViewById(R.id.cardPremium1);
                    costData = view.findViewById(R.id.cardCost1);
                    websiteData = view.findViewById(R.id.cardWebsite1);
                    contactData = view.findViewById(R.id.cardContact1);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView2.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle2);
                    descData = view.findViewById(R.id.cardDesc2);
                    termData = view.findViewById(R.id.cardTerm2);
                    coverageData = view.findViewById(R.id.cardCoverage2);
                    payoutData = view.findViewById(R.id.cardPayout2);
                    premiumData = view.findViewById(R.id.cardPremium2);
                    costData = view.findViewById(R.id.cardCost2);
                    websiteData = view.findViewById(R.id.cardWebsite2);
                    contactData = view.findViewById(R.id.cardContact2);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView3.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle3);
                    descData = view.findViewById(R.id.cardDesc3);
                    termData = view.findViewById(R.id.cardTerm3);
                    coverageData = view.findViewById(R.id.cardCoverage3);
                    payoutData = view.findViewById(R.id.cardPayout3);
                    premiumData = view.findViewById(R.id.cardPremium3);
                    costData = view.findViewById(R.id.cardCost3);
                    websiteData = view.findViewById(R.id.cardWebsite3);
                    contactData = view.findViewById(R.id.cardContact3);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView4.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle4);
                    descData = view.findViewById(R.id.cardDesc4);
                    termData = view.findViewById(R.id.cardTerm4);
                    coverageData = view.findViewById(R.id.cardCoverage4);
                    payoutData = view.findViewById(R.id.cardPayout4);
                    premiumData = view.findViewById(R.id.cardPremium4);
                    costData = view.findViewById(R.id.cardCost4);
                    websiteData = view.findViewById(R.id.cardWebsite4);
                    contactData = view.findViewById(R.id.cardContact4);
                    imgData = R.drawable.aia_logo;
                }
                else if (cardView5.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle5);
                    descData = view.findViewById(R.id.cardDesc5);
                    termData = view.findViewById(R.id.cardTerm5);
                    coverageData = view.findViewById(R.id.cardCoverage5);
                    payoutData = view.findViewById(R.id.cardPayout5);
                    premiumData = view.findViewById(R.id.cardPremium5);
                    costData = view.findViewById(R.id.cardCost5);
                    websiteData = view.findViewById(R.id.cardWebsite5);
                    contactData = view.findViewById(R.id.cardContact5);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView6.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle6);
                    descData = view.findViewById(R.id.cardDesc6);
                    termData = view.findViewById(R.id.cardTerm6);
                    coverageData = view.findViewById(R.id.cardCoverage6);
                    payoutData = view.findViewById(R.id.cardPayout6);
                    premiumData = view.findViewById(R.id.cardPremium6);
                    costData = view.findViewById(R.id.cardCost6);
                    websiteData = view.findViewById(R.id.cardWebsite6);
                    contactData = view.findViewById(R.id.cardContact6);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView7.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle7);
                    descData = view.findViewById(R.id.cardDesc7);
                    termData = view.findViewById(R.id.cardTerm7);
                    coverageData = view.findViewById(R.id.cardCoverage7);
                    payoutData = view.findViewById(R.id.cardPayout7);
                    premiumData = view.findViewById(R.id.cardPremium7);
                    costData = view.findViewById(R.id.cardCost7);
                    websiteData = view.findViewById(R.id.cardWebsite7);
                    contactData = view.findViewById(R.id.cardContact7);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView8.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle8);
                    descData = view.findViewById(R.id.cardDesc8);
                    termData = view.findViewById(R.id.cardTerm8);
                    coverageData = view.findViewById(R.id.cardCoverage8);
                    payoutData = view.findViewById(R.id.cardPayout8);
                    premiumData = view.findViewById(R.id.cardPremium8);
                    costData = view.findViewById(R.id.cardCost8);
                    websiteData = view.findViewById(R.id.cardWebsite8);
                    contactData = view.findViewById(R.id.cardContact8);
                    imgData = R.drawable.fwd_car_insurance;
                }
                else if (cardView9.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle9);
                    descData = view.findViewById(R.id.cardDesc9);
                    termData = view.findViewById(R.id.cardTerm9);
                    coverageData = view.findViewById(R.id.cardCoverage9);
                    payoutData = view.findViewById(R.id.cardPayout9);
                    premiumData = view.findViewById(R.id.cardPremium9);
                    costData = view.findViewById(R.id.cardCost9);
                    websiteData = view.findViewById(R.id.cardWebsite9);
                    contactData = view.findViewById(R.id.cardContact9);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView10.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle10);
                    descData = view.findViewById(R.id.cardDesc10);
                    termData = view.findViewById(R.id.cardTerm10);
                    coverageData = view.findViewById(R.id.cardCoverage10);
                    payoutData = view.findViewById(R.id.cardPayout10);
                    premiumData = view.findViewById(R.id.cardPremium10);
                    costData = view.findViewById(R.id.cardCost10);
                    websiteData = view.findViewById(R.id.cardWebsite10);
                    contactData = view.findViewById(R.id.cardContact10);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView11.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle11);
                    descData = view.findViewById(R.id.cardDesc11);
                    termData = view.findViewById(R.id.cardTerm11);
                    coverageData = view.findViewById(R.id.cardCoverage11);
                    payoutData = view.findViewById(R.id.cardPayout11);
                    premiumData = view.findViewById(R.id.cardPremium11);
                    costData = view.findViewById(R.id.cardCost11);
                    websiteData = view.findViewById(R.id.cardWebsite11);
                    contactData = view.findViewById(R.id.cardContact11);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView12.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle12);
                    descData = view.findViewById(R.id.cardDesc12);
                    termData = view.findViewById(R.id.cardTerm12);
                    coverageData = view.findViewById(R.id.cardCoverage12);
                    payoutData = view.findViewById(R.id.cardPayout12);
                    premiumData = view.findViewById(R.id.cardPremium12);
                    costData = view.findViewById(R.id.cardCost12);
                    websiteData = view.findViewById(R.id.cardWebsite12);
                    contactData = view.findViewById(R.id.cardContact12);
                    imgData = R.drawable.ntucincome;
                }
                else if (cardView13.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle13);
                    descData = view.findViewById(R.id.cardDesc13);
                    termData = view.findViewById(R.id.cardTerm13);
                    coverageData = view.findViewById(R.id.cardCoverage13);
                    payoutData = view.findViewById(R.id.cardPayout13);
                    premiumData = view.findViewById(R.id.cardPremium13);
                    costData = view.findViewById(R.id.cardCost13);
                    websiteData = view.findViewById(R.id.cardWebsite13);
                    contactData = view.findViewById(R.id.cardContact13);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView14.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle14);
                    descData = view.findViewById(R.id.cardDesc14);
                    termData = view.findViewById(R.id.cardTerm14);
                    coverageData = view.findViewById(R.id.cardCoverage14);
                    payoutData = view.findViewById(R.id.cardPayout14);
                    premiumData = view.findViewById(R.id.cardPremium14);
                    costData = view.findViewById(R.id.cardCost14);
                    websiteData = view.findViewById(R.id.cardWebsite14);
                    contactData = view.findViewById(R.id.cardContact14);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView15.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle15);
                    descData = view.findViewById(R.id.cardDesc15);
                    termData = view.findViewById(R.id.cardTerm15);
                    coverageData = view.findViewById(R.id.cardCoverage15);
                    payoutData = view.findViewById(R.id.cardPayout15);
                    premiumData = view.findViewById(R.id.cardPremium15);
                    costData = view.findViewById(R.id.cardCost15);
                    websiteData = view.findViewById(R.id.cardWebsite15);
                    contactData = view.findViewById(R.id.cardContact15);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView16.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle16);
                    descData = view.findViewById(R.id.cardDesc16);
                    termData = view.findViewById(R.id.cardTerm16);
                    coverageData = view.findViewById(R.id.cardCoverage16);
                    payoutData = view.findViewById(R.id.cardPayout16);
                    premiumData = view.findViewById(R.id.cardPremium16);
                    costData = view.findViewById(R.id.cardCost16);
                    websiteData = view.findViewById(R.id.cardWebsite16);
                    contactData = view.findViewById(R.id.cardContact16);
                    imgData = R.drawable.aviva_cloud;
                }
                else if (cardView17.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle17);
                    descData = view.findViewById(R.id.cardDesc17);
                    termData = view.findViewById(R.id.cardTerm17);
                    coverageData = view.findViewById(R.id.cardCoverage17);
                    payoutData = view.findViewById(R.id.cardPayout17);
                    premiumData = view.findViewById(R.id.cardPremium17);
                    costData = view.findViewById(R.id.cardCost17);
                    websiteData = view.findViewById(R.id.cardWebsite17);
                    contactData = view.findViewById(R.id.cardContact17);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView18.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle18);
                    descData = view.findViewById(R.id.cardDesc18);
                    termData = view.findViewById(R.id.cardTerm18);
                    coverageData = view.findViewById(R.id.cardCoverage18);
                    payoutData = view.findViewById(R.id.cardPayout18);
                    premiumData = view.findViewById(R.id.cardPremium18);
                    costData = view.findViewById(R.id.cardCost18);
                    websiteData = view.findViewById(R.id.cardWebsite18);
                    contactData = view.findViewById(R.id.cardContact18);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView19.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle19);
                    descData = view.findViewById(R.id.cardDesc19);
                    termData = view.findViewById(R.id.cardTerm19);
                    coverageData = view.findViewById(R.id.cardCoverage19);
                    payoutData = view.findViewById(R.id.cardPayout19);
                    premiumData = view.findViewById(R.id.cardPremium19);
                    costData = view.findViewById(R.id.cardCost19);
                    websiteData = view.findViewById(R.id.cardWebsite19);
                    contactData = view.findViewById(R.id.cardContact19);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView20.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle20);
                    descData = view.findViewById(R.id.cardDesc20);
                    termData = view.findViewById(R.id.cardTerm20);
                    coverageData = view.findViewById(R.id.cardCoverage20);
                    payoutData = view.findViewById(R.id.cardPayout20);
                    premiumData = view.findViewById(R.id.cardPremium20);
                    costData = view.findViewById(R.id.cardCost20);
                    websiteData = view.findViewById(R.id.cardWebsite20);
                    contactData = view.findViewById(R.id.cardContact20);
                    imgData = R.drawable.great_eastern_logo;
                }
                else if (cardView21.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle21);
                    descData = view.findViewById(R.id.cardDesc21);
                    termData = view.findViewById(R.id.cardTerm21);
                    coverageData = view.findViewById(R.id.cardCoverage21);
                    payoutData = view.findViewById(R.id.cardPayout21);
                    premiumData = view.findViewById(R.id.cardPremium21);
                    costData = view.findViewById(R.id.cardCost21);
                    websiteData = view.findViewById(R.id.cardWebsite21);
                    contactData = view.findViewById(R.id.cardContact21);
                    imgData = R.drawable.prudential_plc;
                }
                else if (cardView22.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle22);
                    descData = view.findViewById(R.id.cardDesc22);
                    termData = view.findViewById(R.id.cardTerm22);
                    coverageData = view.findViewById(R.id.cardCoverage22);
                    payoutData = view.findViewById(R.id.cardPayout22);
                    premiumData = view.findViewById(R.id.cardPremium22);
                    costData = view.findViewById(R.id.cardCost22);
                    websiteData = view.findViewById(R.id.cardWebsite22);
                    contactData = view.findViewById(R.id.cardContact22);
                    imgData = R.drawable.prudential_plc;
                }
                else if (cardView23.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle23);
                    descData = view.findViewById(R.id.cardDesc23);
                    termData = view.findViewById(R.id.cardTerm23);
                    coverageData = view.findViewById(R.id.cardCoverage23);
                    payoutData = view.findViewById(R.id.cardPayout23);
                    premiumData = view.findViewById(R.id.cardPremium23);
                    costData = view.findViewById(R.id.cardCost23);
                    websiteData = view.findViewById(R.id.cardWebsite23);
                    contactData = view.findViewById(R.id.cardContact23);
                    imgData = R.drawable.prudential_plc;
                }
                else if (cardView24.isPressed()) {
                    nameData = view.findViewById(R.id.cardTitle24);
                    descData = view.findViewById(R.id.cardDesc24);
                    termData = view.findViewById(R.id.cardTerm24);
                    coverageData = view.findViewById(R.id.cardCoverage24);
                    payoutData = view.findViewById(R.id.cardPayout24);
                    premiumData = view.findViewById(R.id.cardPremium24);
                    costData = view.findViewById(R.id.cardCost24);
                    websiteData = view.findViewById(R.id.cardWebsite24);
                    contactData = view.findViewById(R.id.cardContact24);
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
    }

    private void toDetailsPage(TextView name, TextView desc, TextView term, TextView coverage, TextView payout, TextView premium, TextView cost, TextView website, TextView contact, int img, NavController nav) {
        NavDirections action = policiesPageDirections.actionPoliciesPageToDetailsPage(name.getText().toString(),
                desc.getText().toString(), term.getText().toString(), coverage.getText().toString(),
                payout.getText().toString(), premium.getText().toString(), cost.getText().toString(),
                website.getText().toString(), contact.getText().toString(), img);
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