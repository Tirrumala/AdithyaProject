package com.adithya.listener;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;

import com.adithya.activity.GroupItemDetailActivity;
import com.adithya.fragment.SubscriptionFragment;

/**
 * Created by tirrumalaubuntu on 6/6/15.
 */
public class GroupItemSelectListener implements View.OnClickListener, AdapterView.OnItemClickListener {

    SubscriptionFragment subscriptionFragment;
    TextView categoryTextView = null;
    TextView subCategoryTextView = null;
    EditText categoryValueText = null;
    View parentRootView = null;
    String[] categories = null;

    public GroupItemSelectListener(SubscriptionFragment subscriptionFragment, View parentRootView) {
        this.parentRootView = parentRootView;
        this.subscriptionFragment = subscriptionFragment;
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        System.out.println("THIRUABC" + i + "  " + l);
        Intent groupDetailIntent = new Intent(subscriptionFragment.getActivity(), GroupItemDetailActivity.class);
        System.out.println("THIRUABC" + subscriptionFragment.getActivity() + "  " + groupDetailIntent);
        subscriptionFragment.startActivity(groupDetailIntent);
        System.out.println("THIRUABC started activity");
        subscriptionFragment.getActivity().overridePendingTransition(0, 0);
    }
}