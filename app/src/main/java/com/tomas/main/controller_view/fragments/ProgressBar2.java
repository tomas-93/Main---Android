package com.tomas.main.controller_view.fragments;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;

import com.tomas.main.R;

public class ProgressBar2 extends Fragment
{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private Handler handler;
    private String mParam1;
    private String mParam2;

    private ProgressBar progressBar1;
    private ProgressBar progressBar2;


    private Button button;



    public ProgressBar2()
    {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProgressBar2.
     */
    // TODO: Rename and change types and number of parameters
    public static ProgressBar2 newInstance(String param1, String param2)
    {
        ProgressBar2 fragment = new ProgressBar2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_progress_bar, container, false);
        this.progressBar1= (ProgressBar) rootView.findViewById(R.id.progressBar1);
        this.progressBar2 = (ProgressBar) rootView.findViewById(R.id.progressBar2);


        this.button = (Button) rootView.findViewById(R.id.button1);
        this.handler = new Handler();
        this.button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // see this max value coming back here, we animale towards that value
                //ObjectAnimator animation = ObjectAnimator.ofInt (progressBar2, "progress", 400, 500);
                //animation.setDuration (5000); //in milliseconds
                //animation.setInterpolator (new DecelerateInterpolator());
                //animation.start ();
            }
        });




        return rootView;
    }

}
