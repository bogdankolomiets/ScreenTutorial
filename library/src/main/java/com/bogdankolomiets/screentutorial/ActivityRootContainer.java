package com.bogdankolomiets.screentutorial;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.UiThread;
import android.view.View;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

class ActivityRootContainer implements RootContainer {
    private final Activity mActivity;

    ActivityRootContainer(Activity activity) {
        mActivity = activity;
    }

    @Override
    @UiThread
    public View findViewById(@IdRes int id) {
        return mActivity.findViewById(id);
    }

    @Override
    public Context getContainerContext() {
        return mActivity;
    }
}
