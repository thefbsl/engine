package com.shit.xueta.enums;

import com.shit.xueta.dto.Appliance;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AirConditioner {
    LG_LW8017ERSM("LG LW8017ERSM", 700),
    HONEYWELL_MN10CESWW("Honeywell MN10CESWW", 1000),
    FRIGIDAIRE_FFRA051ZA1("Frigidaire FFRA051ZA1", 450),
    MIDEA_MAP08S1BWT("Midea MAP08S1BWT", 800),
    BLACK_AND_DECKER_BPACT08WT("Black+Decker BPACT08WT", 750),
    WHYNTAR_ARCTIC_AIR_5K("Whyntar Arctic Air 5K", 500),
    HAIER_HWR05XCR("Haier HWR05XCR", 500),
    SPT_WA_1420E("SPT WA-1420E", 1000),
    EMERSON_QUIET_KOOL_EAPC8RD1("Emerson Quiet Kool EAPC8RD1", 800),
    TOSOT_8000_BTU_WINDOW_AC("Tosot 8000 BTU Window AC", 750),
    GE_AHZ08LW("GE AHZ08LW", 750),
    FRIGIDAIRE_FFRE063ZA1("Frigidaire FFRE063ZA1", 600),
    LG_LW6017R("LG LW6017R", 500),
    MIDEA_MAP10S1CWT("Midea MAP10S1CWT", 900),
    BLACK_AND_DECKER_BPACT14HWT("Black+Decker BPACT14HWT", 1400),
    TOSHIBA_RACPD1011CRU("Toshiba RAC-PD1011CRU", 1000),
    FRIGIDAIRE_FFRE083ZA1("Frigidaire FFRE083ZA1", 650),
    LG_LW1216ER("LG LW1216ER", 1100),
    MIDEA_MAP08R1CWT("Midea MAP08R1CWT", 800),
    HONEYWELL_MN12CES("Honeywell MN12CES", 1200);

    private final String model;
    private final double watts;

    public Appliance toAppliance() {
        return new Appliance(this.name(), this.model, this.watts);
    }
}
