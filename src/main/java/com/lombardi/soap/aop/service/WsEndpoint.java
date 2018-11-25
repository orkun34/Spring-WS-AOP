package com.lombardi.soap.aop.service;

import com.lombardi.soap.aop.intrface.IComputerParts;
import com.lombardi.soap.aop.model.generated.ComputerPartsRequest;
import com.lombardi.soap.aop.model.generated.ComputerPartsResponse;
import com.lombardi.soap.aop.model.pojo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class WsEndpoint {

    @Autowired
    IComputerParts computerParts;

    @PayloadRoot(namespace = "http://www.lombardi-soap-aop/Computer/",
            localPart = "ComputerPartsRequest")
    @ResponsePayload
    public ComputerPartsResponse getComputerParts(@RequestPayload ComputerPartsRequest request) {
        ComputerPartsResponse response = new ComputerPartsResponse();
        Computer computer = computerParts.getComputerPartsByType(request.getComputerType());
        return generateResponse(computer);

    }


    ComputerPartsResponse generateResponse(Computer computer){
        ComputerPartsResponse response = new ComputerPartsResponse();
        com.lombardi.soap.aop.model.generated.Computer genComputer = new com.lombardi.soap.aop.model.generated.Computer();
        genComputer.setGhz(computer.getGhz());
        genComputer.setHDD(computer.getHdd());
        genComputer.setRAM(computer.getRam());
        genComputer.setType(computer.getType());
        response.setComputer(genComputer);

        return response;
    }

}
