package com.gadgroup.online.core.model;

/**
 * Represents stock transfer of a product between two warehouses of a shop.
 *
 * Created by tvu on 28.02.14.
 */
public class InventoryTransfer {
    private Long id;
    private ShopProduct shopProduct;
    private Integer stock;
}
