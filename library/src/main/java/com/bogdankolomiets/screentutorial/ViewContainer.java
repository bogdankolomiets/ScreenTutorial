package com.bogdankolomiets.screentutorial;

import android.support.annotation.IdRes;

import java.util.Collection;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

interface ViewContainer {

    void add(TutorialView view);

    void addAll(Collection<TutorialView> views);

    void clean();

    TutorialView getById(@IdRes int id) throws ViewNotFoundException;

    Collection<TutorialView> getAll();

    TutorialView getFirst();

    TutorialView getLast();
}
