package com.rubenrdc.pcbuilder.models;

import java.io.Serializable;

/**
 *
 * @author Ruben
 */
public class Cooler extends Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    private int TDP, highCooler, sizeCooler, sizeCoolerFans, EnergyConsumption, CoolersFans;
    private String Socket, Type;

    public Cooler(String title, String marca) {
        super(title, marca);
    }

    //Basic Information
    public Cooler(String title, String marca, String Type, int TDP) {
        super(title, marca);
        this.Type = Type;
        this.TDP = TDP;
    }

    public int getTDP() {
        return TDP;
    }

    public int getHighCooler() {
        return highCooler;
    }

    public int getSizeCooler() {
        return sizeCooler;
    }

    public int getEnergyConsumption() {
        return EnergyConsumption;
    }

    public int getCoolersFans() {
        return CoolersFans;
    }

    public String getSocket() {
        return Socket;
    }

    public String getType() {
        return Type;
    }

    public int getSizeCoolerFans() {
        return sizeCoolerFans;
    }

}
