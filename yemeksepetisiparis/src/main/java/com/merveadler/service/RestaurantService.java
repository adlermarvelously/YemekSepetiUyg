package com.merveadler.service;
import com.merveadler.dto.request.RegisterRestaurantRequestDto;
import com.merveadler.dto.response.RegisterRestaurantResponseDto;
import com.merveadler.repository.entity.Restaurant;
import com.merveadler.exception.ErrorType;
import com.merveadler.exception.YemekSepetiException;
import com.merveadler.mapper.IRestaurantMapper;
import com.merveadler.repository.IRestaurantRepository;
import com.merveadler.repository.entity.RestaurantOrder;
import com.merveadler.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

    public class RestaurantService extends ServiceManager<Restaurant,Long> {
        private final IRestaurantRepository restaurantRepository;
        private final ProductService productService;
        private final RestaurantOrderService restaurantOrderService;

        public RestaurantService(IRestaurantRepository restaurantRepository,
                                 RestaurantOrderService restaurantOrderService,
                                 ProductService productService) {
            super(restaurantRepository);
            this.restaurantRepository = restaurantRepository;
            this.restaurantOrderService = restaurantOrderService;
            this.productService = productService;
        }
        public RegisterRestaurantResponseDto register(RegisterRestaurantRequestDto dto) {
            if (restaurantRepository.existsByAddress(dto.getAddress())) {
                throw new YemekSepetiException(ErrorType.ERROR);
            }
            Restaurant restaurant = IRestaurantMapper.INSTANCE.toRestaurant(dto);
            RegisterRestaurantResponseDto registerRestaurantResponseDto = IRestaurantMapper.INSTANCE.toRegisterRestaurantResponseDto(restaurant);
            save(restaurant);
            return registerRestaurantResponseDto;
        }

        public List<RestaurantOrder> findAllRestaurantOrder(Long restaurantId) {
            return restaurantOrderService.findAllRestaurantsOrder(restaurantId);
        }


    }

