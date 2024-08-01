package com.agenda.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.agenda.Entities.Annotation;

public interface AnnotationRepository extends JpaRepository<Annotation, Integer> {

}