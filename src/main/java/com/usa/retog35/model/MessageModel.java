package com.usa.retog35.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idMessage;
    @Column(name = "text",length = 250)
    private String messageText;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_car")
    @JsonIgnoreProperties({"reservations","messages"})
    private CarModel car;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_client")
    @JsonIgnoreProperties({"reservations","messages"})
    private ClientModel client;

}
