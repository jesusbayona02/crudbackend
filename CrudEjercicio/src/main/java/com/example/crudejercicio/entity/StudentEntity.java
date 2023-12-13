package com.example.crudejercicio.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data //nos libra de crear getter and setter en forma manual
@Entity //indica una entidad
@Table(name = "tabla_estudiantes") //nombre de la tabla

public class StudentEntity {
    @Id //la tabla llevara id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String firsname;
    private  String lastname;
    @Column(name = "email_address",unique = true,nullable = false)
    private String email;











}
