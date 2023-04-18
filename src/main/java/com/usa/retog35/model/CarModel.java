package com.usa.retog35.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idCar;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    @Column(name = "yyear",length = 4)
    private int year;
    @Column(length = 250)
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_gama")
    @JsonIgnoreProperties({"cars"})
    private GamaModel gama;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "car")
    @JsonIgnoreProperties({"car","client"})
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "car")
    @JsonIgnoreProperties({"car"})
    private List<ReservationModel> reservations;
}
