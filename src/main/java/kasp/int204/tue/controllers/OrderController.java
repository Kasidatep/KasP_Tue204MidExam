package kasp.int204.tue.controllers;

import kasp.int204.tue.dtos.OrderDto;
import kasp.int204.tue.dtos.PageDto;
import kasp.int204.tue.entities.Order;
import kasp.int204.tue.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }

    //GetById
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

    //UpdateById
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Integer id, @RequestBody Order order){
        return orderService.updateOrder(id, order);
    }

    //Create
    @PostMapping("")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }

    //DeleteById
    @DeleteMapping("/{id}")
    public Order deleteOrder(@PathVariable Integer id){
        return orderService.deleteOrder(id);
    }

    @GetMapping("/page")
    public Page<Order> getOrders(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "id") String sort){
        return orderService.getOrders(page,size, sort);
    }

    @GetMapping("/status/{status}")
    public List<Order> getOrdersByStatus(@PathVariable String status){
        return orderService.getOrdersByStatus(status);
    }

    @GetMapping("/dto")
    public List<OrderDto> getOrdersDto(){
        return orderService.getOrdersDto();
    }

    @GetMapping("/dto/{id}")
    public OrderDto getSingleOrderDto(@PathVariable Integer id){
        return orderService.getSingleOrderDto(id);
    }

    @GetMapping("/page/dto")
    public PageDto<OrderDto> getPageDtoOrders(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "1") Integer size,
            @RequestParam(defaultValue = "id") String sort       ){
        return orderService.getPageDtoOrders(page, size, sort);
    }



}
