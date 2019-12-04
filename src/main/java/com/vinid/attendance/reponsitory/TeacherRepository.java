package com.vinid.attendance.reponsitory;

import com.vinid.attendance.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teacher, Integer> {
    Teacher findByEmail(String email);
}
