package expenseTracker.myExpenseAPI.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expenseTracker.myExpenseAPI.domain.User;
import expenseTracker.myExpenseAPI.services.UserServices;

@RestController
@RequestMapping("/et/api/users")
public class userResource {

    @Autowired
    UserServices userServices;

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> registerUser(@RequestBody Map<String, Object> userMap){
        String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        
        User user = userServices.registerUser(firstName, lastName, email, password);
        Map<String, String> map = new HashMap<>();
        map.put("message", "registered successfully");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    
}
