package com.devonfw.app.java.order.orderservice.common.api;

import java.time.LocalDate;

import com.devonfw.app.java.order_service.general.common.api.ApplicationEntity;

public interface Order extends ApplicationEntity {

  /**
   * @return priceId
   */
  public Double getPrice();

  /**
   * @param price setter for price attribute
   */
  public void setPrice(Double price);

  /**
   * @return ownerIdId
   */
  public Long getOwnerId();

  /**
   * @param ownerId setter for ownerId attribute
   */
  public void setOwnerId(Long ownerId);

  /**
   * @return creationDateId
   */
  public LocalDate getCreationDate();

  /**
   * @param creationDate setter for creationDate attribute
   */
  public void setCreationDate(LocalDate creationDate);

  /**
   * @return orderStatusId
   */
  public OrderStatus getOrderStatus();

  /**
   * @param orderStatus setter for orderStatus attribute
   */
  public void setOrderStatus(OrderStatus orderStatus);

}
