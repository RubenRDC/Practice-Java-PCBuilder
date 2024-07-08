package com.rubenrdc.pcbuilder.models;

/**
 *
 * @author Ruben
 */
public class Almacenamiento extends Articulo{
    //Type SDD/HDD
    //Interface Sata NVMe
    //ConnectionType M2,Sata,Etc
    private String Type,Factor,ConnectionType,Interface;
    private int Capacity,Cache,MaxReadSquential,MaxWriteSquential,EnergyConsumption,UsefulLife;
    
    public Almacenamiento(String title, String marca) {
        super(title, marca);
    }
    //Basic Information
    public Almacenamiento(String title, String marca,String Type,String Factor) {
        super(title, marca);
        this.Type=Type;
        this.Factor=Factor;
    }

    public String getType() {
        return Type;
    }

    public String getFactor() {
        return Factor;
    }

    public int getCapacity() {
        return Capacity;
    }

    public int getCache() {
        return Cache;
    }

    public int getMaxReadSquential() {
        return MaxReadSquential;
    }

    public int getMaxWriteSquential() {
        return MaxWriteSquential;
    }

    public int getEnergyConsumption() {
        return EnergyConsumption;
    }

    public String getConnectionType() {
        return ConnectionType;
    }

    public String getInterface() {
        return Interface;
    }

    public int getUsefulLife() {
        return UsefulLife;
    }
    
}
