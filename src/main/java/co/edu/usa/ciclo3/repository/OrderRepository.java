/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.ciclo3.repository;

/**
 *
 * @author hgc68
 */
import co.edu.usa.ciclo3.modelo.Order;
import co.edu.usa.ciclo3.repository.crud.OrderCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    
    public List<Order> getAll(){
        return orderCrudRepository.findAll();
    }
    
    public Optional<Order> getOrder(Integer id){
        return orderCrudRepository.findById(id);
    }
    
    public Order create(Order order){
        return orderCrudRepository.save(order);
    }
    
    public void update(Order order){
        orderCrudRepository.save(order);
    }
    
    public void delete(Order order){
        orderCrudRepository.delete(order);
    }
    
    public List<Order> getOrdersByZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);
    }
}

