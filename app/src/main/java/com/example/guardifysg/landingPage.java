package com.example.guardifysg;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
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
import android.widget.Button;
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
    int[] images={R.drawable.image_from_ios_67,R.drawable.greateastern_covid_plan,R.drawable.news5};

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
      
        //image carousel
        SliderAdapter sliderAdapter= new SliderAdapter(images);
        sliderView = view.findViewById(R.id.image_slider);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
      
        //navController code
        final NavController navController = Navigation.findNavController(view);

        //open questionnairePage code
        Button btnQuestionnaire = view.findViewById(R.id.questionnaireButton);
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
                String titleData, descData, readData, websiteData;
                int imgData;
                if (news1.isPressed()) {
                    imgData = R.drawable.image_from_ios_67;
                    titleData = getString(R.string.artTitle1);
                    descData = getString(R.string.artLongDesc1);
                    readData = getString(R.string.artMin1);
                    websiteData = getString(R.string.artFull1);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData, descData, imgData, readData, websiteData);
                    navController.navigate(action);
                }
                if (news2.isPressed()) {
                    imgData = R.drawable.ntuc_dude;
                    titleData = getString(R.string.artTitle2);
                    descData = getString(R.string.artLongDesc2);
                    readData = getString(R.string.artMin2);
                    websiteData = getString(R.string.artFull2);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData, descData, imgData, readData, websiteData);
                    navController.navigate(action);
                }
                if (news3.isPressed()) {
                    imgData = R.drawable.greateastern_covid_plan;
                    titleData = getString(R.string.artTitle3);
                    descData = getString(R.string.artLongDesc3);
                    readData = getString(R.string.artMin3);
                    websiteData = getString(R.string.artFull3);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData, descData, imgData, readData, websiteData);
                    navController.navigate(action);
                }
                if (news4.isPressed()) {
                    imgData = R.drawable.news4;
                    titleData = getString(R.string.artTitle4);
                    descData = getString(R.string.artLongDesc4);
                    readData = getString(R.string.artMin4);
                    websiteData = getString(R.string.artFull4);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData, descData, imgData, readData, websiteData);
                    navController.navigate(action);
                }
                if (news5.isPressed()) {
                    imgData = R.drawable.news5;
                    titleData = getString(R.string.artTitle5);
                    descData = getString(R.string.artLongDesc5);
                    readData = getString(R.string.artMin5);
                    websiteData = getString(R.string.artFull5);
                    NavDirections action = landingPageDirections.actionLandingPageToNewsPage(titleData, descData, imgData, readData, websiteData);
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