package com.bogdankolomiets.screentutorial;

import android.support.annotation.IdRes;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

class TutorialView {
    private final @IdRes int mId;

    TutorialView(@IdRes int id) {
        mId = id;
    }

    @IdRes int getId() {
        return mId;
    }
}
