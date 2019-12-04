package com.vinid.attendance.reponsitory;

import com.vinid.attendance.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository   extends JpaRepository<Attendance, Integer> {
    Attendance findAllById(Integer Id);
}