package com.gadgroup.online.core.model;

/**
 * Manages the inventory of products at each warehouse of the shop. The sum of all inventory changes
 * of a product at a warehouse should be equal the stock of the product at this warehouse.
 *
 * Created by tvu on 28.02.14.
 */
public class InventoryAtWarehouse {
    private Long id;
    private ShopProduct shopProduct;
    private Warehouse warehouse;
    private Integer inventory;
}
