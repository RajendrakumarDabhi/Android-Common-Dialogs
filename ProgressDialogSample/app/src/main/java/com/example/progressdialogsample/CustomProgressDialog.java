package com.example.progressdialogsample;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;


public class CustomProgressDialog extends AlertDialog {

    public CustomProgressDialog(Context context){
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_progress);
    }

    public void showCustomProgressBar(){
        try{
            if (!this.isShowing()) {
                create();
                setCancelable(false);
                show();
            }

        }catch (Exception ex)
        {

        }
    }
}