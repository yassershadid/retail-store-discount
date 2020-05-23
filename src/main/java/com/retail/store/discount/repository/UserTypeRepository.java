package com.retail.store.discount.repository;

import com.retail.store.discount.repository.model.UserTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends CrudRepository<UserTypeEntity, Integer> {
}
