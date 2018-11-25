package com.lombardi.soap.aop.config;


import com.lombardi.soap.aop.model.pojo.Computer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties("computer")
public class ComputerProp {

    private String partList;

    public String getPartList() {
        return partList;
    }

    public void setPartList(String partList) {
        this.partList = partList;
    }


    public List<Computer> getCustomerIdList() {
        List<Computer> computerList = new ArrayList<>();

        List<String> partListElement = new ArrayList(Arrays.asList(partList.split(":")));
        for (String parts : partListElement){
            String[] innerParts = parts.split(",");
            List<String> innerPartsElement = Arrays.asList(innerParts);
            Computer computer = new Computer(innerPartsElement.get(0),innerPartsElement.get(1),Double.valueOf(innerPartsElement.get(2)),innerPartsElement.get(3));
            computerList.add(computer);
        }
        return computerList;
    }
}
