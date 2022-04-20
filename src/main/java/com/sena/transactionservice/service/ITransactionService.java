package com.sena.transactionservice.service;

import com.sena.transactionservice.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransaction(Long userId);
}
