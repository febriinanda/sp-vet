package com.nanda.vet.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Pet {
    private String name;
    private String type;
    private Date birthDate;
}
