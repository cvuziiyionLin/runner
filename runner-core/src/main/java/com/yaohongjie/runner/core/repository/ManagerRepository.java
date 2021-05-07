package com.yaohongjie.runner.core.repository;

import com.yaohongjie.runner.core.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {

    Manager findByUsernameAndPassword(String userName,String password);
}
