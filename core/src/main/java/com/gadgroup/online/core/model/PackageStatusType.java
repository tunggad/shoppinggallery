package com.gadgroup.online.core.model;
/*
1 - packed
2 - sent
3 - arrived & not confirmed yet
4 - arrived & confirmed
5 - missed
 */
public enum PackageStatusType {
    PACKED(1),
    SENT(2),
    ARRIVED_NOT_CONFIRMED(3),
    ARRIVED_CONFIRMED(4),
    MISSED(5);

    private int value;

    private PackageStatusType(int value) {
        this.value = value;
    }
}

