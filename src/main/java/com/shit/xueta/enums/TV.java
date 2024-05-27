package com.shit.xueta.enums;

import com.shit.xueta.dto.Appliance;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TV {
    SAMSUNG_QN65Q9FN("Samsung QN65Q9FN", 125),
    LG_OLED65B8PUA("LG OLED65B8PUA", 155),
    SONY_XBR65X900F("Sony XBR65X900F", 110),
    TCL_65R617("TCL 65R617", 120),
    VIZIO_P65_F1("Vizio P65-F1", 130),
    SAMSUNG_UN65NU8000("Samsung UN65NU8000", 115),
    LG_OLED65C8PUA("LG OLED65C8PUA", 150),
    SONY_XBR65X850F("Sony XBR65X850F", 105),
    TCL_65S517("TCL 65S517", 110),
    VIZIO_E65_F0("Vizio E65-F0", 100),
    SAMSUNG_UN65NU7100("Samsung UN65NU7100", 95),
    LG_OLED55C8PUA("LG OLED55C8PUA", 135),
    SONY_XBR55X900F("Sony XBR55X900F", 95),
    TCL_55R617("TCL 55R617", 100),
    VIZIO_P55_F1("Vizio P55-F1", 105),
    SAMSUNG_UN55NU8000("Samsung UN55NU8000", 90),
    LG_OLED55B8PUA("LG OLED55B8PUA", 125),
    SONY_XBR55X850F("Sony XBR55X850F", 85),
    TCL_55S517("TCL 55S517", 90),
    VIZIO_E55_F0("Vizio E55-F0", 80);

    private final String model;
    private final double watts;

    public Appliance toAppliance() {
        return new Appliance(this.name(), this.model, this.watts);
    }
}

