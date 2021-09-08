package co.live.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Specialty extends Model {
    @Column
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
