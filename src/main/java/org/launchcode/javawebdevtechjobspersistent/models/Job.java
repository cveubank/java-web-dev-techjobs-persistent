package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Job extends AbstractEntity{

    @ManyToOne(targetEntity = org.launchcode.javawebdevtechjobspersistent.models.Employer.class)
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();



    public Job() {
    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
