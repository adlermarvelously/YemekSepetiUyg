package com.merveadler.controller;

import com.merveadler.service.RestaurantService;
import com.merveadler.dto.request.RegisterRestaurantRequestDto;
import com.merveadler.dto.request.RestaurantSaveRequestDto;
import com.merveadler.dto.response.RegisterRestaurantResponseDto;
import com.merveadler.repository.entity.Restaurant;
import com.merveadler.repository.entity.RestaurantOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

import static com.merveadler.constants.RestApiList.*;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Restaurant>> findAll() {
        return ResponseEntity.ok(restaurantService.findAll());
    }
    @GetMapping(FIND_ALL_RESTAURANT_ORDER)
    public ResponseEntity<List<RestaurantOrder>> findAllRestaurantOrder(Long restaurantId) {
        return ResponseEntity.ok(restaurantService.findAllRestaurantOrder(restaurantId));
    }
    @PutMapping(REGISTER)
    public ResponseEntity<RegisterRestaurantResponseDto> register(@RequestBody RegisterRestaurantRequestDto dto) {
        return ResponseEntity.ok(restaurantService.register(dto));
    }

}
