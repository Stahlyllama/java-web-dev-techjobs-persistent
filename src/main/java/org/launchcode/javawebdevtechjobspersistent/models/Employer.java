package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message= "please enter a location!")
    @Size(min=3, max=100)
    private String location;

    @OneToMany
    @JoinColumn()
    private List<Job> jobs = new ArrayList<>();

    public Employer (){}

    public String getLocation() { return location;}

    public void setLocation(String location) {this.location = location;}

    }
