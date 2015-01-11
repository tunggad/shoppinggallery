package com.gadgroup.online.core.model;

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
@Entity
public class Shop implements Serializable {

    private Long id;
    private String name;
    // 3-digits ISO currency code, default for debit transactions;
    private String debitCurrencyCode;
    // 3-digits ISO currency code, default for credit transaction;
    private String creditCurrencyCode;
    private User owner;
    private Set<User> employers = new HashSet<User>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDebitCurrencyCode() {
        return debitCurrencyCode;
    }

    public String getCreditCurrencyCode() {
        return creditCurrencyCode;
    }

    @ManyToOne
    public User getOwner() {
        return owner;
    }

    @ManyToMany
    @JoinTable(
            name = "Shop_Employer",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "employer_id")
    )
    public Set<User> getEmployers() {
        return employers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDebitCurrencyCode(String debitCurrencyCode) {
        this.debitCurrencyCode = debitCurrencyCode;
    }

    public void setCreditCurrencyCode(String creditCurrencyCode) {
        this.creditCurrencyCode = creditCurrencyCode;
    }

    public void setOwner(User shopOwner) {
        this.owner = shopOwner;
    }

    public void setEmployers(Set<User> shopEmployers) {
        this.employers = shopEmployers;
    }

}
