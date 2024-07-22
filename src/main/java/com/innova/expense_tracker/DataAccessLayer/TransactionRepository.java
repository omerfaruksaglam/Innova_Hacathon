package com.innova.expense_tracker.DataAccessLayer;

import com.innova.expense_tracker.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
