package org.ecomm.app.order.application.commandservice;

import java.util.Date;
import java.util.List;

import org.ecomm.app.order.interfaces.dto.Product;

public interface OrderService {
	
	
	public void saveOrderInformation(String customerId,Date orderDate,List<Product> productList);
		

}
