package com.beneficiary.beneficiary.repository;

import com.beneficiary.beneficiary.model.BeneficiaryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneificiaryRepository extends CrudRepository<BeneficiaryModel, Integer> {
}
