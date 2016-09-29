package com.prokarma.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by bkranthi on 27-09-2016.
 */
@Document(collection = "todos")
public class AssessmentDto {

    @Id
    private String id;

    private String implementationextent;

    private String calendertimebc;

    private String name;

    private String email;

    private String workhours;

    private String projectteamsize;

    private String interfaces;

    private String geography;

    private String amountofchange;

    private String requirements;

    private String interdependence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImplementationextent() {
        return implementationextent;
    }

    public void setImplementationextent(String implementationextent) {
        this.implementationextent = implementationextent;
    }

    public String getCalendertimebc() {
        return calendertimebc;
    }

    public void setCalendertimebc(String calendertimebc) {
        this.calendertimebc = calendertimebc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkhours() {
        return workhours;
    }

    public void setWorkhours(String workhours) {
        this.workhours = workhours;
    }

    public String getProjectteamsize() {
        return projectteamsize;
    }

    public void setProjectteamsize(String projectteamsize) {
        this.projectteamsize = projectteamsize;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getAmountofchange() {
        return amountofchange;
    }

    public void setAmountofchange(String amountofchange) {
        this.amountofchange = amountofchange;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getInterdependence() {
        return interdependence;
    }

    public void setInterdependence(String interdependence) {
        this.interdependence = interdependence;
    }
}
