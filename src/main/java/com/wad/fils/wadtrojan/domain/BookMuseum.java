package com.wad.fils.wadtrojan.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class BookMuseum {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String lastName;

    private String email;
    private String telephone;
    private String museum;
    private String type;

    private int noOfTickets;
    private String hour;

    @OneToOne
    private User user;

    @OneToOne
    private Museum museumName;

    @Override
    public String toString() {
        return "BookMuseum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", museum='" + museum + '\'' +
                ", type='" + type + '\'' +
                ", noOfTickets=" + noOfTickets +
                ", hour='" + hour + '\'' +
                ", user=" + user +
                ", museumName=" + museumName +
                '}';
    }
}
