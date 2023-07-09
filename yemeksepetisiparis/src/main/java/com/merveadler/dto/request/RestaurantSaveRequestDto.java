package com.merveadler.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantSaveRequestDto {
    private String name;
    private double point;
    private String address;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> productId;

}