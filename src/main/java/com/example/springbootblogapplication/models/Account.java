package com.example.springbootblogapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String email;

    @JsonIgnore
    String password;

    String firstName;

    String lastName;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Post> posts;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "account_authority",
            joinColumns = {@JoinColumn(name = "account_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    Set<Authority> authorities = new HashSet<>();

}
