package com.example.demo.dao;
import java.util.List;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,Integer> {

}
