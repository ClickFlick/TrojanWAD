package com.wad.fils.wadtrojan.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Museum {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;
    private int capacity;
    private boolean allowGroups;

}
