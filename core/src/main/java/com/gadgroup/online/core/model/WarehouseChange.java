package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import java.sql.Timestamp;

/**
 * Represents a transport of products from one warehouse to the other.
 *
 * Created by tvu on 28.02.14.
 */
public class WarehouseChange {
    private Long id;
    private User sender;
    private User receiver;
    private Warehouse from;
    private Warehouse to;
    private Timestamp sendingDate;
    private Timestamp estimatedArrivalDate;
    private Timestamp arrivalDate;

    private PackageStatusType status;
}
