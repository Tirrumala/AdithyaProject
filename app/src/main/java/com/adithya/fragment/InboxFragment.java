package com.adithya.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.adithya.R;
import com.adithya.adapter.InboxListAdapter;
import com.adithya.bean.InboxMessage;
import com.adithya.listener.InboxItemSelectListener;

import java.util.ArrayList;
import java.util.List;

public class InboxFragment extends Fragment {

    public InboxFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_inbox, container, false);

        initializeListeners(rootView);

        return rootView;
    }

    private void initializeListeners(View rootView) {
        ListView listView = (ListView) rootView.findViewById(R.id.listView);

       /* String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( rootView.getContext(),
                android.R.layout.simple_list_item_1, values);*/

        List cartoonList = new ArrayList();
        cartoonList.add(new InboxMessage("Movie at IMax,Koramangaloa,Bangalore", "Movie"));
        cartoonList.add(new InboxMessage("Cricket Match at Uppal Stadium, Hyderabad", "Match"));
        cartoonList.add(new InboxMessage("Arts at RangaShanakari,Bangalore", "Movie"));
        cartoonList.add(new InboxMessage("Exhibition at Warangal Stadium, Telangana", "Match"));

        InboxListAdapter adapter;
        adapter = new InboxListAdapter(rootView.getContext(), R.layout.inbox_list_item_view, cartoonList);

        listView.setAdapter(adapter);

        // add  listener
        listView.setOnItemClickListener(new InboxItemSelectListener(rootView));
    }


}
