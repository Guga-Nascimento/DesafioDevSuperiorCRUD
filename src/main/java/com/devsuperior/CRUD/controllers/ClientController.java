package com.devsuperior.CRUD.controllers;

import com.devsuperior.CRUD.dto.ClientDTO;
import com.devsuperior.CRUD.entities.Client;
import com.devsuperior.CRUD.repositories.ClientRepository;
import com.devsuperior.CRUD.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
       ClientDTO dto = service.findById(id);
       return dto;
    }
    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto){
        return service.insert(dto);

    }

}
