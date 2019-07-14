package com.tvmsoftware.people.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(nullable = false)
    private String city;

    @Column(name = "province", length=2, nullable = false)
    private String province;

    @Column(name = "postal_code",nullable = false)
    private String postalCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Address(String addressLine1, String addressLine2, String city, String province, String postalCode, Person person) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.person = person;
    }

    public String toString() {
        return "Address(id=" + this.getId() + ", addressLine1=" + this.getAddressLine1() + ", addressLine2=" + this.getAddressLine2() + ", city=" + this.getCity() + ", province=" + this.getProvince() + ", postalCode=" + this.getPostalCode() + ")";
    }
}
