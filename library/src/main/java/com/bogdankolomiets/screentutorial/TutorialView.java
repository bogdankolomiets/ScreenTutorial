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
    private final TutorialText mTutorialText;

    TutorialView(@IdRes int id, View view, TutorialText tutorialText) {
        mId = id;
        mView = view;
        mTutorialText = tutorialText;
    }

    @IdRes
    int getId() {
        return mId;
    }

    View getView() {
        return mView;
    }

    public TutorialText getTutorialText() {
        return mTutorialText;
    }
}
