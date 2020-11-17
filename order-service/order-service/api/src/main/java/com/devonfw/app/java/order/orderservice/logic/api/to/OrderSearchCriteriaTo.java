package com.devonfw.app.java.order.orderservice.logic.api.to;

import java.time.LocalDate;

import com.devonfw.app.java.order.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.devonfw.app.java.order.orderservice.common.api.Order}s.
 */
public class OrderSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Double price;

  private Long ownerId;

  private LocalDate creationDate;

  private OrderStatus orderStatus;

  /**
   * @return priceId
   */
  public Double getPrice() {

    return this.price;
  }

  /**
   * @param price setter for price attribute
   */
  public void setPrice(Double price) {

    this.price = price;
  }

  /**
   * @return ownerIdId
   * @return creationDateId
   */
  public LocalDate getCreationDate() {

    return this.creationDate;
  }

  /**
   * @param creationDate setter for creationDate attribute
   */
  public void setCreationDate(LocalDate creationDate) {

    this.creationDate = creationDate;
  }

  /**
   * @return orderStatusId
   */
  public OrderStatus getOrderStatus() {

    return this.orderStatus;
  }

  /**
   * @param orderStatus setter for orderStatus attribute
   */
  public void setOrderStatus(OrderStatus orderStatus) {

    this.orderStatus = orderStatus;
  }

  /**
   * getter for ownerId attribute
   *
   * @return ownerId
   */
  public Long getOwnerId() {

    return this.ownerId;
  }

  /**
   * @param owner setter for owner attribute
   */
  public void setOwnerId(Long ownerId) {

    this.ownerId = ownerId;
  }

}
