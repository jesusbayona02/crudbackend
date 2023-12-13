package com.example.crudejercicio.repository;

import com.example.crudejercicio.entity.StudentEntity;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <StudentEntity,Long> {

    







}
