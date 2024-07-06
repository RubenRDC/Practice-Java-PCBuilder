package com.rubenrdc.pcbuilder.models;

/**
 *
 * @author Ruben
 */
public class GPU extends Articulo{
    //Height Altura
    private String Type,ChipsetGpu,Serie,TypeMemory;
    private int CoolersFans,VGA,DVI,HDMI,DisplayPorts,Height,Length,EnergyConsumption,CapacityMemory;
    
    public GPU(String title, String marca) {
        super(title, marca);
    }
    //Basic Information
    public GPU(String title, String marca,String Serie,int CapacityMemory) {
        super(title, marca);
        this.Serie=Serie;
        this.CapacityMemory=CapacityMemory;
    }

    public String getType() {
        return Type;
    }

    public String getChipsetGpu() {
        return ChipsetGpu;
    }

    public String getSerie() {
        return Serie;
    }

    public String getTypeMemory() {
        return TypeMemory;
    }

    public int getCoolersFans() {
        return CoolersFans;
    }

    public int getVGA() {
        return VGA;
    }

    public int getDVI() {
        return DVI;
    }

    public int getHDMI() {
        return HDMI;
    }

    public int getDisplayPorts() {
        return DisplayPorts;
    }

    public int getHeight() {
        return Height;
    }

    public int getLength() {
        return Length;
    }

    public int getEnergyConsumption() {
        return EnergyConsumption;
    }

    public int getCapacityMemory() {
        return CapacityMemory;
    }
    
}
