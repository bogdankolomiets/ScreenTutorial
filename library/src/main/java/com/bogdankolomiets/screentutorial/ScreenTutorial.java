package com.bogdankolomiets.screentutorial;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

public class ScreenTutorial {
    private final RootContainer mRootContainer;
    private final ViewContainer mViewContainer;

    private ScreenTutorial(Builder builder) {
        mRootContainer = builder.mRootContainer;
        mViewContainer = builder.mViewContainer;
    }

    public static class Builder {
        private RootContainer mRootContainer;
        private ViewContainer mViewContainer;

    }
}
