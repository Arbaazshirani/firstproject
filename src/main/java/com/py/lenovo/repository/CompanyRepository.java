package com.py.lenovo.repository;

import com.py.lenovo.pojo.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company, Long> {
    List<Company> findAll();

}
