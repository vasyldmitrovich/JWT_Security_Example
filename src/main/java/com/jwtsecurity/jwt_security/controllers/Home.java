package com.jwtsecurity.jwt_security.controllers;

import com.jwtsecurity.jwt_security.entity.ERole;
import com.jwtsecurity.jwt_security.entity.Role;
import com.jwtsecurity.jwt_security.entity.User;
import com.jwtsecurity.jwt_security.repository.RoleRepository;
import com.jwtsecurity.jwt_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
public class Home {

    UserService userService;

    RoleRepository roleRepository;

    @Autowired
    public Home(UserService userService, RoleRepository roleRepository) {
        this.userService = userService;
        this.roleRepository = roleRepository;
    }

    @GetMapping({"/", "home"})
    public String home() {
        return "Hello from home page";
    }

    @GetMapping("/user/{id}")
    public Optional<User> read (@PathVariable("id") Long id) {
        return userService.readById(id);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/addUser")
    public User save() {
        Set<Role> set = new HashSet<>();
        for (Role role: roleRepository.findAll()
             ) {
            set.add(role);
        }
        set.stream().forEach(c -> System.out.println(c));

        User user = new User("User1","biguser1@gmail.com","password", set);
        userService.save(user);
        return user;
    }

    @PreAuthorize("hasRole('ROLE_MODERATOR')")
    @GetMapping("role")
    public String role() {

        return "If you see this message, that means you are MODERATOR";
    }
}
