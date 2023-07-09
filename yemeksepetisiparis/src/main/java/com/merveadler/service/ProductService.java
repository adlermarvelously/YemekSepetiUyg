package com.merveadler.service;

import com.merveadler.dto.request.ProductSaveRequestDto;
import com.merveadler.repository.entity.Product;
import com.merveadler.mapper.IProductMapper;
import com.merveadler.repository.IProductRepository;
import com.merveadler.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends ServiceManager<Product,Long> {
    private IProductRepository productRepository;
    public ProductService(IProductRepository productRepository) {
        super(productRepository);
        this.productRepository=productRepository;
    }
    public Product save(ProductSaveRequestDto dto){
        Product product = IProductMapper.INSTANCE.fromDtoToProduct(dto);
        return productRepository.save(product);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}