package com.merveadler.mapper;


import com.merveadler.dto.request.ProductSaveRequestDto;
import com.merveadler.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductMapper {
    IProductMapper INSTANCE = Mappers.getMapper(IProductMapper.class);

    Product fromDtoToProduct(ProductSaveRequestDto dto);

}
