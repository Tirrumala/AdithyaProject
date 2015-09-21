package com.adithya.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.bean.GroupListItemBean;

import java.util.List;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */

public class GroupItemsListAdapter extends ArrayAdapter {
    private List<GroupListItemBean> groupListItems;
    private Context context;

    public GroupItemsListAdapter(Context context, int textViewResourceId, List groupListItems) {
        super(context, textViewResourceId, groupListItems);
        this.context = context;
        this.groupListItems = groupListItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R.layout.group_list_item_view, null);
        }
        GroupListItemBean groupListItemBean = groupListItems.get(position);

        if (groupListItemBean != null) {
            // name
            TextView nameTextView = (TextView) view.findViewById(R.id.groupName);
            nameTextView.setText(groupListItemBean.getGroupName());

            // thumb image
            ImageView imageView = (ImageView) view.findViewById(R.id.groupImage);
            imageView.setImageResource(R.drawable.ic_launcher);
        }
        return view;
    }
}