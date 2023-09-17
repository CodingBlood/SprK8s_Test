package com.sprk1.sprk1.entity;

public class Course {
    private long id;
    private String tittle;
    private String description;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Course(long id, String tittle, String description){
        super();
        this.id = id;
        this.tittle = tittle;
        this.description = description;
    }
    public Course(){
        super();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }
}
