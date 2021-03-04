package expenseTracker.myExpenseAPI.services;

import expenseTracker.myExpenseAPI.domain.User;
import expenseTracker.myExpenseAPI.exceptions.EtAuthException;

public interface UserServices {
    
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
   