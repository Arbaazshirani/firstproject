package com.py.lenovo.repository;


import com.py.lenovo.pojo.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long>{
   // Laptop findById(Long id);
}
