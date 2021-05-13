package com.yaohongjie.runner.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 订单实体类
 */
@Entity
@Data
@Table(name = "at_order")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    //收货人姓名
    @Column(length = 50)
    private String consignee;
    // 收货人电话
    @Column(length = 50)
    private String consigneeMobile;
    // 物品（取、买、送）
    private String goods;
    // 取货地址
    private String pickupAddress;
    // 商店、
    @Column(length = 50)
    private String store;
    // 送货人电话、
    @Column(length = 50)
    private String consignerMobiel;
    // 送货人姓名、
    @Column(length = 50)
    private String consigner;

    // 谁下单
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private Customer creator;
    // 哪个时间下单
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createTime;
    // 谁指派
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "assignor_id")
    private Manager assignor;
    // 哪个时间指派
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date assignTime;
    // 指派给谁
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "designee_id")
    private Customer designee;

    // 什么时候领取
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date receiptTime;
    //什么时候送达
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date sendToTime;

    //什么时候确认收货
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date deliveryTime;
    //什么时候评价
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date evaluateTime;
    // 评价内容
    private String evaluateContent;
    // 状态（1：下单成功、2：已指派、3：配送中、4：已送达、5：已收货、6：已评价，-1：删除）
    public Integer status = 1;
}
