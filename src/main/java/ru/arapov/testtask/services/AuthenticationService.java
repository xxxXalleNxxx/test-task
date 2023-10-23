package ru.arapov.testtask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.arapov.testtask.models.ApplicationUser;
import ru.arapov.testtask.models.LoginResponseDTO;
import ru.arapov.testtask.repository.UserRepository;

@Service
public class AuthenticationService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    public ApplicationUser registerUser(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);

        return userRepository.save(new ApplicationUser(0, username, encodedPassword));
    }

    public LoginResponseDTO loginUser(String username, String password) {
        try {
            Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

            return new LoginResponseDTO(userRepository.findByUsername(username).get(), password);
        } catch (AuthenticationException e) {
            return new LoginResponseDTO(null, "");
        }
    }


}
