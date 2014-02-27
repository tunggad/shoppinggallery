package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import java.util.Set;

/**
 * Represents a abstract warehouse location where a product is warehoused. The entire stock
 * of a product is the sum of all warehouse-stocks.
 * It can be an address, a geo-location or simple a abstract warehouse identifier.
 *
 * It has a set of shop employer, which by default do stock changing tasks (Stock-In/Stock-Out)
 * to this warehouse.
 *
 * A shop can have multiple warehouse locations.
 *
 * Created by tvu on 27.02.14.
 */
public class Warehouse {
    private Long id;
    private String name;
    private Shop shop;
    private Set<User> employers;

}
