package com.example.petmount.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(255)")
    private String name;

    @Column(name = "birth", columnDefinition = "timestamp")
    private LocalDateTime birth;
}
