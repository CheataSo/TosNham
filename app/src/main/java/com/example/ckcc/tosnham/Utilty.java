package com.example.ckcc.tosnham;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.IdRes;

/**
 * Created by CKCC on 9/20/2018.
 */

public class Utilty
{
    private static void displayFragment(Fragment fragment, FragmentManager fragmentManager, @IdRes int fragmentContainer )
    {
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(fragmentContainer, fragment);
                fragmentTransaction.commit();
    }
}
