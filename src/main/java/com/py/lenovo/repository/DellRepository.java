package com.py.lenovo.repository;

import com.py.lenovo.pojo.DellUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DellRepository extends JpaRepository<DellUser,Long> {

    List<DellUser> findAll();
}
