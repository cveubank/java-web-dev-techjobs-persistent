package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @NotNull(message = "Employer is required.")
    private String Employer;

    private String skills;

    public Job() {
    }

    public String getEmployer() {
        return Employer;
    }

    public void setEmployer(String employer) {
        this.Employer = Employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
