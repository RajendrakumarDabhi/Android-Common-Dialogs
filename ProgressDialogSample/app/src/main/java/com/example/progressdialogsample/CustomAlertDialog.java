package com.example.progressdialogsample;

import android.app.AlertDialog;
import android.content.Context;

public class CustomAlertDialog extends AlertDialog {

    protected CustomAlertDialog(Context context) {
        super(context);
    }

    protected CustomAlertDialog(
        Context context,
        boolean cancelable,
        OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected CustomAlertDialog(Context context, int themeResId) {
        super(context, themeResId);
    }
}
