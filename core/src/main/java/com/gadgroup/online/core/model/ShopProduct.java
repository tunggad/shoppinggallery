package com.gadgroup.online.core.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Represents a product of a shop selling it.
 *
 * Created by tvu on 27.02.14.
 */
@Entity
public class ShopProduct {
    private Long id;
    private String name;
    private String description;

    // self-generated product code
    private String customCode;

    // 12-digits UPC-A Code
    private String upcA;
    // 6-digits UPC-E Code
    private String upcE;

    // 8-digits EAN-8 Code
    private String ean8;

    // 13-digits EAN-13 Code
    private String ean13;

    // 10-digits ISBN-10 Code
    private String isbn10;

    private Integer inventory = 0;
    private Set<InventoryAtWarehouse> warehouseInventories;

    // recent sell-price
    private BigDecimal price;

    private Shop shop;
    private Timestamp inventoryLastUpdate;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCustomCode() {
        return customCode;
    }

    public String getUpcA() {
        return upcA;
    }

    public String getUpcE() {
        return upcE;
    }

    public String getEan8() {
        return ean8;
    }

    public String getEan13() {
        return ean13;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public Integer getInventory() {
        return inventory;
    }

    @OneToMany(mappedBy = "shopProduct")
    public Set<InventoryAtWarehouse> getWarehouseInventories() {
        return warehouseInventories;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @ManyToOne
    public Shop getShop() {
        return shop;
    }

    public Timestamp getInventoryLastUpdate() {
        return inventoryLastUpdate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public void setUpcA(String upcA) {
        this.upcA = upcA;
    }

    public void setUpcE(String upcE) {
        this.upcE = upcE;
    }

    public void setEan8(String ean8) {
        this.ean8 = ean8;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public void setWarehouseInventories(Set<InventoryAtWarehouse> warehouseInventories) {
        this.warehouseInventories = warehouseInventories;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setInventoryLastUpdate(Timestamp inventoryLastUpdate) {
        this.inventoryLastUpdate = inventoryLastUpdate;
    }
}
