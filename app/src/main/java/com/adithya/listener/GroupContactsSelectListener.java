package com.adithya.listener;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by tirrumalaubuntu on 6/6/15.
 */
public class GroupContactsSelectListener implements View.OnClickListener, AdapterView.OnItemClickListener {

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        System.out.println("THIRUABC-GC" + i + "  " + l);
    }
}