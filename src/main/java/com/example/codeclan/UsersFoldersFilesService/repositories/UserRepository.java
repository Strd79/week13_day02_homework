package com.example.codeclan.UsersFoldersFilesService.repositories;

import com.example.codeclan.UsersFoldersFilesService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
