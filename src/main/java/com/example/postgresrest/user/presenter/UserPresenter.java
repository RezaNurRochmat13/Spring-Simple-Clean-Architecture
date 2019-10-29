package com.example.postgresrest.user.presenter;

import com.example.postgresrest.exception.ResourceNotFound;
import com.example.postgresrest.user.model.User;
import com.example.postgresrest.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class UserPresenter {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("users")
    public Map<String, Object> getAllUsers() {
        Map<String, Object> map = new HashMap<>();
        List<User> userList = userService.findAllUser();

        map.put("total", userList.size());
        map.put("count", userList.size());
        map.put("data", userList);

        return map;
    }

    @GetMapping("user/{idUser}")
    public Map<String, Object> getDetailUsers(@PathVariable Integer idUser) {
        Map<String, Object> map = new HashMap<>();
        Optional<User> userOptional =
                Optional.ofNullable(userService.findUserById(idUser).orElseThrow(() -> new ResourceNotFound("User not found with id : " + idUser)));

        map.put("data", userOptional);

        return map;
    }

    @PostMapping("user")
    public Map<String, Object> createNewUsers(@Valid @RequestBody User userPayload) {
        Map<String, Object> map = new HashMap<>();
        userService.saveUsers(userPayload);

        map.put("message", "User created successfully");
        map.put("user_created", userPayload);

        return map;
    }
}
