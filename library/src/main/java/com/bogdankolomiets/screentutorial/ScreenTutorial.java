package com.bogdankolomiets.screentutorial;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

public class ScreenTutorial {
    private final RootContainer mRootContainer;
    private final ViewContainer mViewContainer;
    private final TutorialProcessor mTutorialProcessor;

    private ScreenTutorial(Builder builder) {
        mRootContainer = builder.mRootContainer;
        mViewContainer = builder.mViewContainer;
        mTutorialProcessor = builder.mTutorialProcessor;
    }

    public static class Builder {
        private RootContainer mRootContainer;
        private ViewContainer mViewContainer;
        private TutorialProcessor mTutorialProcessor;

        public Builder(Activity activity) {
            if (activity == null) {
                throw new IllegalArgumentException("Activity can not be null");
            }
            mRootContainer = new ActivityRootContainer(activity);
        }

        public Builder(Fragment fragment) {
            if (fragment == null) {
                throw new IllegalArgumentException("Fragment can not be null");
            }
            mRootContainer = new FragmentRootContainer(fragment);
        }
    }
}
