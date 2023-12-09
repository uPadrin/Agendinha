package com.agendinha.repository;

import com.agendinha.entity.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactsRepository extends JpaRepository<ContactsEntity, Integer> {

    Optional<ContactsEntity> findById(Integer id);

    Optional<ContactsEntity> findByName(String name);
}
