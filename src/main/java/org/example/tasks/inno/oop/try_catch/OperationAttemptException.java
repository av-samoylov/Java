package org.example.tasks.inno.oop.try_catch;

public class OperationAttemptException extends Exception {
    public OperationAttemptException() {
        super();
    }

    public OperationAttemptException(String message) {
        super(message);
    }

    public OperationAttemptException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationAttemptException(Throwable cause) {
        super(cause);
    }

    protected OperationAttemptException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
