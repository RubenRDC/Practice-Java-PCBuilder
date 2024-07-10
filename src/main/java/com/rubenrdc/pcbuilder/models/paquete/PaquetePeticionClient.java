package com.rubenrdc.pcbuilder.models.paquete;

import java.io.Serializable;

/**
 *
 * @author Ruben
 */
public class PaquetePeticionClient extends Paquete implements Serializable {

    private static final long serialVersionUID = 1L;
    //int TYPE_PAQ, int TYPE_ART;
    private final int TYPE_PAQ, TYPE_ART;
    private int param;
    
    //Solicitud de lista.
    public PaquetePeticionClient(int TYPE_PAQ, int TYPE_ART) {
        this.TYPE_PAQ = TYPE_PAQ;
        this.TYPE_ART = TYPE_ART;
    }
    
    //Solicitud de mas informacion.
    public PaquetePeticionClient(int TYPE_PAQ, int TYPE_ART, int param) {
        this.TYPE_PAQ = TYPE_PAQ;
        this.TYPE_ART = TYPE_ART;
        this.param = param;
    }

    public int getTYPE_PAQ() {
        return TYPE_PAQ;
    }

    public int getTYPE_ART() {
        return TYPE_ART;
    }

    public int getParam() {
        return param;
    }

}
