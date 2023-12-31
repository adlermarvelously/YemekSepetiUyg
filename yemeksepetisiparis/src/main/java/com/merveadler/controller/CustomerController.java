package com.merveadler.controller;

import com.merveadler.dto.request.ActivateRequestDto;
import com.merveadler.dto.request.LoginRequestDto;
import com.merveadler.dto.request.RegisterRequestDto;
import com.merveadler.dto.response.RegisterResponseDto;
import com.merveadler.repository.entity.Customer;
import com.merveadler.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

import static com.merveadler.constants.RestApiList.*;

@RestController
@RequestMapping(CUSTOMER)
@RequiredArgsConstructor
public class CustomerController {
    private  final CustomerService customerService;

    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponseDto> register(@RequestBody @Valid RegisterRequestDto dto) {
        return ResponseEntity.ok(customerService.register(dto));
    }

    @PostMapping(ACTIVATE_STATUS)
    public ResponseEntity<Boolean> activateStatus(@RequestBody ActivateRequestDto dto){
        return ResponseEntity.ok(customerService.activateStatus(dto));
    }

    @PostMapping(LOGIN)
    public  ResponseEntity<Boolean> login(LoginRequestDto dto){
        return  ResponseEntity.ok(customerService.login(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerService.findAll());
    }
}