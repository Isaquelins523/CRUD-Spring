package com.Lins.CRUD_Spring.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="products")
@Entity(name="Product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    public Product(RequestProducts requestProducts) {
        this.name = requestProducts.name();
        this.price_in_cents = requestProducts.price_in_cents();
    }
}
