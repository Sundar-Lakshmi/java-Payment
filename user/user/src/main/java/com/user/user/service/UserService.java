package com.user.user.service;

import com.user.user.model.UserModel;
import com.user.user.payload.UserRequest;
import com.user.user.payload.UserResponse;
import com.user.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserResponse createUser(UserRequest userRequest){
        UserModel userModel = UserModel.builder()
                .userName(userRequest.getUserName())
                .userPassword(userRequest.getUserPassword())
                .userAddress(userRequest.getUserAddress())
                .userDob(userRequest.getUserDob())
                .build();
        UserModel updatedUserModel = userRepository.save(userModel);

        return UserResponse
                .builder()
                .userId(updatedUserModel.getUserId())
                .userAddress(updatedUserModel.getUserAddress())
                .userName(updatedUserModel.getUserName())
                .userPassword(updatedUserModel.getUserPassword())
                .userDob(updatedUserModel.getUserDob())
                .build();
    }
}
