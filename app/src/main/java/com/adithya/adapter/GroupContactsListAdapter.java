package com.adithya.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.bean.GroupContactsListBean;

import java.util.List;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */

public class GroupContactsListAdapter extends ArrayAdapter {
    private List<GroupContactsListBean> groupContactsListItems;
    private Context context;

    public GroupContactsListAdapter(Context context, int textViewResourceId, List groupContactsListItems) {
        super(context, textViewResourceId, groupContactsListItems);
        this.context = context;
        this.groupContactsListItems = groupContactsListItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R.layout.group_contacts_item_view, null);
        }
        GroupContactsListBean groupContactsListBean = groupContactsListItems.get(position);

        if (groupContactsListBean != null) {
            // name
            TextView nameTextView = (TextView) view.findViewById(R.id.groupContactName);
            nameTextView.setText(groupContactsListBean.getContactName() + "\n" + groupContactsListBean.getNumber());

            // thumb image
            ImageView photoView = (ImageView) view.findViewById(R.id.groupContactPhoto);
            photoView.setImageResource(R.drawable.ic_launcher); //TODO - roupContactsListBean.getPhoto() used

            // thumb image
            ImageView contactRemoveView = (ImageView) view.findViewById(R.id.groupContactRemove);
            contactRemoveView.setImageResource(R.drawable.ic_whats_hot); //TODO - roupContactsListBean.getPhoto() used

        }
        return view;
    }
}