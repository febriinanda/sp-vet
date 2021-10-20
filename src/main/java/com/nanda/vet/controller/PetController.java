package com.nanda.vet.controller;

import com.nanda.vet.entity.Pet;
import com.nanda.vet.repository.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetRepository repository;

    public PetController(PetRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Pet> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Pet pet){
        repository.insert(pet);
    }
}
