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
public class PrivateGroupSelectListener implements View.OnClickListener {

    TextView privateGroupTextView = null;
    EditText privateGroupValueText = null;
    View parentRootView = null;
    String[] categories = null;

    public PrivateGroupSelectListener(View parentRootView) {
        this.parentRootView = parentRootView;

        //TODO this values to be fetched from Backend
        categories = parentRootView.getContext().getResources().getStringArray(R.array.privateGroupCategory);
    }

    @Override
    public void onClick(View v) {
        privateGroupTextView = (TextView) v.findViewById(R.id.pEPrivateGroupSelectLabel);
        privateGroupValueText = (EditText) parentRootView.findViewById(R.id.pEPrivateGroupSelectEditText);

        AlertDialog.Builder builderSingle = new AlertDialog.Builder(v.getContext());
        builderSingle.setIcon(R.drawable.ic_launcher);
        builderSingle.setTitle("Select Category:");

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
                        privateGroupTextView.setText(strName);
                        privateGroupValueText.setText(which + "");
                    }
                });

        builderSingle.show();
    }
}