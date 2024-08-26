package com.wu.vaccinationmanagement.vaccination_management.service;

import com.wu.vaccinationmanagement.vaccination_management.entity.VaccineDose;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
//@Repository
public interface VaccineService {

//    public User

    public VaccineDose getDetails(@PathVariable int userId);
}
