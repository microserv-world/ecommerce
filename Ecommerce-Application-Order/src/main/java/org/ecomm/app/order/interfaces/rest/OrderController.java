package org.ecomm.app.order.interfaces.rest;

import java.util.Date;
import java.util.List;

import org.ecomm.app.order.application.commandservice.OrderService;
import org.ecomm.app.order.interfaces.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
		
	@RequestMapping("/placeOrder")
	public void placeOrder(@RequestParam(value = "products", required = true) List<Product> productList,
			                @RequestParam(value = "customerId", required =  true) String customerId,
			                @RequestParam(value = "orderDate",required = true)Date orderDate) {
		
	}
	
	
}
