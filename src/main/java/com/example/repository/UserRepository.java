package com.example.repository;

import com.example.dto.UserssDTO;
import com.example.entity.Userss;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Userss,Long>
{
//    Optional<Userss> findByEmail(String email);
//    List<Userss> findByFullNameContaining(String fullName);
//    List<Userss> findByAgeGreaterThan(Integer age);
}
