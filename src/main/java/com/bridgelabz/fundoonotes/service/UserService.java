package com.bridgelabz.fundoonotes.service;

import com.bridgelabz.fundoonotes.dto.UserDTO;

public interface UserService {
    String register(UserDTO dto);
    String login(UserDTO dto);
}
