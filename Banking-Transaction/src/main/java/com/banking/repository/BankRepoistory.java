package com.banking.repository;

import org.jboss.jandex.ClassExtendsTypeTarget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.entity.Bank;

@Repository
public interface BankRepoistory extends JpaRepository<Bank, Integer>{

}
