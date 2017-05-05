package com.bogdankolomiets.screentutorial;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

class FragmentRootContainer implements RootContainer {
    private final Fragment mFragment;

    FragmentRootContainer(Fragment fragment) {
        mFragment = fragment;
    }

    @Override
    public View findViewById(@IdRes int id) {
        return null;
    }
}
