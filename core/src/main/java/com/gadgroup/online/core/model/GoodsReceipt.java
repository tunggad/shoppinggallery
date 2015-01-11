package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Receiving of goods at a warehouse.
 *
 * Created by tvu on 28.02.14.
 */
@Entity
public class GoodsReceipt implements Serializable {
    private Long id;
    private Warehouse warehouse;
    private User receiver;
    private Set<InventoryUpdate> updates;
    private Timestamp timestamp;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @ManyToOne
    public Warehouse getWarehouse() {
        return warehouse;
    }

    @ManyToOne
    public User getReceiver() {
        return receiver;
    }

    @OneToMany
    @JoinTable(
            name = "GoodsReceipt_InventoryUpdate",
            joinColumns = @JoinColumn(name = "receipt_id"),
            inverseJoinColumns = @JoinColumn(name = "update_id")
    )
    public Set<InventoryUpdate> getUpdates() {
        return updates;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setUpdates(Set<InventoryUpdate> updates) {
        this.updates = updates;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
