package com.first.example.mongoproject.ganbler.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "ganbler")
public class Ganbler {

    @Id
    private String id;
    private String email;
    private List<Bet> bet;

    public Ganbler(String id, String email, List<Bet> bet) {
        this.id = id;
        this.email = email;
        this.bet = bet;
    }
}
