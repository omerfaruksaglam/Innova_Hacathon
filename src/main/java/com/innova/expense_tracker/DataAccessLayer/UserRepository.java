package com.innova.expense_tracker.DataAccessLayer;

import com.innova.expense_tracker.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
