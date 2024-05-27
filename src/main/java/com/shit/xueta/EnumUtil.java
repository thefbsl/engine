package com.shit.xueta;


import com.shit.xueta.dto.Appliance;
import com.shit.xueta.dto.Watt;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EnumUtil {

    public static List<Appliance> getEnumValuesByName(String enumName) {
        List<Appliance> appliances = new ArrayList<>();
        try {
            Class<?> clazz = Class.forName("com.shit.xueta.enums." + enumName);
            if (clazz.isEnum()) {
                Method method = clazz.getMethod("values");
                Object[] enumConstants = (Object[]) method.invoke(null);
                for (Object constant : enumConstants) {
                    Method toApplianceMethod = constant.getClass().getMethod("toAppliance");
                    Appliance appliance = (Appliance) toApplianceMethod.invoke(constant);
                    appliances.add(appliance);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appliances;
    }


    public static Watt getWattByModel(String enumName, String model) {
        try {
            Class<?> clazz = Class.forName("com.shit.xueta.enums." + enumName);
            if (clazz.isEnum()) {
                Method method = clazz.getMethod("values");
                Object[] enumConstants = (Object[]) method.invoke(null);
                for (Object constant : enumConstants) {
                    Method getModelMethod = constant.getClass().getMethod("getModel");
                    String enumModel = (String) getModelMethod.invoke(constant);
                    if (enumModel.contains(model)) {  // Check if the enum model contains the input model substring
                        Method getWattMethod = constant.getClass().getMethod("getWatts");
                        double watt = (double) getWattMethod.invoke(constant);
                        return new Watt(watt);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
