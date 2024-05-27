package com.shit.xueta.rest;

import com.shit.xueta.EnumUtil;
import com.shit.xueta.dto.Appliance;
import com.shit.xueta.dto.Watt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppRest {
    @GetMapping("api/appliance/{name}")
    public ResponseEntity<List<Appliance>> getAllByName(@PathVariable String name){
        List<Appliance> appliances = EnumUtil.getEnumValuesByName(name);
        if (appliances.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(appliances);
    }

    @GetMapping("api/appliance/watt")
    public ResponseEntity<Watt> getWattByModel(@RequestParam String name, @RequestParam String model) {
        Watt watt = EnumUtil.getWattByModel(name, model);
        if (watt == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(watt);
    }
}
