package com.devonfw.app.java.order.common.builders;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import javax.persistence.EntityManager;

import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;
import com.devonfw.app.java.order.orderservice.dataaccess.api.CustomerEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderEntity;

/**
 * Test data builder for OrderEntity generated with cobigen.
 */
public class OrderEntityBuilder {

  private List<Consumer<OrderEntity>> parameterToBeApplied;

  /**
   * The constructor.
   */
  public OrderEntityBuilder() {

    this.parameterToBeApplied = new LinkedList<>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  /**
   * @param orderPositions the orderPositions to add.
   * @return the builder for fluent population of fields.
   */
  public OrderEntityBuilder orderPositions(final Set<ItemEntity> orderPositions) {

    this.parameterToBeApplied.add(target -> target.setOrderPositions(orderPositions));

    return this;
  }

  /**
   * @param owner the owner to add.
   * @return the builder for fluent population of fields.
   */
  public OrderEntityBuilder owner(final CustomerEntity owner) {

    this.parameterToBeApplied.add(target -> target.setOwner(owner));

    return this;
  }

  /**
   * @param price the price to add.
   * @return the builder for fluent population of fields.
   */
  public OrderEntityBuilder price(final Double price) {

    this.parameterToBeApplied.add(target -> target.setPrice(price));

    return this;
  }

  /**
   * @param ownerId the ownerId to add.
   * @return the builder for fluent population of fields.
   */
  public OrderEntityBuilder ownerId(final Long ownerId) {

    this.parameterToBeApplied.add(target -> target.setOwnerId(ownerId));

    return this;
  }

  /**
   * @param creationDate the creationDate to add.
   * @return the builder for fluent population of fields.
   */
  public OrderEntityBuilder creationDate(final LocalDate creationDate) {

    this.parameterToBeApplied.add(target -> target.setCreationDate(creationDate));

    return this;
  }

  /**
   * @param orderStatus the orderStatus to add.
   * @return the builder for fluent population of fields.
   */
  public OrderEntityBuilder orderStatus(final OrderStatus orderStatus) {

    this.parameterToBeApplied.add(target -> target.setOrderStatus(orderStatus));

    return this;
  }

  /**
   * @return the populated OrderEntity.
   */
  public OrderEntity createNew() {

    OrderEntity orderentity = new OrderEntity();
    for (Consumer<OrderEntity> parameter : this.parameterToBeApplied) {
      parameter.accept(orderentity);
    }
    return orderentity;
  }

  /**
   * Might be enriched to users needs (will not be overwritten)
   */
  private void fillMandatoryFields_custom() {

  }

  /**
   * Fills all mandatory fields by default. (will be overwritten on re-generation)
   */
  private void fillMandatoryFields() {

  }

  /**
   * @param em the {@link EntityManager}
   * @return the OrderEntity
   */
  public OrderEntity persist(EntityManager em) {

    OrderEntity orderentity = createNew();
    em.persist(orderentity);
    return orderentity;
  }

  /**
   * @param em the {@link EntityManager}
   * @param quantity the quantity
   * @return a list of OrderEntity
   */
  public List<OrderEntity> persistAndDuplicate(EntityManager em, int quantity) {

    List<OrderEntity> orderentityList = new LinkedList<>();
    for (int i = 0; i < quantity; i++) {
      OrderEntity orderentity = createNew();
      // TODO alter at least values with unique key constraints to prevent from exceptions while persisting
      em.persist(orderentity);
      orderentityList.add(orderentity);
    }

    return orderentityList;
  }

}
