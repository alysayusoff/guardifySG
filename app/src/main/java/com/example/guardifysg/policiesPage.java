package com.example.guardifysg;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link policiesPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class policiesPage extends Fragment {

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

        //navigation
        final NavController navController = Navigation.findNavController(view);
        ConstraintLayout dynamicPolicy = view.findViewById(R.id.containerDynamicPolicy);
        dynamicPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_policiesPage_to_detailsPage);
            }
        });

        //handlers for filter
        ImageView imgBtn1 = view.findViewById(R.id.typeCriticalIllness);
        ImageView imgBtn2 = view.findViewById(R.id.typeAccident);
        ImageView imgBtn3 = view.findViewById(R.id.typeDisability);
        ImageView imgBtn4 = view.findViewById(R.id.typeHospitalisation);
        imgBtn1.setOnClickListener(typeListener);
        imgBtn2.setOnClickListener(typeListener);
        imgBtn3.setOnClickListener(typeListener);
        imgBtn4.setOnClickListener(typeListener);
    }

    private View.OnClickListener typeListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(getContext(), "Image clicked", Toast.LENGTH_SHORT).show();
        }
    };
}