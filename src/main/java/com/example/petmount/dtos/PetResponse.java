package com.example.petmount.dtos;

import lombok.*;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PetResponse {
    private long totalCount;
    private List<PetDTO> pets;
}
