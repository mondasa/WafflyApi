
package com.example.WafflyApi.Repositorios;

import com.example.WafflyApi.Entidades.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsers extends JpaRepository<Users, Integer>{
    
}
