package com.sacsolutions.expensetrackerapi.repositories;

import com.sacsolutions.expensetrackerapi.domain.Transaction;
import com.sacsolutions.expensetrackerapi.exceptions.EtBadRequestException;
import com.sacsolutions.expensetrackerapi.exceptions.EtResouceNotFoundException;

import java.util.List;

public interface TransactionRepository {

    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResouceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws  EtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResouceNotFoundException;
}
