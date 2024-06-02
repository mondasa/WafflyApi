package com.example.WafflyApi.Servicios;

import com.example.WafflyApi.Entidades.Users;
import com.example.WafflyApi.Repositorios.RUsers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SUsers {

    @Autowired
    RUsers rU;

    public List<Users> mtObtenerU() {
        return rU.findAll();
    }

    public boolean mtInsertarU(Users user) {
        boolean resp = false;
        try {
            rU.save((user));
        } catch (Exception e) {
            resp = false;
        }
        return resp;
    }

    public void mtActualizarU(Users user) {
        rU.save((user));

    }

    public Users mtObtenerProd(Integer noP) {
        return rU.getOne(noP);

    }

    public void mtEliminarProd(Integer noP) {
        rU.deleteById(noP);

    }
   

}
