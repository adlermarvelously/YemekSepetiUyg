package com.merveadler.service;
import com.merveadler.dto.request.OrderSaveRequestDto;
import com.merveadler.mapper.IOrderMapper;
import com.merveadler.repository.entity.Order;
import com.merveadler.repository.IOrderRepository;
import com.merveadler.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceManager <Order,Long>{
    private final IOrderRepository orderRepository;
    private final CustomerService customerService;
    private final ProductService productService;
    private final RestaurantService restaurantService;

    public OrderService(IOrderRepository orderRepository,
                        CustomerService customerService,
                        ProductService productService,
                        RestaurantService restaurantService) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.productService = productService;
        this.restaurantService = restaurantService;
    }
    public String save(OrderSaveRequestDto dto){
        orderRepository.save(IOrderMapper.INSTANCE.toOrder(dto));
        return "Order Save Success";
    }
}