package com.customer.rest.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.rest.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
   public Customer findBy_id(ObjectId _id);
}
