package org.ecomm.app.order.application.commandservice;

import java.util.Date;
import java.util.List;

import org.ecomm.app.order.infrastructure.repository.OrderRepository;
import org.ecomm.app.order.interfaces.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public void saveOrderInformation(String customerId, Date orderDate, List<Product> productList) {

		
		
	}

}
