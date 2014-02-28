package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Represents a transport of products from one warehouse to the other.
 *
 * Created by tvu on 28.02.14.
 */
public class GoodsTranssport {
    private Long id;
    private User sender;
    private User receiver;
    private Warehouse from;
    private Warehouse to;
    private Set<InventoryTransfer> inventoryTransfers;
    private Timestamp sendingDate;
    private Timestamp estimatedArrivalDate;
    private Timestamp arrivalDate;

    private PackageStatusType status;
}
