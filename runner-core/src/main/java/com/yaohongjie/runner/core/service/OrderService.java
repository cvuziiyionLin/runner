package com.yaohongjie.runner.core.service;

import com.yaohongjie.runner.core.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    /**
     * 创建订单
     * @param order：订单
     * @param customerId ：客户id
     * @return
     */
    Order create(Order order, Long customerId);

    /**
     * 订单列表（分页）
     * @param pageable
     * @return
     */
    Page<Order> list(Pageable pageable);

    /**
     * 通过ID获取订单信息
     * @param id：订单id
     * @return
     */
    Order get(Long id);


    /**
     * 由客户确认订单，订单状态改为5：已收货
     * @param orderId：订单id
     * @return
     */
    Order confirmByCustomer(Long orderId);

    /**
     * 评价订单，订单状态改为6：已评价
     * @param orderId：订单id
     * @param evaluateContent：评价内容
     * @return
     */
    Order evaluate(Long orderId, String evaluateContent);

    /**
     * 配送员认领订单，订单状态改为3：配送中
     * @param orderId：订单id
     * @return
     */
    Order claim(Long orderId);

    /**
     * 由配送员确认收货，订单状态改为4：已送达
     * @param orderId：订单id
     * @return
     */
    Order confirmByDistributor(Long orderId);


    /**
     * 修改订单
     * @param order：订单
     * @return
     */
    Order modify(Order order);

    /**
     * 指派订单，订单状态改为2：已指派
     * @param orderId 订单id
     * @param assignorId 由谁指派(管理员)
     * @param designeeId 指派给谁（配送员）
     * @return
     */
    Order assign(Long orderId, Long assignorId, Long designeeId);

    //订单服务类：
    // 下单、订单列表（分页）、订单详情、确定订单（顾客）、评价订单、
    // 领取订单、确认订单（配送员），修改订单、指派订单
}
