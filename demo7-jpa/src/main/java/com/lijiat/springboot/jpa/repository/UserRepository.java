package com.lijiat.springboot.jpa.repository;

import com.lijiat.springboot.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 继承JpaRepository 来完成对数据库的操作
 * @author EDZ
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
