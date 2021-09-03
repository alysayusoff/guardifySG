package com.example.guardifysg;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link guidePage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class guidePage extends Fragment {

    //GLOBAL VARS HERE
    RecyclerView recyclerView;
    GuideAdapter guideAdapter;
    List<PolicyGuide> insuranceBasicsTitles;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public guidePage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment guidePage.
     */
    // TODO: Rename and change types and number of parameters
    public static guidePage newInstance(String param1, String param2) {
        guidePage fragment = new guidePage();
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
        View v = inflater.inflate(R.layout.fragment_guide_page, container, false);
        recyclerView = v.findViewById(R.id.guiderecycler);
        initData();
        initRecyclerView();
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.requireContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        return v;
    }

    private void initData() {
        insuranceBasicsTitles = new ArrayList<>();
        insuranceBasicsTitles.add(new PolicyGuide("Who needs insurance?", "Insurance serves to protect the interest of the policyholders. Depending on the type of insurance, insurance companies may pay for medical bills and/or provide financial assistance should anything happen to the policyholders.", true));
        insuranceBasicsTitles.add(new PolicyGuide("Why should anyone have insurance?", "People who are looking at different stages of their lives may want to look into some financial planning for different purposes. Insurance can help policyholders set aside a sum of money for future use, or subsidise hospital bills.", false));
        insuranceBasicsTitles.add(new PolicyGuide("When should I get insurance?", "It is never too early or too late to purchase insurance. Most importantly, explore different insurances to find the most suitable one for your needs.", false));
        insuranceBasicsTitles.add(new PolicyGuide("What do I need to know before purchasing an insurance policy?", "It is important to know the purpose of the insurance and understanding your own needs. This will help you locate a suitable insurance easier.", false));
        insuranceBasicsTitles.add(new PolicyGuide("How do I make sure I am purchasing the right insurance for me and/or my loved ones?", "We provide all the information stated in the insurances provided by their respective companies. While we aim to provide the insurance information to the best of our efforts, if there are still any doubts, please do not hesitate to contact an insurance agent from the respective insurance companies for clarification.", true));
        insuranceBasicsTitles.add(new PolicyGuide("Where can I purchase insurance?", "Please contact an insurance agent from the respective insurance companies to book an appointment for the purchase.", false));
    }

    private void initRecyclerView() {
        guideAdapter = new GuideAdapter(insuranceBasicsTitles);
        recyclerView.setAdapter(guideAdapter);
    }
}