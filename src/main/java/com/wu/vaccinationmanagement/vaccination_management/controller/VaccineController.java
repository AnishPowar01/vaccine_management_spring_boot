package com.wu.vaccinationmanagement.vaccination_management.controller;

import com.wu.vaccinationmanagement.vaccination_management.service.VaccineService;
import com.wu.vaccinationmanagement.vaccination_management.service.VaccineServiceImpl;
import com.wu.vaccinationmanagement.vaccination_management.entity.User;
import com.wu.vaccinationmanagement.vaccination_management.entity.VaccineDose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class VaccineController {



    @Autowired
    private VaccineService vaccineService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user)
    {
        return null;
    }

    @GetMapping("/details/{userId}")
    public VaccineDose getDetails(@PathVariable int userId)
    {
        return vaccineService.getDetails(userId);
    }


}
