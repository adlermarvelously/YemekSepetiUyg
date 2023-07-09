package com.merveadler.service;


import com.merveadler.repository.entity.RestaurantOrder;
import com.merveadler.exception.ErrorType;
import com.merveadler.exception.YemekSepetiException;
import com.merveadler.repository.IRestaurantOrderRepository;
import com.merveadler.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantOrderService extends ServiceManager<RestaurantOrder,Long> {
    private final IRestaurantOrderRepository restaurantOrderRepository;

    public RestaurantOrderService(IRestaurantOrderRepository restaurantOrderRepository) {
        super(restaurantOrderRepository);
        this.restaurantOrderRepository = restaurantOrderRepository;
    }

    public List<RestaurantOrder> findAllRestaurantsOrder(Long restaurantId) {
        List<RestaurantOrder> restaurantOrderList = restaurantOrderRepository.findAllRestaurantOrder(restaurantId);
        if (restaurantOrderList.size()<=0){
            throw  new YemekSepetiException(ErrorType.ERROR);
        }
        return restaurantOrderList;
    }
}
