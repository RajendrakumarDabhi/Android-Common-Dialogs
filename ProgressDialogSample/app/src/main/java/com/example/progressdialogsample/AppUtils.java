package com.example.progressdialogsample;

import android.content.Context;

public class AppUtils {

    public static CustomProgressDialog showCustomProgressDialog(Context context) {
        CustomProgressDialog progressDialog = new CustomProgressDialog(context);
        progressDialog.showCustomProgressBar();
        return progressDialog;
    }
}
