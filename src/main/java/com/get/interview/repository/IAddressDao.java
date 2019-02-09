package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Address;


@Repository
public interface IAddressDao extends CrudRepository<Address, Long>{

}
