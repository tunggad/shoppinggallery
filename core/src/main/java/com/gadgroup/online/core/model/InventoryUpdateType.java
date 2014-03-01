package com.gadgroup.online.core.model;

/*
ODD is UpStock, EVEN is DownStock
1 - Stock-In
2 - Stock-Out (Sell)
3 - Upstock-Correction
4 - DownStock-Correction
 */
public enum InventoryUpdateType {
    STOCK_IN(1L, "STOCK_IN"),
    STOCK_OUT(2L, "STOCK_OUT"),
    UP_STOCK_CORRECTION(3L, "UP_STOCK_CORRECTION"),
    DOWN_STOCK_CORRECTION(4L, "DOWN_STOCK_CORRECTION");

    private Long id;
    private String value;

    private InventoryUpdateType(Long id, String value) {
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

    public InventoryUpdateType valueOf(Long id) {
        if (id == STOCK_IN.id) return STOCK_IN;
        else if (id == STOCK_OUT.id) return STOCK_OUT;
        else if (id == UP_STOCK_CORRECTION.id) return UP_STOCK_CORRECTION;
        else if (id == DOWN_STOCK_CORRECTION.id) return DOWN_STOCK_CORRECTION;

        return null;
    }
}

