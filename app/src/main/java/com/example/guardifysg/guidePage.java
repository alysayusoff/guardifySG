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
        insuranceBasicsTitles.add(new PolicyGuide("Who needs insurance?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget faucibus risus. In hac habitasse platea dictumst. Fusce dignissim sem suscipit fermentum consectetur.", true));
        insuranceBasicsTitles.add(new PolicyGuide("Why should anyone have insurance?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget faucibus risus. In hac habitasse platea dictumst. Fusce dignissim sem suscipit fermentum consectetur.", false));
        insuranceBasicsTitles.add(new PolicyGuide("When should I get insurance?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget faucibus risus. In hac habitasse platea dictumst. Fusce dignissim sem suscipit fermentum consectetur.", false));
        insuranceBasicsTitles.add(new PolicyGuide("What do I need to know before purchasing an insurance policy?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget faucibus risus. In hac habitasse platea dictumst. Fusce dignissim sem suscipit fermentum consectetur.", false));
        insuranceBasicsTitles.add(new PolicyGuide("How do I make sure I am purchasing the right insurance for me and/or my loved ones?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget faucibus risus. In hac habitasse platea dictumst. Fusce dignissim sem suscipit fermentum consectetur.", true));
        insuranceBasicsTitles.add(new PolicyGuide("Where can I purchase insurance?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget faucibus risus. In hac habitasse platea dictumst. Fusce dignissim sem suscipit fermentum consectetur.", false));
    }

    private void initRecyclerView() {
        guideAdapter = new GuideAdapter(insuranceBasicsTitles);
        recyclerView.setAdapter(guideAdapter);
    }
}