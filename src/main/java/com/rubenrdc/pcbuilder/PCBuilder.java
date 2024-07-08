package com.rubenrdc.pcbuilder;

/**
 *
 * @author Ruben
 */
public class PCBuilder {

    public static void main(String[] args) {
        FrameAdmin frameAdmin = new FrameAdmin(null);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_SELECT_FAMILY, -1);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_STORAGE);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_COOLER);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_POWER);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_GPU);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_TOWER);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_MOTHER);
        //frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_PROCESSOR);
        frameAdmin.OpenNewFrame(FrameAdmin.TYPE_INFO_ART, FrameAdmin.SUBTYPE_INFO_RAM);
    }
}
