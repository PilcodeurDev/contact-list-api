package io.pilcodeurdev.contactapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.pilcodeurdev.contactapi.domain.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
   Optional<Contact> findById(String id);
}
