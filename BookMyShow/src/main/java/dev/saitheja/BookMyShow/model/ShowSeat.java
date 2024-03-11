package dev.saitheja.BookMyShow.model;

import dev.saitheja.BookMyShow.model.constants.ShowSeatStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class ShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}
/*
        Show        ShowSeat
        1               M

        Seat        ShowSeat
          1             M
 */