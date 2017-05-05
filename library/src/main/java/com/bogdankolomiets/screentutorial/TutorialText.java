package com.bogdankolomiets.screentutorial;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

public class TutorialText {
    private final String mTitle;
    private final String mText;

    public TutorialText(String title, String text) {
        mTitle = title;
        mText = text;
    }

    public TutorialText(String text) {
        this("", text);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getText() {
        return mText;
    }
}
