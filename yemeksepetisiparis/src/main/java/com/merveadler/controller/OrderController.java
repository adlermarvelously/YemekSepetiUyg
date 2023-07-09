package com.merveadler.controller;

import com.merveadler.service.OrderService;
import com.merveadler.dto.request.OrderSaveRequestDto;
import com.merveadler.repository.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

import static com.merveadler.constants.RestApiList.*;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.ok(orderService.findAll());
    }
    @PostMapping(SAVE)
    public ResponseEntity<String> save(@RequestBody @Valid OrderSaveRequestDto dto){
        return ResponseEntity.ok(orderService.save(dto));
    }





}