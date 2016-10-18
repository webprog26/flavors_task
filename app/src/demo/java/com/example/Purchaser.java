package com.example;

import android.content.Context;
import android.widget.Toast;

import com.example.webprog26.flavorsadv2.R;
import com.example.webprog26.flavorsadv2.interfaces.Purchasable;

/**
 * Created by webprog26 on 18.10.2016.
 */

public class Purchaser implements Purchasable {

    private Context mContext;

    public Purchaser(Context context) {
        this.mContext = context;
    }

    /**
     * Makes purchases available for the customer
     */
    @Override
    public void onPurchase() {
        Toast.makeText(mContext, mContext.getResources().getString(R.string.btn_click_toast), Toast.LENGTH_SHORT).show();
    }
}
