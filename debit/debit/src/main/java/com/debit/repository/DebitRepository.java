package com.debit.repository;

import com.debit.model.DebitModel;
import org.springframework.data.repository.CrudRepository;

public interface DebitRepository extends CrudRepository<DebitModel, Integer> {
}
