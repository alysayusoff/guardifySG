package com.example.guardifysg;

public class PolicyDetail {
    private String detailTitle;
    private String detailText;
    private boolean expanded;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public PolicyDetail(String detailTitle, String detailText) {
        this.detailTitle = detailTitle;
        this.detailText = detailText;
        this.expanded = false;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    public String toString(){
        return "PolicyDetails{" +
                "detailTitle='" + detailTitle + '\'' +
                ", detailText='" + detailText +
                '}';
    }

}
