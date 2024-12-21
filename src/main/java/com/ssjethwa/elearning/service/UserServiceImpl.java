package com.ssjethwa.elearning.service;

import com.ssjethwa.elearning.model.ELearnUser;
import com.ssjethwa.elearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public ELearnUser getUserById(Long instructorId) {
        return userRepository.getUserById(instructorId);
    }

    @Override
    public ELearnUser saveUser(ELearnUser user) {
        return userRepository.save(user);
    }
}
