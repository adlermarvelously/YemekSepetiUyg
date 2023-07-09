package com.merveadler.mapper;
import com.merveadler.dto.request.RegisterRestaurantRequestDto;
import com.merveadler.dto.response.RegisterRestaurantResponseDto;
import com.merveadler.repository.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRestaurantMapper {
    IRestaurantMapper INSTANCE= Mappers.getMapper(IRestaurantMapper.class);
    Restaurant toRestaurant(final RegisterRestaurantRequestDto dto);
    RegisterRestaurantResponseDto toRegisterRestaurantResponseDto (final  Restaurant restaurant);

}