package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Receiving of goods at a warehouse.
 *
 * Created by tvu on 28.02.14.
 */
public class GoodsReceipt {
    private Long id;
    private User receiver;
    private Set<InventoryUpdate> updates;
    private Timestamp timestamp;
}
