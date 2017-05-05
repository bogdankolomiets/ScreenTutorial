package com.bogdankolomiets.screentutorial;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

class TutorialProcessorImpl implements TutorialProcessor {
    private final ViewContainer mViewContainer;
    private final RootContainer mRootContainer;

    TutorialProcessorImpl(RootContainer rootContainer, ViewContainer viewContainer) {
        mRootContainer = rootContainer;
        mViewContainer = viewContainer;
    }
}
