package com.adithya.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.listener.SubscriptionCategorySelectListener;
import com.adithya.listener.SubscriptionSubCategorySelectListener;

public class SubscribeEventFragment extends Fragment {

    public SubscribeEventFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_subscribe_event, container, false);

        //Initiliaze listeners
        initializeListeners(rootView);

        return rootView;
    }

    private void initializeListeners(View rootView) {
        TextView categeoryTextView = (TextView) rootView.findViewById(R.id.pESubscribeCategorySelectLabel);

        // add  listener
        categeoryTextView.setOnClickListener(new SubscriptionCategorySelectListener(rootView));

        TextView subCategeoryTextView = (TextView) rootView.findViewById(R.id.pESubscribeSubCategorySelectLabel);

        // add listener
        subCategeoryTextView.setOnClickListener(new SubscriptionSubCategorySelectListener(rootView));

    }
}
