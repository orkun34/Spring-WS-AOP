package com.lombardi.soap.aop.model.pojo;

public class Computer {

    String hdd;
    String ram;
    Double ghz;
    String type;

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Double getGhz() {
        return ghz;
    }

    public void setGhz(Double ghz) {
        this.ghz = ghz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Computer(String hdd, String ram, Double ghz, String type) {
        this.hdd = hdd;
        this.ram = ram;
        this.ghz = ghz;
        this.type = type;
    }
}
