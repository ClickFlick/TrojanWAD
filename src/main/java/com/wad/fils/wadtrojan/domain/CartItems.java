package com.wad.fils.wadtrojan.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class CartItems {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Museum museum;

    private double subTotal;
}
