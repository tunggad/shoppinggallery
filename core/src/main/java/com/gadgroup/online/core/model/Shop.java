package com.gadgroup.online.core.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.appfuse.model.BaseObject;
import org.appfuse.model.User;

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
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("owner", owner)
                .append("employers",employers)
                .toString();
    }

    @Override
    public boolean equals(final Object other)
    {
        if (!(other instanceof Shop))
            return false;
        Shop castOther = (Shop) other;
        return new EqualsBuilder()
                .append(name, castOther.name)
                .append(owner, castOther.owner)
                .append(employers, castOther.employers)
                .isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder()
                .append(name)
                .append(owner)
                .append(employers)
                .toHashCode();
    }
}
