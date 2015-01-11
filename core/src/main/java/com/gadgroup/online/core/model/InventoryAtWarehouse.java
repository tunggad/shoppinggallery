package com.gadgroup.online.core.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Manages the inventory of products at each warehouse of the shop. The sum of all inventory changes
 * of a product at a warehouse should be equal the stock of the product at this warehouse.
 *
 * Created by tvu on 28.02.14.
 */
@Entity
public class InventoryAtWarehouse implements Serializable {
    private Long id;
    private ShopProduct shopProduct;
    private Warehouse warehouse;
    private Integer inventory;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public ShopProduct getShopProduct() {
        return shopProduct;
    }

    public void setShopProduct(ShopProduct shopProduct) {
        this.shopProduct = shopProduct;
    }

    @ManyToOne
    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}
