package de.ait_tr.g_37_jp_shop.domain.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToOne(mappedBy = "customer")
    private Cart cart;

    public Customer(Long id, String name, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (isActive != customer.isActive) return false;
        if (!Objects.equals(id, customer.id)) return false;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Customer: ID - %d, name - %s, active - %s, cart - %s",
                id, name, isActive ? "yes" : "no",
                cart == null ? "ERROR! Cart is missing!" : cart);
    }
}
