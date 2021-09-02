package com.py.lenovo.repository;

import com.py.lenovo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();
    List findByAge(@Param("age") Integer age);
    List<User> findByMobileNo(@Param("mobile") Long mobile);
    User findByRecordId(Long id);

    @Query("SELECT e FROM User e WHERE e.deleted=false")
    Optional<User> findById(@Param("studentId") Long smarkAsDelete);

}
