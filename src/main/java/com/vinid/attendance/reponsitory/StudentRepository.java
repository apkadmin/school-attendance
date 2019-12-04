package com.vinid.attendance.reponsitory;

import com.vinid.attendance.entity.Role;
import com.vinid.attendance.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);
}