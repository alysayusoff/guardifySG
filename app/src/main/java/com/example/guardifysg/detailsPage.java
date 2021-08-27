package com.example.guardifysg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

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
        View detailsView = inflater.inflate(R.layout.fragment_details_page, container, false);
        recyclerView = detailsView.findViewById(R.id.recyclerView);

        String term = detailsPageArgs.fromBundle(getArguments()).getTerm();
        String coverage = detailsPageArgs.fromBundle(getArguments()).getCoverage();
        String payout = detailsPageArgs.fromBundle(getArguments()).getPayout();
        String premium = detailsPageArgs.fromBundle(getArguments()).getPremium();
        String cost = detailsPageArgs.fromBundle(getArguments()).getCost();
        String website = detailsPageArgs.fromBundle(getArguments()).getWebsite();
        String contact = detailsPageArgs.fromBundle(getArguments()).getContact();
        String contactDetails = website + "\n" + contact;

        policyDetailsList =  new ArrayList<>();
        policyDetailsList.add(new PolicyDetail("Term", term, false));
        policyDetailsList.add(new PolicyDetail("Coverage", coverage, true));
        policyDetailsList.add(new PolicyDetail("Payout", payout, true));
        policyDetailsList.add(new PolicyDetail("Premium Type", premium, false));
        policyDetailsList.add(new PolicyDetail("Premium Cost", cost, false));
        policyDetailsList.add(new PolicyDetail("Contact Us", contactDetails, false));

        initRecyclerView();

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        return detailsView;
    }

    private void initRecyclerView() {
        // constructor for RecyclerAdaptor
        recyclerAdapter = new DetailsAdapter(policyDetailsList);
        recyclerView.setAdapter(recyclerAdapter);
    }

    //alysa added function here
    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String title = detailsPageArgs.fromBundle(getArguments()).getPolicyName();
        TextView frag1title = view.findViewById(R.id.policyName);
        frag1title.setText(title);

        int img = detailsPageArgs.fromBundle(getArguments()).getLogo();
        ImageView frag1img = view.findViewById(R.id.companyLogo);
        frag1img.setImageResource(img);

        String desc = detailsPageArgs.fromBundle(getArguments()).getPolicyDesc();
        TextView frag1desc = view.findViewById(R.id.policyDesc);
        frag1desc.setText(desc);
    }
}