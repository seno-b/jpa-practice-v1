package me.sino.jpapracticev1.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem {

  @Id @GeneratedValue
  @Column(name = "order_item_id")
  private Long id;

  private Long itemId;

  private Long orderId;

  @Column
  private int orderPrice;

  @Column
  private int count;

}
