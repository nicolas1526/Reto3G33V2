package com.usa.retog35.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idClient;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    @Column(length = 250)
    private String name;
    private byte age;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "client")
    @JsonIgnoreProperties({"client"})
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "client")
    @JsonIgnoreProperties({"client"})
    private List<ReservationModel> reservations;

}
