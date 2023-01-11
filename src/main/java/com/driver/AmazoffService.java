package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AmazoffService {
	
	

	    @Autowired
	    AmazoffRepository amazoffRepository;

	    public void addOrderService(Order order){
	        amazoffRepository.addOrder(order);
	    }

	    public void addPartnerService(String partnerId) {
	        amazoffRepository.addPartner(null);
	    }

	    public void addOrderPartnerPairService(String orderId, String partnerId) {
	        amazoffRepository.addOrderPartnerPair(orderId, partnerId);
	    }

	    public Order getOrderByIdService(String orderId) {
	        return amazoffRepository.getOrderById(orderId);
	    }

	    public DeliveryPartner getPartnerByIdService(String partnerId) {
	        return amazoffRepository.getPartnerById(partnerId);
	    }

	    public Integer getOrderCountByPartnerIdService(String partnerId) {
	        return amazoffRepository.getOrderCountByPartnerId(partnerId);
	    }

	    public List<String> getOrdersByPartnerIdService(String partnerId) {
	        return amazoffRepository.getOrdersByPartnerId(partnerId);
	    }

	    public List<String> getAllOrdersService() {
	        return amazoffRepository.getAllOrders();
	    }

	    public Integer getCountOfUnassignedOrdersService() {
	        return amazoffRepository.getCountOfUnassignedOrders();
	    }
     
	    
	    public int getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
	        // countOfOrders that are left after a particular time of a DeliveryPartner
	        int countOfOrders = amazoffRepository.getOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
	        return countOfOrders;
	    }

	    public String getLastDeliveryTimeByPartnerId(String partnerId) {
	        // Return the time when that partnerId will deliver his last delivery order.
	        String time = amazoffRepository.getLastDeliveryTimeByPartnerId(partnerId);
	        return time;
	    }


	    public void deletePartnerByIdService(String partnerId) {
	        amazoffRepository.deletePartnerById(partnerId);
	    }

	    public void deleteOrderByIdService(String orderId) {
	        amazoffRepository.deleteOrderById(orderId);
	    }
	

}
