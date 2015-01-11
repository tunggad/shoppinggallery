package com.gadgroup.online.core.model;

import java.io.Serializable;

/*
1 - packed
2 - sent
3 - arrived & not confirmed yet
4 - arrived & confirmed
5 - missed
 */
public enum PackageStatusType implements Serializable {
    PACKED(1L, "PACKED"),
    SENT(2L, "SENT"),
    ARRIVED_NOT_CONFIRMED(3L, "ARRIVED_NOT_CONFIRMED"),
    ARRIVED_CONFIRMED(4L, "ARRIVED_CONFIRMED"),
    MISSED(5L, "MISSED");

    private Long id;
    private String value;

    PackageStatusType(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PackageStatusType valueOf(Long id) {
        if (id == PACKED.id) return PACKED;
        else if (id == SENT.id) return SENT;
        else if (id == ARRIVED_NOT_CONFIRMED.id) return ARRIVED_NOT_CONFIRMED;
        else if (id == ARRIVED_CONFIRMED.id) return ARRIVED_CONFIRMED;
        else if (id == MISSED.id) return MISSED;
        else return null;
    }
}

