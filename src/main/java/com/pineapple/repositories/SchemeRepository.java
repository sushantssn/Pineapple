package com.pineapple.repositories;

import com.pineapple.pojo.Scheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemeRepository extends JpaRepository<Scheme,Integer> {


}
