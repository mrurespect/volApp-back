package com.example.volapp.Repository;

import com.example.volapp.Entity.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AvionRepository extends JpaRepository<Avion, Integer>{

}
