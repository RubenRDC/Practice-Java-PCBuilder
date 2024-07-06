package com.rubenrdc.pcbuilder.models;

/**
 *
 * @author Ruben
 */
public class Almacenamiento extends Articulo{
    //Type SDD/HDD
    //Interfaz Sata NVMe
    private String Type,Factor;
    private int TDP,Capacity,Cache,MaxReadSquential,MaxWriteSquential,EnergyConsumption;
    
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

    public int getTDP() {
        return TDP;
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
    
}
