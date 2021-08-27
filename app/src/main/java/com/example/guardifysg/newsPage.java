package com.example.guardifysg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.Reference;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link newsPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class newsPage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public newsPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment newsPage.
     */
    // TODO: Rename and change types and number of parameters
    public static newsPage newInstance(String param1, String param2) {
        newsPage fragment = new newsPage();
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
        return inflater.inflate(R.layout.fragment_news_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String artTitle = newsPageArgs.fromBundle(getArguments()).getNews();
        TextView frag1Title = view.findViewById(R.id.newsTitle);
        frag1Title.setText(artTitle);

        String artDesc = newsPageArgs.fromBundle(getArguments()).getDesc();
        TextView frag1Desc = view.findViewById(R.id.newsContent);
        frag1Desc.setText(artDesc);

        int artImg = newsPageArgs.fromBundle(getArguments()).getImage();
        ImageView frag1Img = view.findViewById(R.id.newsImage);
        frag1Img.setImageResource(artImg);

        String artRead = newsPageArgs.fromBundle(getArguments()).getRead();
        TextView frag1Read = view.findViewById(R.id.minRead);
        frag1Read.setText(artRead);

        String artWeb = newsPageArgs.fromBundle(getArguments()).getWebsite();
        TextView frag1Web = view.findViewById(R.id.fullart);
        frag1Web.setText(artWeb);
    }
}