package com.galvanize.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Car, Long> {
//
//    Car findOneCarByEmail(String email);

    Patient findPatientById(long id);
}