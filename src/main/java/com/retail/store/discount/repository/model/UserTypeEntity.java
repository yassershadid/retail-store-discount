package com.retail.store.discount.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(of = {"id", "name", "description"})
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "USER_TYPE")
public class UserTypeEntity {
  @Id
  private Integer id;
  private String name;
  private String description;
}
