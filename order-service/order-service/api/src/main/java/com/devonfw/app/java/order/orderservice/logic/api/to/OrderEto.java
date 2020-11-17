package com.devonfw.app.java.order.orderservice.logic.api.to;

import java.time.LocalDate;

import com.devonfw.app.java.order.orderservice.common.api.Order;
import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Order
 */
public class OrderEto extends AbstractEto implements Order {

  private static final long serialVersionUID = 1L;

  private Double price;

  private Long ownerId;

  private LocalDate creationDate;

  private OrderStatus orderStatus;

  @Override
  public Double getPrice() {

    return this.price;
  }

  @Override
  public void setPrice(Double price) {

    this.price = price;
  }

  @Override
  public LocalDate getCreationDate() {

    return this.creationDate;
  }

  @Override
  public void setCreationDate(LocalDate creationDate) {

    this.creationDate = creationDate;
  }

  @Override
  public OrderStatus getOrderStatus() {

    return this.orderStatus;
  }

  @Override
  public void setOrderStatus(OrderStatus orderStatus) {

    this.orderStatus = orderStatus;
  }

  @Override
  public Long getOwnerId() {

    return this.ownerId;
  }

  @Override
  public void setOwnerId(Long ownerId) {

    this.ownerId = ownerId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
    result = prime * result + ((this.ownerId == null) ? 0 : this.ownerId.hashCode());
    result = prime * result + ((this.creationDate == null) ? 0 : this.creationDate.hashCode());
    result = prime * result + ((this.orderStatus == null) ? 0 : this.orderStatus.hashCode());

    result = prime * result + ((this.ownerId == null) ? 0 : this.ownerId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    OrderEto other = (OrderEto) obj;
    if (this.price == null) {
      if (other.price != null) {
        return false;
      }
    } else if (!this.price.equals(other.price)) {
      return false;
    }
    if (this.ownerId == null) {
      if (other.ownerId != null) {
        return false;
      }
    } else if (!this.ownerId.equals(other.ownerId)) {
      return false;
    }
    if (this.creationDate == null) {
      if (other.creationDate != null) {
        return false;
      }
    } else if (!this.creationDate.equals(other.creationDate)) {
      return false;
    }
    if (this.orderStatus == null) {
      if (other.orderStatus != null) {
        return false;
      }
    } else if (!this.orderStatus.equals(other.orderStatus)) {
      return false;
    }

    if (this.ownerId == null) {
      if (other.ownerId != null) {
        return false;
      }
    } else if (!this.ownerId.equals(other.ownerId)) {
      return false;
    }
    return true;
  }

}
