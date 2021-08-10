package com.example.guardifysg;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.transition.Slide;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link landingPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class landingPage extends Fragment {
    SliderView sliderView;
    int[] images={R.drawable.aia_logo,R.drawable.covid_icon,R.drawable.cancer};

    // MODIFIED GLOBAL VARIABLES HERE
    ConstraintLayout news1, news2, news3, news4, news5;
    //

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public landingPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment landingPage.
     */
    // TODO: Rename and change types and number of parameters
    public static landingPage newInstance(String param1, String param2) {
        landingPage fragment = new landingPage();
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
        return inflater.inflate(R.layout.fragment_landing_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      
        //ching chieh image carousell
        sliderView=view.findViewById(R.id.image_slider);
        SliderAdapter sliderAdapter=new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
      
        //navController code
        final NavController navController = Navigation.findNavController(view);
        //open questionnairePage code
        ImageView btnQuestionnaire = view.findViewById(R.id.questionnaireButton);
        btnQuestionnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_landingPage_to_questionnairePage);
            }
        });
        //open newsPage code
        View.OnClickListener checker = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (news1.isPressed()) {
                    TextView titleData = v.findViewById(R.id.newsTitle);
                    TextView descData = v.findViewById(R.id.newsLongDesc);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData.getText().toString(), descData.getText().toString());
                    navController.navigate(action);
                }
                if (news2.isPressed()) {
                    TextView titleData = v.findViewById(R.id.newsTitle2);
                    TextView descData = v.findViewById(R.id.newsLongDesc2);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData.getText().toString(), descData.getText().toString());
                    navController.navigate(action);
                }
                if (news3.isPressed()) {
                    TextView titleData = v.findViewById(R.id.newsTitle3);
                    TextView descData = v.findViewById(R.id.newsLongDesc3);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData.getText().toString(), descData.getText().toString());
                    navController.navigate(action);
                }
                if (news4.isPressed()) {
                    TextView titleData = v.findViewById(R.id.newsTitle4);
                    TextView descData = v.findViewById(R.id.newsLongDesc4);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData.getText().toString(), descData.getText().toString());
                    navController.navigate(action);
                }
                if (news5.isPressed()) {
                    TextView titleData = v.findViewById(R.id.newsTitle5);
                    TextView descData = v.findViewById(R.id.newsLongDesc5);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData.getText().toString(), descData.getText().toString());
                    navController.navigate(action);
                }
            }
        };

        news1 = view.findViewById(R.id.newsContainer);
        news2 = view.findViewById(R.id.newsContainer2);
        news3 = view.findViewById(R.id.newsContainer3);
        news4 = view.findViewById(R.id.newsContainer4);
        news5 = view.findViewById(R.id.newsContainer5);
        news1.setOnClickListener(checker);
        news2.setOnClickListener(checker);
        news3.setOnClickListener(checker);
        news4.setOnClickListener(checker);
        news5.setOnClickListener(checker);
    }
}