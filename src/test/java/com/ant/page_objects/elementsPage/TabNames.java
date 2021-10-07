package com.ant.page_objects.elementsPage;

import lombok.Getter;

public enum TabNames {
    ELEMENT("Elements"),
    FORMS("Forms"),
    ALERTS_FORMS_AND_WINDOWS("Alerts, Frame & Windows"),
    WIDGETS("Widgets"),
    INTERACTIONS("Interactions"),
    BOOKS_STORE_APPLICATION("Book Store Application");

    @Getter
    private String TabNames;

    TabNames(String TabNames) {
        this.TabNames = TabNames;
    }
}
