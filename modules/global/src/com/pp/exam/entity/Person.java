package com.pp.exam.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s|name")
@Table(name = "EXAM_PERSON")
@Entity(name = "exam$Person")
public class Person extends StandardEntity {
    private static final long serialVersionUID = 3445475028739602208L;

    @Column(name = "SURNAME", length = 200)
    protected String surname;

    @Column(name = "NAME", length = 150)
    protected String name;

    @Column(name = "PATRONYMIC", length = 150)
    protected String patronymic;

    @Temporal(TemporalType.DATE)
    @Column(name = "YEAR_BIRTH")
    protected Date yearBirth;

    @Column(name = "DOCUMENT_ID")
    protected Integer documentId;

    @Column(name = "PHONE_NUMBER", length = 11)
    protected String phoneNumber;

    @Column(name = "TOWN")
    protected String town;

    @Column(name = "DISTRICT")
    protected String district;

    @Column(name = "VILLAGE")
    protected String village;

    @Column(name = "STREET")
    protected String street;

    @Column(name = "HOUSE")
    protected Integer house;

    @Column(name = "HOUSE_LETTER", length = 1)
    protected String houseLetter;

    @Column(name = "HOUSE_BUILDING")
    protected Integer houseBuilding;

    @Column(name = "APARTMENT_NUMBER")
    protected Integer apartmentNumber;

    @Column(name = "APARTMENT_LETTER", length = 1)
    protected String apartmentLetter;

    public String getApartmentLetter() {
        return apartmentLetter;
    }

    public void setApartmentLetter(String apartmentLetter) {
        this.apartmentLetter = apartmentLetter;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Integer getHouseBuilding() {
        return houseBuilding;
    }

    public void setHouseBuilding(Integer houseBuilding) {
        this.houseBuilding = houseBuilding;
    }

    public String getHouseLetter() {
        return houseLetter;
    }

    public void setHouseLetter(String houseLetter) {
        this.houseLetter = houseLetter;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Date getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(Date yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}