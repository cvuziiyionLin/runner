package com.yaohongjie.runner.core.repository;

import com.yaohongjie.runner.core.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
