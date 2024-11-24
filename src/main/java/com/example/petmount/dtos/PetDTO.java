package com.example.petmount.dtos;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PetDTO {
    private Long id;
    private String name;
    private LocalDateTime birth;
}
