package com.gadgroup.online.core.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Represents stock transfer of a product between two warehouses of a shop.
 *
 * Created by tvu on 28.02.14.
 */
@Entity
public class InventoryTransfer implements Serializable {
    private Long id;
    private ShopProduct shopProduct;
    private Integer stock;
    private GoodsTransport transport;

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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @ManyToOne
    public GoodsTransport getTransport() {
        return transport;
    }

    public void setTransport(GoodsTransport transport) {
        this.transport = transport;
    }
}
