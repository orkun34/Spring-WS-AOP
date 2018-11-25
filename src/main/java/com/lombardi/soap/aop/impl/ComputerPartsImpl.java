package com.lombardi.soap.aop.impl;

import com.lombardi.soap.aop.config.ComputerProp;
import com.lombardi.soap.aop.intrface.IComputerParts;
import com.lombardi.soap.aop.model.pojo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComputerPartsImpl implements IComputerParts {

    @Autowired
    ComputerProp prop;


    @Override
    public Computer getComputerPartsByType(String type) {

        for (Computer comp : prop.getCustomerIdList()){
            if (comp.getType().equals(type)){
                return comp;
            }
        }
        return new Computer("","",0.0d,"");
    }




}
