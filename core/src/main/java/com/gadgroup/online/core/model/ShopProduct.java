package com.gadgroup.online.core.model;

import java.sql.Timestamp;

/**
 * Represents a product of a shop selling it.
 *
 * Created by tvu on 27.02.14.
 */
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

    private Integer stock = 0;
    private Shop shop;
    private Timestamp stockLastUpdate;
}
