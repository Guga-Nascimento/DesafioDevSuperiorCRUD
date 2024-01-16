package com.devsuperior.CRUD.dto;

import com.devsuperior.CRUD.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @NotBlank
    private String name;
    private String cpf;
    @Positive(message = "Valor precisa ser positivo")
    private Double income;
    @PastOrPresent(message = "A data informada é inválida, 'Data futura'.")
    private LocalDate birth_date;
    @Positive(message = "Valor precisa ser positivo")
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birth_date, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birth_date = birth_date;
        this.children = children;
    }
    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birth_date = entity.getBirth_date();
        children = entity.getChildren();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public Integer getChildren() {
        return children;
    }
}
