package com.ssjethwa.elearning.service;

import com.ssjethwa.elearning.model.ELearnUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public ELearnUser getUserById(Long instructorId);
    public ELearnUser saveUser(ELearnUser user);
}
