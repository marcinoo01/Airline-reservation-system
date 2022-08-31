package pl.mmistela.entity;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@RequiredArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String town;
    private Integer postCode;
    private String locality;
    private String street;
    private String voivodeship;
    private Integer streetNumber;
    private Integer flatNumber;
}
