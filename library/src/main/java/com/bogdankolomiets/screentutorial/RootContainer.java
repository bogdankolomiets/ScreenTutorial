package com.bogdankolomiets.screentutorial;

import android.support.annotation.IdRes;
import android.support.annotation.IntegerRes;
import android.view.View;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

interface RootContainer {

    View findViewById(@IdRes int id);
}
