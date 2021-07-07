package com.sayan.digitallibrary;


import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class CreditDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Credits")
                .setMessage("Sayan Maiti\nCSE/17/18\nUni. Roll.: 10700117025")
                .setPositiveButton("OK", (dialog, which) -> {
                });
        return builder.create();
    }
}
