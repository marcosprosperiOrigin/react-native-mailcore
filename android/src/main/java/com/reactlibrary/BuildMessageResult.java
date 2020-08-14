package com.reactlibrary;

import androidx.core.util.Consumer;

import com.libmailcore.MessageBuilder;

public class BuildMessageResult {

    private ErrorData errorData;
    private MessageBuilder messageBuilder;

    private BuildMessageResult(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    private BuildMessageResult(String code, String message) {
        this.errorData = new ErrorData(code, message);
    }

    public void processResult(Consumer<MessageBuilder> onSuccess, Consumer<ErrorData> onError) {
        if (messageBuilder != null) {
            onSuccess.accept(messageBuilder);
        } else if (errorData != null) {
            onError.accept(errorData);
        }
    }

    public static BuildMessageResult success(MessageBuilder messageBuilder) {
        return new BuildMessageResult(messageBuilder);
    }

    public static BuildMessageResult failed(String code, String message) {
        return new BuildMessageResult(code, message);
    }

}

