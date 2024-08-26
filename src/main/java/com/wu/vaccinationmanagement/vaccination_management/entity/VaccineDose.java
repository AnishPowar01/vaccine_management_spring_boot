package com.wu.vaccinationmanagement.vaccination_management.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vaccine_doses")
public class VaccineDose {
    @Id
    @Column(name = "dose_id")
    private Long doseId;

    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User user;

    @Column(name = "dose_number")
    private int doseNumber;

    @Column(name = "vaccination_date")
    private LocalDate vaccinationDate;

    @Column(name = "vaccine_type")
    private String vaccineType;

    public Long getDoseId() {
        return doseId;
    }

    public void setDoseId(Long doseId) {
        this.doseId = doseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VaccineDose{" +
                "doseId=" + doseId +
                ", user=" + user +
                ", doseNumber=" + doseNumber +
                ", vaccinationDate=" + vaccinationDate +
                ", vaccineType='" + vaccineType + '\'' +
                '}';
    }

    public int getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(int doseNumber) {
        this.doseNumber = doseNumber;
    }

    public LocalDate getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public VaccineDose()
    {}

}
