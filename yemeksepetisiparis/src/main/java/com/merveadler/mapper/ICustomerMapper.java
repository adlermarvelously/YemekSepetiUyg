package com.merveadler.mapper;

import com.merveadler.dto.request.RegisterRequestDto;
import com.merveadler.dto.response.RegisterResponseDto;
import com.merveadler.repository.entity.Customer;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICustomerMapper {
    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    Customer fromRequestDtoToCustomer(final RegisterRequestDto dto);

    RegisterResponseDto toRegisterResponseDto(final Customer customer);




}
