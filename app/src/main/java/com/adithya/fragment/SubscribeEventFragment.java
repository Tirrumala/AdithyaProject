package com.adithya.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.adapter.SubscribeListAdapter;
import com.adithya.bean.SubscribeTitleBean;
import com.adithya.listener.SubscribeItemSelectListener;
import com.adithya.listener.SubscriptionCategorySelectListener;
import com.adithya.listener.SubscriptionSubCategorySelectListener;

import java.util.ArrayList;
import java.util.List;

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


        ListView listView = (ListView) rootView.findViewById(R.id.sElistView);

        List subscribeItemsList = new ArrayList();
        subscribeItemsList.add(new SubscribeTitleBean("Movie at Bangalore", "Entertainment", "Movie", "Bangalore", "IMax,Koramangaloa"));
        subscribeItemsList.add(new SubscribeTitleBean("Cricket Match", "Entertainment", "Match", "Hyderabad", "Uppal Stadium"));
        subscribeItemsList.add(new SubscribeTitleBean("My Namma Arts", "Entertainment", "Arts", "Bangalore", "RangaShanakari"));
        subscribeItemsList.add(new SubscribeTitleBean("Exhibition", "Entertainment", null, "Telangana", " Warangal Stadium,"));

        SubscribeListAdapter adapter;
        adapter = new SubscribeListAdapter(rootView.getContext(), R.layout.subscribe_list_item_view, subscribeItemsList);

        listView.setAdapter(adapter);

        // add  listener
        listView.setOnItemClickListener(new SubscribeItemSelectListener(rootView));

    }
}
