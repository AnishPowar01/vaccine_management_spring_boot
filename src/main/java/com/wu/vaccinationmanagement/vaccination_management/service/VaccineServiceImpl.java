package com.wu.vaccinationmanagement.vaccination_management.service;

import com.wu.vaccinationmanagement.vaccination_management.entity.VaccineDose;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
//@Service
@Repository
public class VaccineServiceImpl implements VaccineService{

    private EntityManager entityManager;

    public  VaccineServiceImpl(EntityManager theEntityManager)
    {
        this.entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public VaccineDose getDetails(int userId) {

        Session session = entityManager.unwrap(Session.class);
       VaccineDose vaccineDose=session.get(VaccineDose.class,userId);

        return vaccineDose;
    }
}
