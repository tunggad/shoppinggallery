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
    ODD is downstock, EVEN is upstock

    1 - Stock-In (Receipt of goods delivery)
    2 - Stock-Out (Sell, Dispatch of goods)
    3 - Downstock-Correction
    4 - Upstock-Correction
     */
    private Integer type;

    private Timestamp timestamp;

    private User stockUpdater;
}
