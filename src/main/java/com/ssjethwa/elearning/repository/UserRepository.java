package com.ssjethwa.elearning.repository;

import com.ssjethwa.elearning.ElearningApplication;
import com.ssjethwa.elearning.model.ELearnUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ELearnUser, Long> {
    ELearnUser getUserById(Long userId);
}
