package com.example.userservice.repository;

import com.example.userservice.domain.entity.VerificationEntity;
import com.example.userservice.domain.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface VerificationRepository extends JpaRepository<VerificationEntity, UUID> {
    @Query(value = "select v from verification v where v.userId.id = ?1")
    Optional<VerificationEntity> findByUserId(UUID userId);

    @Query(value = "select u from verification u where u.userId.id = ?1 and u.isActive = true")
    Optional<VerificationEntity> findUserEntityByisActive(UUID userId);

}
