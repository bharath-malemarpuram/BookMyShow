package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{
    @Enumerated(value = EnumType.ORDINAL)
    private SeatStatus seatStatus;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private User user;
}
