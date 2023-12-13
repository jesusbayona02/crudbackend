package com.example.crudejercicio.service;

import com.example.crudejercicio.entity.StudentEntity;
import com.example.crudejercicio.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository; //definimos una manera como se le pueda usar

    public List<StudentEntity> getstudents(){ //get student es un llamado para todos los estudiantes
        return  studentRepository.findAll();
    }

    public Optional<StudentEntity> getstudent(Long id){
        return studentRepository.findById(id);
    }

    public void save (StudentEntity studentEntity){
        studentRepository.save(studentEntity); //guardar la informacion de un estudiante
    }

    public void update (StudentEntity studentEntity){
        studentRepository.save(studentEntity);
    }

    public void delete (Long id){
        studentRepository.deleteById(id);
    }




}
