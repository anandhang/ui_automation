package com.ant.page_objects.elementsPage;

import lombok.Getter;

public enum SubTabNames {
    TEXT_BOX("Text Box"),
    CHECK_BOX("Check Box");

    @Getter
    private String subTabName;

    SubTabNames(String subTabName) {

        this.subTabName = subTabName;
    }
}
