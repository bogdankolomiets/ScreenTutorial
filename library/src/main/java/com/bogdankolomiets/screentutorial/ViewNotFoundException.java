package com.bogdankolomiets.screentutorial;

/**
 * @author bogdan
 * @version 1
 * @date 05.05.17
 */

public class ViewNotFoundException extends RuntimeException {

    public ViewNotFoundException() {
        super();
    }

    public ViewNotFoundException(String message) {
        super(message);
    }

    public ViewNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ViewNotFoundException(Throwable cause) {
        super(cause);
    }

    protected ViewNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
