package com.Lins.CRUD_Spring.domain.product;

import org.antlr.v4.runtime.misc.NotNull;

public record RequestProducts(

        String id ,

        String name,

        Integer price_in_cents

) {
}
