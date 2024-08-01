package com.agenda.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.agenda.Entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

}