package com.rubenrdc.pcbuilder.models;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class GPU extends Articulo implements Serializable {

    //Height Altura
    private static final long serialVersionUID = 1L;
    private String Type, ChipsetGpu, Serie, TypeMemory;
    private int VGA, DVI, HDMI, DisplayPorts, Height, Length, EnergyConsumption, MemoryVRam, SpeedMemory, RecommMinimWatts;

    public GPU(String title, String marca) {
        super(title, marca);
    }

    //Basic Information
    public GPU(ImageIcon imagen, String title, String marca, String Serie, int MemoryVRam) {
        super(imagen, title, marca);
        this.Serie = Serie;
        this.MemoryVRam = MemoryVRam;
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

    public int getMemoryVRam() {
        return MemoryVRam;
    }

    public int getSpeedMemory() {
        return SpeedMemory;
    }

    public int getRecommMinimWatts() {
        return RecommMinimWatts;
    }
}
