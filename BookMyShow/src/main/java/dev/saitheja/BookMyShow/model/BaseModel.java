package dev.saitheja.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id //tells that the attribute private int id is primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID") //primary key
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
