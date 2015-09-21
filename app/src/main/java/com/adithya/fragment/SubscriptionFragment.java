package com.adithya.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.adithya.R;
import com.adithya.adapter.GroupItemsListAdapter;
import com.adithya.bean.GroupListItemBean;
import com.adithya.listener.GroupItemSelectListener;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionFragment extends Fragment {

    public SubscriptionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_subscription, container, false);

        initializeListeners(rootView);

        return rootView;
    }


    private void initializeListeners(View rootView) {
        ListView listView = (ListView) rootView.findViewById(R.id.cGListView);

        List groupList = new ArrayList();
        groupList.add(new GroupListItemBean("Family", "Movie"));
        groupList.add(new GroupListItemBean("Friends", "Match"));
        groupList.add(new GroupListItemBean("Office Colleages", "Movie"));
        groupList.add(new GroupListItemBean("Travel Mates", "Match"));

        GroupItemsListAdapter adapter;
        adapter = new GroupItemsListAdapter(rootView.getContext(), R.layout.group_list_item_view, groupList);

        listView.setAdapter(adapter);

        // add  listener
        listView.setOnItemClickListener(new GroupItemSelectListener(this, rootView));
    }

}
