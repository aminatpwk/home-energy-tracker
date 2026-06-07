package com.energytracker.user_service.service;

import com.energytracker.user_service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    public UserDto createUser(UserDto userDto){
        //TODO: add user creation logic
        log.info("Creating user: {}", userDto);
        return userDto;
    }
}
