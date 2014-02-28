package com.gadgroup.online.core.model;

/*
ODD is UpStock, EVEN is DownStock
1 - Stock-In
2 - Stock-Out (Sell)
3 - DownStock-Correction
4 - UpStock-Correction
 */
public enum StockChangeType {
    STOCK_IN(1),
    STOCK_OUT(2),
    DOWN_STOCK_CORRECTION(3),
    UP_STOCK_CORRECTION(4);

    private int value;

    private StockChangeType(int value) {
        this.value = value;
    }
}

