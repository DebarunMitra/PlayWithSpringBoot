package expenseTracker.myExpenseAPI.repositories;

import expenseTracker.myExpenseAPI.domain.User;
import expenseTracker.myExpenseAPI.exceptions.EtAuthException;

public interface UserRepository {
    
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
