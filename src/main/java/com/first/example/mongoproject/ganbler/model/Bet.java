package com.first.example.mongoproject.ganbler.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;


@Data
public class Bet {
    private int numbers;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String betDate;

    public Bet(int numbers, String betDate) {
        this.numbers = numbers;
        this.betDate = betDate;
    }
}
