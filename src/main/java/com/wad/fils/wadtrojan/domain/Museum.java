package com.wad.fils.wadtrojan.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

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

    @Lob
    private Byte[] image;

}
