package com.study.account.repository;

import com.study.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository<Entity, PK type>
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
