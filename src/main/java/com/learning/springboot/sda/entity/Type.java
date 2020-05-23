package com.learning.springboot.sda.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeId")
    Integer typeId;
    @Column(name = "typeName", nullable = false)
    String typeName;
    @OneToMany(mappedBy = "itemType")
    List<Item> items;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", items=" + items +
                '}';
    }
}
