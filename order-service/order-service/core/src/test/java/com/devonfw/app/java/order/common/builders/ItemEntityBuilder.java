package com.devonfw.app.java.order.common.builders;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;

import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;

/**
 * Test data builder for ItemEntity generated with cobigen.
 */
public class ItemEntityBuilder {

  private List<Consumer<ItemEntity>> parameterToBeApplied;

  /**
   * The constructor.
   */
  public ItemEntityBuilder() {

    this.parameterToBeApplied = new LinkedList<>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  /**
   * @param name the name to add.
   * @return the builder for fluent population of fields.
   */
  public ItemEntityBuilder name(final String name) {

    this.parameterToBeApplied.add(target -> target.setName(name));

    return this;
  }

  /**
   * @param description the description to add.
   * @return the builder for fluent population of fields.
   */
  public ItemEntityBuilder description(final String description) {

    this.parameterToBeApplied.add(target -> target.setDescription(description));

    return this;
  }

  /**
   * @param price the price to add.
   * @return the builder for fluent population of fields.
   */
  public ItemEntityBuilder price(final Double price) {

    this.parameterToBeApplied.add(target -> target.setPrice(price));

    return this;
  }

  /**
   * @return the populated ItemEntity.
   */
  public ItemEntity createNew() {

    ItemEntity itementity = new ItemEntity();
    for (Consumer<ItemEntity> parameter : parameterToBeApplied) {
      parameter.accept(itementity);
    }
    return itementity;
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
   * @return the ItemEntity
   */
  public ItemEntity persist(EntityManager em) {

    ItemEntity itementity = createNew();
    em.persist(itementity);
    return itementity;
  }

  /**
   * @param em the {@link EntityManager}
   * @param quantity the quantity
   * @return a list of ItemEntity
   */
  public List<ItemEntity> persistAndDuplicate(EntityManager em, int quantity) {

    List<ItemEntity> itementityList = new LinkedList<>();
    for (int i = 0; i < quantity; i++) {
      ItemEntity itementity = createNew();
      // TODO alter at least values with unique key constraints to prevent from exceptions while persisting
      em.persist(itementity);
      itementityList.add(itementity);
    }

    return itementityList;
  }

}
