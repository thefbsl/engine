package com.shit.xueta.enums;

import com.shit.xueta.dto.Appliance;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Stove {
    Artel_CGG50W0("Artel CGG50W0", 4000.0),
    Artel_CGG50W01("Artel CGG50W01", 4000.0),
    Artel_CGG60W0("Artel CGG60W0", 4000.0),
    Artel_CGG60W01("Artel CGG60W01", 4000.0),
    Artel_CGG60W02("Artel CGG60W02", 4000.0),
    Artel_CGG60W03("Artel CGG60W03", 4000.0),
    Artel_CGE500W0("Artel CGE500W0", 10000.0),
    Artel_CGE510W0("Artel CGE510W0", 10000.0),
    Artel_CGE610W0("Artel CGE610W0", 10000.0),
    Artel_CGE610W01("Artel CGE610W01", 10000.0),
    Artel_Comarella_01_E("Artel Comarella 01-E", 7400.0),
    Artel_Comarella_50_01_E("Artel Comarella 50 01-E", 7400.0),
    Artel_Apetito_10_G("Artel Apetito 10-G", 12100.0),
    Artel_Apetito_10_G_Seryy("Artel Apetito 10-G серый", 4700.0),
    ARG_CE50W0("ARG CE50W0", 10000.0),
    ARG_CE50W01("ARG CE50W01", 10000.0),
    ARG_CG9060("ARG CG-9060", 3325.0),
    ARG_CG9065("ARG CG-9065", 3325.0),
    ARG_CG9066("ARG CG-9066", 10700.0),
    ARG_CGE500W0("ARG CGE500W0", 10000.0),
    ARG_CGE510W0("ARG CGE510W0", 10000.0),
    ARG_CGE610W0("ARG CGE610W0", 10000.0),
    ARG_CGE900BJ0("ARG CGE900BJ0", 5300.0),
    ARG_F65MW33("ARG F65MW33", 8350.0),
    ARG_20DME4R109("ARG 20DME4R109", 3325.0),
    Beko_FFSS54000W("Beko FFSS 54000 W", 6000.0),
    Beko_FFSS67000W("Beko FFSS 67000 W", 5800.0),
    Bosch_HXA050B50Q("Bosch HXA050B50Q", 2850.0),
    Bosch_HXA050F50Q("Bosch HXA050F50Q", 2850.0),
    Bosch_HXA060B21Q("Bosch HXA060B21Q", 7500.0),
    Bosch_HXA060F20Q("Bosch HXA060F20Q", 2200.0),
    Bosch_HGA110B21Q("Bosch HGA110B21Q", 3000.0),
    Bosch_HGD645225Q("Bosch HGD645225Q", 7400.0),
    Bosch_HKG970020R("Bosch HKG970020R", 3000.0),
    Bosch_HKG150020R("Bosch HKG150020R", 3000.0),
    Bosch_HQA050020Q("Bosch HQA050020Q (тип HI3F2H)", 9300.0),
    Bosch_HXC39AG20Q("Bosch HXC39AG20Q", 5750.0),
    Dauscher_E5270WHTURBO("Dauscher E5270WH-TURBO", 1660.0),
    Dauscher_E5271SSTURBO("Dauscher E5271SS-TURBO", 1660.0),
    Dauscher_E5361CRSS("Dauscher E5361CRSS", 8600.0),
    Dauscher_E6270WHTURBO("Dauscher E6270WH-TURBO", 1600.0),
    Dauscher_E6271SSTURBO("Dauscher E6271SS-TURBO", 1600.0),
    Dauscher_E6361CRSS("Dauscher E6361CRSS", 2400.0),
    Dauscher_E6404LX("Dauscher E6404LX", 10400.0),
    Dauscher_E6415("Dauscher E6415", 10400.0),
    Dauscher_E9415("Dauscher E9415", 10400.0),
    Dauscher_E9416LX("Dauscher E9416LX", 5389.0),
    Dauscher_E9434BL("Dauscher E9434BL", 3389.0),
    Dauscher_E9441SSTURBO("Dauscher E9441SS-TURBO", 7400.0),
    Dauscher_E9441TURBO("Dauscher E9441-TURBO", 3100.0),
    Gorenje_GE5A11SG("Gorenje GE5A11SG", 8000.0),
    Gorenje_GE5A21WHB("Gorenje GEC5A21WG-B", 8600.0),
    Gorenje_GK5C60BJ("Gorenje GK5C60BJ", 770.0),
    Hansa_FCGW63123("Hansa FCGW63123", 2000.0),
    Hansa_FCGW63193("Hansa FCGW63193", 2000.0),
    Hansa_FCGX63123("Hansa FCGX63123", 2000.0),
    Hansa_FCCM582033("Hansa FCCM582033", 8700.0),
    Hansa_FCCW53019("Hansa FCCW53019", 7800.0),
    Hansa_FCCW53103("Hansa FCCW53103", 7800.0),
    Hansa_FCCW58103("Hansa FCCW58103", 8700.0),
    Hansa_FCCW582033("Hansa FCCW582033", 8700.0),
    Hansa_FCCW68203("Hansa FCCW68203", 7800.0),
    Hansa_FCCX580009("Hansa FCCX580009", 8700.0),
    Hansa_FCCX58103("Hansa FCCX58103", 8700.0),
    Hansa_FCCX58203("Hansa FCCX58203", 8700.0),
    Hansa_FCCX582033("Hansa FCCX582033", 9100.0),
    Hansa_FCCX68203("Hansa FCCX68203", 8700.0),
    Hansa_FCCX682033("Hansa FCCX682033", 9100.0),
    Hansa_FCMM582233("Hansa FCMM582233", 2900.0),
    Hansa_FCMS58228("Hansa FCMS58228", 2900.0),
    Hansa_FCMW53040("Hansa FCMW53040", 3200.0),
    Hansa_FCMW53123("Hansa FCMW53123", 7500.0),
    Hansa_FCMW582233("Hansa FCMW582233", 2900.0),
    Hansa_FCMW64040("Hansa FCMW64040", 3200.0),
    Hansa_FCMW68020("Hansa FCMW68020", 2900.0),
    Hansa_FCMW68123("Hansa FCMW68123", 2900.0),
    Hansa_FCMW68143("Hansa FCMW68143", 4100.0),
    Hansa_FCMW682233("Hansa FCMW682233", 2900.0),
    Hansa_FCMW68243("Hansa FCMW68243", 4100.0),
    Hansa_FCMW68249("Hansa FCMW68249", 2900.0);

    private final String model;
    private final Double watts;

    public Appliance toAppliance() {
        return new Appliance(this.name(), this.model, this.watts);
    }
}


