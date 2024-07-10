package com.rubenrdc.pcbuilder.models;

import java.io.Serializable;

/**
 *
 * @author Ruben
 */
public class Fuente extends Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    private int RatedWatts, RealWatts, SataConnections;
    private String WiringType, Certification, Factor;
    private boolean Pin24Connector, IncludeCable;

    public Fuente(String title, String marca) {
        super(title, marca);
    }

    //Basic Information
    public Fuente(String title, String marca, int RealWatts, String Factor) {
        super(title, marca);
        this.RealWatts = RealWatts;
        this.Factor = Factor;
    }

    public int getRatedWatts() {
        return RatedWatts;
    }

    public int getRealWatts() {
        return RealWatts;
    }

    public int getSataConnections() {
        return SataConnections;
    }

    public String getWiringType() {
        return WiringType;
    }

    public String getCertification() {
        return Certification;
    }

    public String getFactor() {
        return Factor;
    }

    public boolean isPin24Connector() {
        return Pin24Connector;
    }

    public boolean isIncludeCable() {
        return IncludeCable;
    }
}
