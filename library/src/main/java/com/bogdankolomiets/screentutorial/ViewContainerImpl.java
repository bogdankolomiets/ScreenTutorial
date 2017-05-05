package com.bogdankolomiets.screentutorial;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

class ViewContainerImpl implements ViewContainer {
    private final SparseArray<TutorialView> mViews;

    ViewContainerImpl() {
        mViews = new SparseArray<>();
    }

    @Override
    public void add(TutorialView view) {
        mViews.put(view.getId(), view);
    }

    @Override
    public void addAll(Collection<TutorialView> views) {
        for (TutorialView view : views) {
            mViews.put(view.getId(), view);
        }
    }

    @Override
    public void clean() {
        mViews.clear();
    }

    @Override
    public TutorialView getById(@IdRes int id) throws ViewNotFoundException {
        TutorialView result = mViews.get(id);
        if (result == null)
            throw new ViewNotFoundException("View with provided id does not found");
        return result;
    }

    @Override
    public Collection<TutorialView> getAll() {
        List<TutorialView> result = new ArrayList<>();
        for (int i = 0; i < mViews.size(); i++) {
            result.add(mViews.valueAt(i));
        }
        return result;
    }

    @Override
    @Nullable
    public TutorialView getFirst() {
        int size = mViews.size();
        if (size == 0) {
            return null;
        }
        return mViews.get(0);
    }

    @Override
    @Nullable
    public TutorialView getLast() {
        int size = mViews.size();
        if (size == 0) {
            return null;
        }
        return mViews.get(size - 1);
    }
}
