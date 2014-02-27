package com.gadgroup.online.core.model;

import org.appfuse.model.BaseObject;
import org.appfuse.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * This class represents a shop. A shop belongs to only one shop owner, the user who created
 * the shop. A shop can have multiple shop employers, shop employers can do granted tasks for the shop,
 * these tasks are granted by the shop owner.
 * The shop owner can do all tasks relating to his shop.
 *
 * Created by tvu on 24.02.14.
 */
public class Shop extends BaseObject implements Serializable {

    private Long id;
    private String name;
    private User owner;
    private Set<User> employers = new HashSet<User>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }

    public Set<User> getEmployers() {
        return employers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOwner(User shopOwner) {
        this.owner = shopOwner;
    }

    public void setEmployers(Set<User> shopEmployers) {
        this.employers = shopEmployers;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
