package com.rubenrdc.pcbuilder.models;

/**
 *
 * @author Ruben
 */
public class Gabinete extends Articulo{
    
    private String FactorMother,PowerFactor;
    private boolean Window,SoportWaterRadiator;
    private int TypeWindow,Width,Height,Length,SoportCoolersFan80,
            SoportCoolersFan120,SoportCoolersFan140,SoportCoolersFan200,
            MaxSoportCoolerHeight,SoportRadiator240,SoportRadiator280,
            SoportRadiator360,SoportRadiator420,StorageSlots,SoportFactor2_5,
            SoportFactor3_25,SoportFactor3_5,SoportFactor5_25;
    
    public Gabinete(String title, String marca) {
        super(title, marca);
    }
    //Basic Information
    public Gabinete(String title, String marca,String FactorMother,String PowerFactor){
        super(title, marca);
        this.FactorMother = FactorMother;
        this.PowerFactor=PowerFactor;
    }

    public String getFactorMother() {
        return FactorMother;
    }

    public String getPowerFactor() {
        return PowerFactor;
    }

    public boolean isWindow() {
        return Window;
    }

    public boolean isSoportWaterRadiator() {
        return SoportWaterRadiator;
    }

    public int getTypeWindow() {
        return TypeWindow;
    }

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public int getLength() {
        return Length;
    }

    public int getSoportCoolersFan80() {
        return SoportCoolersFan80;
    }

    public int getSoportCoolersFan120() {
        return SoportCoolersFan120;
    }

    public int getSoportCoolersFan140() {
        return SoportCoolersFan140;
    }

    public int getSoportCoolersFan200() {
        return SoportCoolersFan200;
    }

    public int getMaxSoportCoolerHeight() {
        return MaxSoportCoolerHeight;
    }

    public int getSoportRadiator240() {
        return SoportRadiator240;
    }

    public int getSoportRadiator280() {
        return SoportRadiator280;
    }

    public int getSoportRadiator360() {
        return SoportRadiator360;
    }

    public int getSoportRadiator420() {
        return SoportRadiator420;
    }

    public int getStorageSlots() {
        return StorageSlots;
    }

    public int getSoportFactor2_5() {
        return SoportFactor2_5;
    }

    public int getSoportFactor3_25() {
        return SoportFactor3_25;
    }

    public int getSoportFactor3_5() {
        return SoportFactor3_5;
    }

    public int getSoportFactor5_25() {
        return SoportFactor5_25;
    }
    
}
