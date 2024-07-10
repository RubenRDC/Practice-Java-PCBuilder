package com.rubenrdc.pcbuilder.models;

import java.io.Serializable;

/**
 *
 * @author Ruben
 */
public class Procesador extends Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    private int Ncores, NThreads, TDP, frequencyMaxRam;
    private double frequencyBase, frequencyTurbo;
    private String ChipsetGPU, Socket, TypeMemory, Family;
    private boolean includeCooler;

    public Procesador(String title, String marca) {
        super(title, marca);
    }

    //Basic Information
    public Procesador(String title, String marca, int Ncores, int NThreads, int frequencyTurbo) {
        super(title, marca);
        this.Ncores = Ncores;
        this.NThreads = NThreads;
        this.frequencyTurbo = frequencyTurbo;
    }

    public int getNcores() {
        return Ncores;
    }

    public int getNThreads() {
        return NThreads;
    }

    public int getTDP() {
        return TDP;
    }

    public int getFrequencyMaxRam() {
        return frequencyMaxRam;
    }

    public double getFrequencyBase() {
        return frequencyBase;
    }

    public double getFrequencyTurbo() {
        return frequencyTurbo;
    }

    public String getChipsetGPU() {
        return ChipsetGPU;
    }

    public String getSocket() {
        return Socket;
    }

    public String getTypeMemory() {
        return TypeMemory;
    }

    public boolean isIncludeCooler() {
        return includeCooler;
    }

    public String getFamily() {
        return Family;
    }
}
