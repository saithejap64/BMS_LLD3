package dev.saitheja.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel{
    @Id
    private String name;
    @ManyToMany
    private List<Movie> movies;

}
