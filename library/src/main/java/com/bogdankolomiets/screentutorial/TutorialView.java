package com.bogdankolomiets.screentutorial;

import android.support.annotation.IdRes;
import android.view.View;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

class TutorialView {
    private final int mId;
    private final View mView;

    TutorialView(@IdRes int id, View view) {
        mId = id;
        mView = view;
    }

    @IdRes
    int getId() {
        return mId;
    }

    View getView() {
        return mView;
    }
}
