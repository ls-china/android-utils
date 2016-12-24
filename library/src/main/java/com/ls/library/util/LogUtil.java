package com.ls.library.util;

/**
 * Created by wl on 2016/12/23.
 */

public abstract class LogUtil {
    public static boolean enable = true;
    public static String TAG = "__APP__";

    public static final int LEVEL_VERBOS = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_WARNING = 3;
    public static final int LEVEL_ERROR = 4;

    public static int LEVEL = LEVEL_VERBOS;

    public static void e(Object ... args) {

    }

    public static void e(String fmt, Object ... args) {

    }

    public static void e(String tag, String fmt, Object ... args) {

    }


}
