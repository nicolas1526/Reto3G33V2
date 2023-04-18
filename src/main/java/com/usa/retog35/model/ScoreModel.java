package com.usa.retog35.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Scores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idScore;
    private byte score;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_reservation")
    @JsonIgnoreProperties({"score"})
    private ReservationModel reservation;
}
