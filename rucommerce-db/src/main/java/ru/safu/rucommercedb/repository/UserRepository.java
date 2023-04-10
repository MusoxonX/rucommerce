package ru.safu.rucommercedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.safu.rucommercedb.entity.EntUser;

public interface UserRepository extends JpaRepository<EntUser, Long> {
}
