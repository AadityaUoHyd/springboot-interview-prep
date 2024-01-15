package com.aadi_interview_prep.repository;

import com.aadi_interview_prep.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer> {
}
