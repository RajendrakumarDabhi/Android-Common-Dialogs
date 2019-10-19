package com.example.progressdialogsample;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.progressdialogsample.AppUtils.showCustomProgressDialog;

public class BaseActivity extends AppCompatActivity {
    private CustomProgressDialog mCustomProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void showProgress(boolean isVisible) {
        if (isVisible) {
            mCustomProgressDialog = showCustomProgressDialog(this);
        } else {
            if(mCustomProgressDialog.isShowing())
            {
                mCustomProgressDialog.dismiss();
            }
        }
    }

}
