package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 2, message = "Description must be at least 2 characters.")
    @NotBlank (message = "Please provide a description")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    public Skill () {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

