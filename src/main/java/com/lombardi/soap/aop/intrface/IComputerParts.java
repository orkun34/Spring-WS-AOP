package com.lombardi.soap.aop.intrface;

import com.lombardi.soap.aop.model.pojo.Computer;

public interface IComputerParts {

    Computer getComputerPartsByType(String type);
}
