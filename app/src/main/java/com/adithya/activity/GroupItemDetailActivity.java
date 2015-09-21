package com.adithya.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

import com.adithya.R;
import com.adithya.adapter.GroupContactsListAdapter;
import com.adithya.bean.GroupContactsListBean;
import com.adithya.listener.GroupContactsSelectListener;

import java.util.ArrayList;
import java.util.List;

public class GroupItemDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_item_detail);

        initializeListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_group_item_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeListeners() {
        ListView listView = (ListView) findViewById(R.id.gDlistView);

        List groupContactsList = new ArrayList();
        groupContactsList.add(new GroupContactsListBean("Thiru", "9900090900", "x"));
        groupContactsList.add(new GroupContactsListBean("ABCDE", "9900090901", "x"));
        groupContactsList.add(new GroupContactsListBean("FGHIJ", "9900090902", "x"));
        groupContactsList.add(new GroupContactsListBean("KLMN", "9900090903", "x"));
        groupContactsList.add(new GroupContactsListBean("OPQRSTUV", "9900090904", "x"));

        GroupContactsListAdapter adapter;
        adapter = new GroupContactsListAdapter(this.getApplicationContext(), R.layout.group_contacts_item_view, groupContactsList);

        listView.setAdapter(adapter);

        ImageView groupContactPhoto = (ImageView) findViewById(R.id.groupContactPhoto);
        ImageView groupContactRemove = (ImageView) findViewById(R.id.groupContactRemove);

        // add  listener
        listView.setOnItemClickListener(new GroupContactsSelectListener());
    }
}
