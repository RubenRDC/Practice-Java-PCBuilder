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
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

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

    private static PaqueteRecepcionClient sendPackagePet(int TYPE_PAQ, int TYPE_ART, Object PARAM) {
        try {
            Socket s = new Socket("localhost", 8765);
            ObjectOutputStream o = new ObjectOutputStream(s.getOutputStream());
            o.writeObject(new PaquetePeticionClient(TYPE_PAQ, TYPE_ART, PARAM));
            //System.out.println(PARAM);
            ObjectInputStream i = new ObjectInputStream(s.getInputStream());
            PaqueteRecepcionClient PackageRec = (PaqueteRecepcionClient) i.readObject();

            o.close();
            i.close();
            s.close();
            return PackageRec;
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible establecer la conexion con el servidor\n" + ex, "Error al establecer la conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void setListCPUs(int TYPE_CPU) {
        String TYPE = (TYPE_CPU == 0) ? "INTEL" : "AMD";
        this.listCPUs = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_CPU, TYPE));
    }

    public void setListMothers(String socketCPU) {
        this.listMothers = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_MOTHER, socketCPU));
    }

    public void setListCoolers(String socketCPU, int TDPCPU) {
        param.put("socketCPU", socketCPU);
        param.put("TDPCPU", TDPCPU);
        this.listCoolers = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_COOLER, param));
        param.clear();
    }

    public void setListRams(String Type) {
        this.listRams = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_RAM, Type));
    }

    public void setListGPUs() {
        this.listGPUs = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_GPU, null));
    }

    public void setListStorages() {
        this.listStorages = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_STORAGE, null));
    }

    public void setListPowers(int currentTotalW) {
        this.listPowers = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_POWER, currentTotalW));
    }

    public void setListTowers(String factorMother, String powerFactor, int lengthGPU, String TypeCooler, int highCooler, int CoolersFans, int sizeCoolerFans) {
        param.put("factorMother", factorMother);
        param.put("powerFactor", powerFactor);
        param.put("TypeCooler", TypeCooler);
        param.put("highCooler", highCooler);
        param.put("lenghtCoolerFans", (sizeCoolerFans * CoolersFans));
        param.put("lengthGPU", lengthGPU);
        this.listTowers = verificPackagePet(sendPackagePet(Paquete.TYPE_GET_LIST, Paquete.TYPE_TOWER, param));
        param.clear();
    }

    public static Articulo getMoreInfoArt(ObjectId idArt, int PaqueteTYPE_ART) {
        return sendPackagePet(Paquete.TYPE_GET_MORE_INFO, PaqueteTYPE_ART, idArt).getArtCompl();
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

    private List verificPackagePet(PaqueteRecepcionClient p) {
        if (p != null) {
            return p.getListArts();
        } else {
            return null;
        }
    }
}
