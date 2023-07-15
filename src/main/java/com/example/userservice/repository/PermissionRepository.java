package com.example.userservice.repository;

import com.example.userservice.domain.entity.user.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PermissionRepository extends JpaRepository<PermissionEntity, UUID> {
    List<PermissionEntity> findPermissionEntitiesByPermissionIn(List<String> permissions);
    PermissionEntity findPermissionEntitiesByPermission(String permission);

}
