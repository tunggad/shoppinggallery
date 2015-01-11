package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Represents a transport of products from one warehouse to the other.
 *
 * Created by tvu on 28.02.14.
 */
@Entity
public class GoodsTransport implements Serializable {
    private Long id;
    private User sender;
    private User receiver;
    private Warehouse from;
    private Warehouse to;
    private Set<InventoryTransfer> inventoryTransfers;
    private Timestamp sendingDate;
    private Timestamp estimatedArrivalDate;
    private Timestamp arrivalDate;

    private Integer status;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @ManyToOne
    public User getSender() {
        return sender;
    }

    @ManyToOne
    public User getReceiver() {
        return receiver;
    }

    @ManyToOne
    public Warehouse getFrom() {
        return from;
    }

    @ManyToOne
    public Warehouse getTo() {
        return to;
    }

    @OneToMany(mappedBy = "transport")
    public Set<InventoryTransfer> getInventoryTransfers() {
        return inventoryTransfers;
    }

    public Timestamp getSendingDate() {
        return sendingDate;
    }

    public Timestamp getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public Timestamp getArrivalDate() {
        return arrivalDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setFrom(Warehouse from) {
        this.from = from;
    }

    public void setTo(Warehouse to) {
        this.to = to;
    }

    public void setInventoryTransfers(Set<InventoryTransfer> inventoryTransfers) {
        this.inventoryTransfers = inventoryTransfers;
    }

    public void setSendingDate(Timestamp sendingDate) {
        this.sendingDate = sendingDate;
    }

    public void setEstimatedArrivalDate(Timestamp estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public void setArrivalDate(Timestamp arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
