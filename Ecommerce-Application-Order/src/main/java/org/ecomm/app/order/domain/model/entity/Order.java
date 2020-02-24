package org.ecomm.app.order.domain.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue
	private Integer orderId;
	
	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
	@Column(name = "ORDER_NUMBER")
	private String orderNumber;
	
	@Column(name = "PAYMENT_ID")
	private String paymentId;
	
	@Column(name = "ORDER_DATE")
	private Date date;
	
	@Column(name = "SHIPMENT_DATE")
	private Date shipmentDate;
	
	@Column(name = "SHIPPER_ID")
	private String shipperId;
		
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	@JoinColumns({
		 @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
		 @JoinColumn(name = "ORDER_NUMBER", referencedColumnName = "ORDER_NUMBER")
	})
	private List<OrderDetails> orderDetails;

	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}


	public String getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Date getShipmentDate() {
		return shipmentDate;
	}


	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}


	public String getShipperId() {
		return shipperId;
	}


	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}


	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}


	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	
}
