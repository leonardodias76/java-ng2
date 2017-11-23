package com.skipthedishes.api.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private Integer dishCoin=0;

    private Set<Dish> favoriteDishes;

    private Set<Restaurant> favoriteRestaurants;


}
