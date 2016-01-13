package com.vincit.go.task.slack.model;

public class Property {

    private String value;

    public Property() {
    }

    public Property(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getValueOr(String other) {
        if (value != null) {
            return value;
        } else {
            return other;
        }
    }
}