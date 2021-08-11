package com.example.guardifysg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link detailsPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class detailsPage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    DetailsAdapter recyclerAdapter;

    List<PolicyDetail> policyDetailsList;

    public detailsPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment detailsPage.
     */
    // TODO: Rename and change types and number of parameters
    public static detailsPage newInstance(String param1, String param2) {
        detailsPage fragment = new detailsPage();
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
        // setContentView(R.layout.fragment_details_page);
        View detailsView = inflater.inflate(R.layout.fragment_details_page, container, false);
        recyclerView = detailsView.findViewById(R.id.recyclerView);

        initData();
        initRecyclerView();

        // add divider between each detail
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        return detailsView;
    }

    private void initRecyclerView() {
        // constructor for RecyclerAdaptor
        recyclerAdapter = new DetailsAdapter(policyDetailsList);
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void initData(){
        policyDetailsList =  new ArrayList<>();
        policyDetailsList.add(new PolicyDetail("Description", "Offers premium refund for 43 Major illnesses, relapse as well as mental illness. Comes with optional add-ons to cover up to 104 other illnesses."));
        policyDetailsList.add(new PolicyDetail("Term", "Up to age 85 or minimum of 30 Years whichever is earlier."));
        policyDetailsList.add(new PolicyDetail("Coverage", "1) Major Critical Illness & Relapse (43 Major Illness\n" +
                "\n" +
                "2) Multistage Critical Illness (Early/Intermediate/Major)\n" +
                "\n" +
                "3) Mental Illness\n"));
        policyDetailsList.add(new PolicyDetail("Payout", "1) Up to 200% of coverage amount for 43 major critical illnesses or 5 rediagnosed/recurring illnesses.\n" +
                "\n" +
                "2) Up to $350,000 for early, intermediate, and major critical illnesses until age 75 when add-on Early Critical Cover Extra Rider.\n" +
                "\n" +
                "3) 100% of premium paid will be refunded at the end of policy.\n" +
                "\n" +
                "4) Up to 20% of coverage amount (up to $50,000 per claim) up to age 75 for 5 prominent Mental Illnesses.\n" +
                "\n" +
                "5) Death Benefit: 100% of the coverage amount paid in one lump sum after minusing any CI claims.\n" +
                "\n" +
                "6) Compassionate benefit: $10,000\n" +
                "\n" +
                "7) Health Screening Benefit: Up to $200 reimbursement for health screening."));
        policyDetailsList.add(new PolicyDetail("Premium Type", "Annually"));
        policyDetailsList.add(new PolicyDetail("Premium Cost", "N/A"));

    }



}