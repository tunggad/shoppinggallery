package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Issuing of goods a a warehouse.
 *
 * Created by tvu on 28.02.14.
 */
@Entity
public class GoodsIssue implements Serializable {
    private Long id;
    private Warehouse warehouse;
    private Set<InventoryUpdate> updates;
    private User issuer;
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

    @OneToMany
    @JoinTable (
            name = "GoodsIssue_InventoryUpdate",
            joinColumns = @JoinColumn(name = "issue_id"),
            inverseJoinColumns = @JoinColumn(name = "update_id"))
    public Set<InventoryUpdate> getUpdates() {
        return updates;
    }

    @ManyToOne
    public User getIssuer() {
        return issuer;
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

    public void setUpdates(Set<InventoryUpdate> updates) {
        this.updates = updates;
    }

    public void setIssuer(User issuer) {
        this.issuer = issuer;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
