package com.agenda.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.agenda.Entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
