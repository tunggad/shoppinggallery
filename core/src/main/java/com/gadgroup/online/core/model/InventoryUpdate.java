package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Tasks like Stocking-In/Stocking-Out are captured by this domain object.
 * Records of this table represents the inventory-history of the product and the sum
 * of all records should be equal the actual stock of the product available currently.
 *
 * Created by tvu on 27.02.14.
 */
@Entity
public class InventoryUpdate {
    private Long id;
    private ShopProduct shopProduct;
    private Integer stock;
    // apart of which type this record is, this can be purchasing or selling price
    private BigDecimal price;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @ManyToOne
    public ShopProduct getShopProduct() {
        return shopProduct;
    }

    public Integer getStock() {
        return stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getType() {
        return type;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @ManyToOne
    public User getStockUpdater() {
        return stockUpdater;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setShopProduct(ShopProduct shopProduct) {
        this.shopProduct = shopProduct;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setStockUpdater(User stockUpdater) {
        this.stockUpdater = stockUpdater;
    }
}
