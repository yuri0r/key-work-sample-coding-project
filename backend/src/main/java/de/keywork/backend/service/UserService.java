package de.keywork.backend.service;

import de.keywork.backend.dto.UserDto;
import de.keywork.backend.entity.User;
import de.keywork.backend.repository.UserDataRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDataRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserDataRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Long registerUser(UserDto userDto) {
        if (userRepository.findByUsername(userDto.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user = userRepository.save(user);
        return user.getId();
    }

    public User authenticate(UserDto userDto) {
        User user = userRepository.findByUsername(userDto.getUsername());
        if (user == null || !passwordEncoder.matches(userDto.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }
        return user;
    }
}
