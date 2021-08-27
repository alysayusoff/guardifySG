package com.example.guardifysg;

public class PolicyGuide {
    private String title;
    private String description;
    private boolean expanded;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public PolicyGuide(String title, String description, boolean expanded) {
        this.title = title;
        this.description = description;
        this.expanded = expanded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "PolicyGuide{" +
                "title='" + title + '\'' +
                ", description='" + description +
                '}';
    }
}
