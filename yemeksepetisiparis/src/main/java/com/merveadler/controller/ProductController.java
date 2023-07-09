package com.merveadler.controller;

import com.merveadler.service.ProductService;
import com.merveadler.dto.request.ProductSaveRequestDto;
import com.merveadler.repository.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

import static com.merveadler.constants.RestApiList.*;

@RestController
@RequestMapping(PRODUCT)
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping(SAVE)
    public ResponseEntity<Product> save(@RequestBody @Valid ProductSaveRequestDto dto){
        return ResponseEntity.ok(productService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Product>> findALl(){
        return ResponseEntity.ok(productService .findAll());
    }
}
