package com.adithya.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.listener.CategorySelectListener;
import com.adithya.listener.PrivateGroupSelectListener;
import com.adithya.listener.SubCategorySelectListener;

public class PostEventFragment extends Fragment {

    public PostEventFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_post_event, container, false);

       //Initiliaze listeners
        initializeListeners(rootView);

        return rootView;
    }

    private void initializeListeners(View rootView )
    {
        TextView categeoryTextView = (TextView) rootView.findViewById(R.id.pECategorySelectLabel);

        // add  listener
        categeoryTextView.setOnClickListener(new CategorySelectListener(rootView));

        TextView subCategeoryTextView = (TextView) rootView.findViewById(R.id.pESubCategorySelectLabel);

        // add listener
        subCategeoryTextView.setOnClickListener(new SubCategorySelectListener(rootView));

        TextView privateGroupTextView = (TextView) rootView.findViewById(R.id.pEPrivateGroupSelectLabel);

        // add listener
        privateGroupTextView.setOnClickListener(new PrivateGroupSelectListener(rootView));
    }
}
