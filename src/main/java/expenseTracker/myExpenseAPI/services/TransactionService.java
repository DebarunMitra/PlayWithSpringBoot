package expenseTracker.myExpenseAPI.services;

import java.util.List;

import expenseTracker.myExpenseAPI.domain.Transaction;
import expenseTracker.myExpenseAPI.exceptions.EtBadRequestException;
import expenseTracker.myExpenseAPI.exceptions.EtResourceNotFoundException;

public interface TransactionService {
    
    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
