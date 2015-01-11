package com.gadgroup.online.core.model;

import org.appfuse.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Represents a abstract warehouse location where a product is warehoused. The entire inventory
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
@Entity
public class Warehouse implements Serializable {
    private Long id;
    private String name;
    private Shop shop;
    private Set<User> employers;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @ManyToMany
    @JoinTable(
            name = "Warehouse_Employer",
            joinColumns = @JoinColumn(name = "warehouse_id"),
            inverseJoinColumns = @JoinColumn(name = "employer_id")
    )
    public Set<User> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<User> employers) {
        this.employers = employers;
    }
}
