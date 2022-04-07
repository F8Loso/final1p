package com.ers.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ReimbType {
    LODGING(0),
    TRAVEL(1),
    FOOD(2),
    OTHER(3);

    private int typeId;

}
