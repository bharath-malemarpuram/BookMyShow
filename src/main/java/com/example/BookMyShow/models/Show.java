package com.example.BookMyShow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
// This is required as show is a reserved keyword in SQL
@Table(name = "shows")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    private Date startTime;
    @ElementCollection
    @Enumerated(value = EnumType.ORDINAL)
    private List<Features> features;
}
