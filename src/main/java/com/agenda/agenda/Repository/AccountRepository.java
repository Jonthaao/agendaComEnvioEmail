package com.agenda.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.agenda.Entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}