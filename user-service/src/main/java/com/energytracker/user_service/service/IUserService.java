package com.energytracker.user_service.service;

import com.energytracker.user_service.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    public UserDto createUser(UserDto userDto);
    public UserDto getUserById(Long id);
    public void updateUser(Long id, UserDto userDto);
    public void deleteUser(Long id);
}
