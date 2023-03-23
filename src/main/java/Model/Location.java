package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalTime startProgram;
    private LocalTime endProgram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getStartProgram() {
        return startProgram;
    }

    public void setStartProgram(LocalTime startProgram) {
        this.startProgram = startProgram;
    }

    public LocalTime getEndProgram() {
        return endProgram;
    }

    public void setEndProgram(LocalTime endProgram) {
        this.endProgram = endProgram;
    }
}
