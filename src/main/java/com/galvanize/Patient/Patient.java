package com.galvanize.Patient;

import com.fasterxml.jackson.annotation.*;
// import com.galvanize.Locations.Location;
//import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonFilter("patientFilter")
public class Patient implements Serializable {

//     @ManyToOne
//     @JoinColumn(name = "location_id")
//     @Access(AccessType.FIELD)
//     //@JsonBackReference
//     @JsonIgnoreProperties("cars")
//     private Location location;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column
    private String fName;

    @Column
    private String lName;

    @Column
    private String address;

    @Column
    private String reasonReferred;
}
