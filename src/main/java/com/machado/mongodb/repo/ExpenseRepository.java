package com.machado.mongodb.repo;

import com.machado.mongodb.models.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {

    /***
     * the integer represents the position of the parameter
     */
    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}