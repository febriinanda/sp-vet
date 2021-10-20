package com.nanda.vet.repository;

import com.nanda.vet.entity.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {
}
