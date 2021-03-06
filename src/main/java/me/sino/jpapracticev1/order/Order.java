package me.sino.jpapracticev1.order;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue
  @Column(name = "order_id")
  private Long id;

  private Long memberId;

  @Column
  private LocalDate orderDate;

  @Enumerated(EnumType.STRING)
  private OrderStatus status;
}
