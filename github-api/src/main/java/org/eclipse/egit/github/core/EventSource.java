package org.eclipse.egit.github.core;

public class EventSource {
    private String type;

    private Issue issue;

    public String getType() {
        return type;
    }

    public EventSource setType(String type) {
        this.type = type;
        return this;
    }

    public Issue getIssue() {
        return issue;
    }

    public EventSource setIssue(Issue issue) {
        this.issue = issue;
        return this;
    }
}
