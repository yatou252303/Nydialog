package com.nuoyuan.utils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.nuoyuan.utils.adapter.InnerWaitPayment;
import com.nuoyuan.utils.adapter.ListAdapter;
import com.nuoyuan.utils.utils.DialogUtils;
import com.nuoyuan.utils.utils.NyDialog;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 圆角
     *
     * @param view
     */
    public void dialog(View view) {
        DialogUtils.modelOne(this);
    }

    /**
     * 圆角 不吸边
     *
     * @param view
     */
    public void dialog1(View view) {

        DialogUtils.modelTwo(this);
    }


    /**
     * list方式
     *
     * @param view
     */
    public void listDialog(View view) {
        ArrayList<InnerWaitPayment> dealList = new ArrayList<>();
        InnerWaitPayment innerWaitPayment = new InnerWaitPayment();
        for (int i = 0; i < 15; i++) {
            try {
                InnerWaitPayment clone = innerWaitPayment.clone();
                clone.Paykey = "ddddd";
                clone.payValue = "dddd" + i;
                dealList.add(clone);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        }
        DialogUtils.modelThree(this, dealList);

    }
}
