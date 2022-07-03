package com.example.springbootblogapplication.repositories;

import com.example.springbootblogapplication.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {}
