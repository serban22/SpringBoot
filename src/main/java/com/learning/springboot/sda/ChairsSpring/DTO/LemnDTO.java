package com.learning.springboot.sda.ChairsSpring.DTO;

public class LemnDTO {

    String woodType;
    String finishType;

    public LemnDTO(String woodType, String finishType) {
        this.woodType = woodType;
        this.finishType = finishType;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public String getFinishType() {
        return finishType;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }

    @Override
    public String toString() {
        return "LemnDTO{" +
                "woodType='" + woodType + '\'' +
                ", finishType='" + finishType + '\'' +
                '}';
    }
}
