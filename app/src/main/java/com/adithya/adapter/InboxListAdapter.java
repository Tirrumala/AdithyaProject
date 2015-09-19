package com.adithya.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.bean.InboxMessage;

import java.util.List;

/**
 * Created by thiru.kunamalla on 9/19/2015.
 */

public class InboxListAdapter extends ArrayAdapter {
    private List<InboxMessage> cartoonItems;
    private Context context;

    public InboxListAdapter(Context context, int textViewResourceId, List cartoonItems) {
        super(context, textViewResourceId, cartoonItems);
        this.context = context;
        this.cartoonItems = cartoonItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R.layout.inbox_list_item_view, null);
        }
        InboxMessage cartoon = cartoonItems.get(position);

        if (cartoon != null) {
            // name
            TextView nameTextView = (TextView) view.findViewById(R.id.subject);
            nameTextView.setText(cartoon.getSubject());

            // thumb image
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            imageView.setImageResource(R.drawable.ic_whats_hot);
        }
        return view;
    }
}