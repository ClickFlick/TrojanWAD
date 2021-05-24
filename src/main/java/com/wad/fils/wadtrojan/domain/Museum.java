package com.wad.fils.wadtrojan.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

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
    private int howManyPeople;

    @Lob
    private Byte[] image;

    @Lob
    private String museumDesc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "museum")
    private Set<User> users;

    @Override
    public String toString() {
        return "Museum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", allowGroups=" + allowGroups +
                ", howManyPeople=" + howManyPeople +
                ", museumDesc='" + museumDesc + '\'' +
                ", user=" + users +
                '}';
    }
}
