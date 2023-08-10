package com.example.springbootblogapplication.repositories;

import com.example.springbootblogapplication.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
