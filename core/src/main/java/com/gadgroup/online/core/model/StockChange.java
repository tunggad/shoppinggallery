package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import java.sql.Timestamp;

/**
 * Tasks like Stocking-In/Stocking-Out are captured by this domain object.
 * Records of this table represents the stock-history of the product and the sum
 * of all records should be equal the actual stock of the related product.
 *
 * Created by tvu on 27.02.14.
 */
public class StockChange {
    private Long id;
    private ShopProduct shopProduct;
    private Warehouse warehouseLocation;
    private Integer number;

    /*
    ODD is Upstock, EVEN is Downstock
    1 - Stock-In
    2 - Stock-Out (Sell)
    3 - Downstock-Correction
    4 - Upstock-Correction
     */
    private Integer type;

    private Timestamp timestamp;

    private User stockUpdater;
}
