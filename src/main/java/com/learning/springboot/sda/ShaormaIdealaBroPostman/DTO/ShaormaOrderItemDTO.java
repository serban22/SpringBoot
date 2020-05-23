package com.learning.springboot.sda.ShaormaIdealaBroPostman.DTO;

public class ShaormaOrderItemDTO {

    public String shaormaName;
    public int quantity;
    public boolean deToate;
    public LipiePostDTO lipie;
    public String type;
    public ShaormarPostDTO shaormar;
    public SosPostDTO sosuri;

    @Override
    public String toString() {
        return "ShaormaOrderItemDTO{" +
                "shaormaName='" + shaormaName + '\'' +
                ", quantity=" + quantity +
                ", deToate=" + deToate +
                ", lipie=" + lipie +
                ", type='" + type + '\'' +
                ", shaormar=" + shaormar +
                ", sosuri=" + sosuri +
                '}';
    }
}
