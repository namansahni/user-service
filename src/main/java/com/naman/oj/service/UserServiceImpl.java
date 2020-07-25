package com.naman.oj.service;

import com.naman.oj.dto.UserDto;
import com.naman.oj.model.User;
import com.naman.oj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements  UserService {

//    @Autowired
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Autowired
    UserRepository userRepository;
    @Override
    public User registerUser(UserDto userDto) {
        if(userRepository.findByEmail(userDto.getEmail()) != null ) {
            //TODO: throw exception
        }
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFullName(userDto.getFullName());
        user.setActive(false);
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
