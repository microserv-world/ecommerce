package org.ecomm.app.order.infrastructure.repository;

import org.ecomm.app.order.domain.model.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer> {

}
