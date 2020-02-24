package org.ecomm.app.order.infrastructure.repository;

import org.ecomm.app.order.domain.model.entity.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

}
