package com.credit.credit.repository;

import com.credit.credit.model.CreditModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends CrudRepository<CreditModel, Integer> {
}
