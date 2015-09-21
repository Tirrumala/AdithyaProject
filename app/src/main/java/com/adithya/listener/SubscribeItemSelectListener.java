package com.adithya.listener;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.adithya.R;
import com.adithya.bean.SubscribeTitleBean;

/**
 * Created by tirrumalaubuntu on 6/6/15.
 */
public class SubscribeItemSelectListener implements View.OnClickListener, AdapterView.OnItemClickListener {

    TextView categoryTextView = null;
    TextView subCategoryTextView = null;
    EditText categoryValueText = null;
    View parentRootView = null;
    String[] categories = null;

    public SubscribeItemSelectListener(View parentRootView) {
        this.parentRootView = parentRootView;
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        System.out.println("THIRUABC" + i + "  " + l);
        SubscribeTitleBean subscribeTitleBean = (SubscribeTitleBean) adapterView.getItemAtPosition(i);
        System.out.println("THIRUABC = " + subscribeTitleBean.getTitle());
        displaySubscribeItemDetailsInDialog(subscribeTitleBean);
    }

    private void displaySubscribeItemDetailsInDialog(SubscribeTitleBean subscribeTitleBean) {
        System.out.println("THIRUABC = " + parentRootView.getContext());
        final Dialog dialog = new Dialog(parentRootView.getContext());

        dialog.setTitle(subscribeTitleBean.getTitle());
        dialog.setContentView(R.layout.subscribe_dialog);

        TextView subscribeItemDetail = (TextView) dialog.findViewById(R.id.sEDetailText);
//        subscribeItemDetail.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_photos, 0, 0);
        subscribeItemDetail.setText(createDetailMessage(subscribeTitleBean));

        final Button closeButton = (Button) dialog
                .findViewById(R.id.sEDetailButton);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private String createDetailMessage(SubscribeTitleBean subscribeTitleBean) {
        StringBuffer message = new StringBuffer();

        message.append("Category::" + subscribeTitleBean.getCategory() + "\n\n");

        if (subscribeTitleBean.getSubCategory() != null && subscribeTitleBean.getSubCategory().trim().length() != 0)
            message.append("Sub-Category::" + subscribeTitleBean.getSubCategory() + "\n\n");

        message.append("Place::" + subscribeTitleBean.getPlace() + "\n\n");
        message.append("Keywords::" + subscribeTitleBean.getKeywords() + "\n\n");

        return message.toString();
    }
}