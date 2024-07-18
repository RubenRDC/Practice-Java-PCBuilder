package com.rubenrdc.pcbuilderserver.logic;

import com.rubenrdc.pcbuilder.models.Almacenamiento;
import com.rubenrdc.pcbuilder.models.Articulo;
import com.rubenrdc.pcbuilder.models.Cooler;
import com.rubenrdc.pcbuilder.models.Fuente;
import com.rubenrdc.pcbuilder.models.GPU;
import com.rubenrdc.pcbuilder.models.Gabinete;
import com.rubenrdc.pcbuilder.models.MotherBoard;
import com.rubenrdc.pcbuilder.models.Procesador;
import com.rubenrdc.pcbuilder.models.Ram;
import com.rubenrdc.pcbuilderserver.models.paquete.Paquete;
import com.rubenrdc.pcbuilderserver.models.paquete.PaquetePeticionClient;
import com.rubenrdc.pcbuilderserver.models.paquete.PaqueteRecepcionClient;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Ruben
 */
public class LogicPacksAL<T extends Articulo> {

    private List<Procesador> listCPUs;
    private List<MotherBoard> listMothers;
    private List<Cooler> listCoolers;
    private List<Ram> listRams;
    private List<GPU> listGPUs;
    private List<Almacenamiento> listStorages;
    private List<Fuente> listPowers;
    private List<Gabinete> listTowers;
    private final HashMap param = new HashMap();

    public LogicPacksAL() {
    }

    private T Articulo;

    public PaqueteRecepcionClient sendPackagePet(int TYPE_PAQ, int TYPE_ART, Object PARAM) {
        try {
            Socket s = new Socket("localhost", 8765);
            ObjectOutputStream o = new ObjectOutputStream(s.getOutputStream());
            o.writeObject(new PaquetePeticionClient(TYPE_PAQ, TYPE_ART, PARAM));

            ObjectInputStream i = new ObjectInputStream(s.getInputStream());
            PaqueteRecepcionClient PackageRec = (PaqueteRecepcionClient) i.readObject();

            o.close();
            i.close();
            s.close();
            return PackageRec;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public void setListCPUs(int TYPE_CPU) {
        String TYPE = (TYPE_CPU == 0) ? "INTEL" : "AMD";

        this.listCPUs = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_CPU, TYPE).getListArts();
    }

    public void setListMothers(String socketCPU) {
        this.listMothers = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_MOTHER, socketCPU).getListArts();
    }

    public void setListCoolers(String socketCPU, int TDPCPU) {
        param.clear();
        param.put("socketCPU", socketCPU);
        param.put("TDPCPU", TDPCPU);
        this.listCoolers = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_COOLER, param).getListArts();
    }

    public void setListRams(String Type) {
        this.listRams = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_RAM, Type).getListArts();
    }

    public void setListGPUs() {
        this.listGPUs = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_GPU, null).getListArts();
    }

    public void setListStorages() {
        this.listStorages = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_GPU, null).getListArts();
    }

    public void setListPowers(int currentTotalW) {
        this.listPowers = sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_POWER, currentTotalW).getListArts();
    }

    public void setListTowers(String factorMother, String powerFactor, int lengthGPU,String TypeCooler) {
        param.clear();
        param.put("factorMother", factorMother);
        param.put("powerFactor", powerFactor);

        //this.listTowers = listTowers;
    }

    public void setArticulo(T Articulo) {
        this.Articulo = Articulo;
    }

    public List<Procesador> getListCPUs() {
        return listCPUs;
    }

    public List<MotherBoard> getListMothers() {
        return listMothers;
    }

    public List<Cooler> getListCoolers() {
        return listCoolers;
    }

    public List<Ram> getListRams() {
        return listRams;
    }

    public List<GPU> getListGPUs() {
        return listGPUs;
    }

    public List<Almacenamiento> getListStorages() {
        return listStorages;
    }

    public List<Fuente> getListPowers() {
        return listPowers;
    }

    public List<Gabinete> getListTowers() {
        return listTowers;
    }
}
