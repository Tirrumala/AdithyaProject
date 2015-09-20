package com.adithya.listener;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.adithya.R;

/**
 * Created by tirrumalaubuntu on 6/6/15.
 */
public class SubscriptionSubCategorySelectListener implements View.OnClickListener {

    TextView subCategoryTextView = null;
    EditText categoryValueText = null;
    EditText subCategoryValueText = null;
    View parentRootView = null;

    public SubscriptionSubCategorySelectListener(View parentRootView) {
        this.parentRootView = parentRootView;
    }

    public static int getSubCategory(int position) {

        int itemId;
        switch (position) {
            case 0:
                itemId = R.array.itemsSubCategoryEntertainment;
                break;
            case 1:
                itemId = R.array.itemsSubCategoryBar;
                break;
            case 2:
                itemId = R.array.itemsSubCategoryTravel;
                break;
            default:
                itemId = 0;
        }

        return itemId;
    }

    @Override
    public void onClick(View v) {
        subCategoryTextView = (TextView) v.findViewById(R.id.pESubscribeSubCategorySelectLabel);
        categoryValueText = (EditText) parentRootView.findViewById(R.id.pESubscribeCategorySelectEditText);
        subCategoryValueText = (EditText) parentRootView.findViewById(R.id.pESubscribeCategorySelectEditText);

        AlertDialog.Builder builderSingle = new AlertDialog.Builder(v.getContext());
        builderSingle.setIcon(R.drawable.ic_launcher);
        builderSingle.setTitle("Select SubCategory:");

        int index = Integer.parseInt(categoryValueText.getText().toString());
        System.out.println("THIRUMAY index " + index);

        String[] categories = parentRootView.getContext().getResources().getStringArray(getSubCategory(index));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_singlechoice);

        for (int i = 0; i < categories.length; i++) {
            System.out.println("THIRUMAY items " + categories[i]);
            arrayAdapter.add(categories[i]);
        }

        builderSingle.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        builderSingle.setAdapter(arrayAdapter,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String strName = arrayAdapter.getItem(which);
                        System.out.println("THIRUMAY: " + strName);
                        subCategoryTextView.setText(strName);
                        subCategoryValueText.setText(which + "");
                    }
                });

        builderSingle.show();
    }
}