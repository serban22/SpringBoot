package com.learning.springboot.sda.ShaormaIdealaBro.DTO;

public class ShaormarDTO {

    String name;
    String date;
    Integer shaormeFacute;

    public ShaormarDTO(String name, String date, Integer shaormeFacute) {
        this.name = name;
        this.date = date;
        this.shaormeFacute = shaormeFacute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getShaormeFacute() {
        return shaormeFacute;
    }

    public void setShaormeFacute(Integer shaormeFacute) {
        this.shaormeFacute = shaormeFacute;
    }

    @Override
    public String toString() {
        return "ShaormarDTO{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", shaormeFacute=" + shaormeFacute +
                '}';
    }
}
