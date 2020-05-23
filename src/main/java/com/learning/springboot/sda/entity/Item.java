package com.learning.springboot.sda.entity;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemId")
    Integer itemId;
    @Column(name = "itemTitle")
    String itemTitle;
    @ManyToOne
    @JoinColumn(name = "statusId")
    Status itemStatus;
    @ManyToOne
    @JoinColumn(name = "typeId")
    Type itemType;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemStatus=" + itemStatus.statusName +
                ", itemType=" + itemType.typeName +
                '}';
    }
}
