package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import java.sql.Timestamp;

/**
 * Tasks like Stocking-In/Stocking-Out are captured by this domain object.
 * Records of this table represents the inventory-history of the product and the sum
 * of all records should be equal the actual stock of the product available currently.
 *
 * Created by tvu on 27.02.14.
 */
public class InventoryUpdate {
    private Long id;
    private ShopProduct shopProduct;
    private Integer stock;

    /*
    ODD is UpStock, EVEN is DownStock
    1 - Stock-In
    2 - Stock-Out (Sell)
    3 - Upstock-Correction
    4 - DownStock-Correction
     */
    private Integer type;

    private Timestamp timestamp;

    private User stockUpdater;
}
