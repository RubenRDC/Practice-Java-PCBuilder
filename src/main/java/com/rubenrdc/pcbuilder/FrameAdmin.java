package com.rubenrdc.pcbuilder;

import com.rubenrdc.pcbuilder.IGU.InfoArts.CoolerInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.GPUInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.MotherBoardInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.PowerInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.CPUInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.RamInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.StorageInfoIGU;
import com.rubenrdc.pcbuilder.IGU.InfoArts.TowerIGU;
import com.rubenrdc.pcbuilder.IGU.PCBuilderIGU;
import com.rubenrdc.pcbuilder.IGU.SelectStart;
import com.rubenrdc.pcbuilder.IGU.SelectedListArtIGU;
import com.rubenrdc.pcbuilder.models.Almacenamiento;
import com.rubenrdc.pcbuilder.models.Articulo;
import com.rubenrdc.pcbuilder.models.Cooler;
import com.rubenrdc.pcbuilder.models.Fuente;
import com.rubenrdc.pcbuilder.models.GPU;
import com.rubenrdc.pcbuilder.models.Gabinete;
import com.rubenrdc.pcbuilder.models.MotherBoard;
import com.rubenrdc.pcbuilder.models.Procesador;
import com.rubenrdc.pcbuilder.models.Ram;
import javax.swing.JFrame;

/**
 *
 * @author Ruben
 */
public class FrameAdmin {

    public static final int TYPE_SELECT_FAMILY = -1, TYPE_MAIN = 0, TYPE_INFO_ART = 1, TYPE_SELECTED_ART_LIST = 2;
    public static final int SUBTYPE_INFO_STORAGE = 0, SUBTYPE_INFO_COOLER = 1,
            SUBTYPE_INFO_POWER = 2, SUBTYPE_INFO_GPU = 3,
            SUBTYPE_INFO_TOWER = 4, SUBTYPE_INFO_MOTHER = 5,
            SUBTYPE_INFO_CPU = 6, SUBTYPE_INFO_RAM = 7;

    private final JFrame fatherFrame;

    public FrameAdmin(JFrame fatherFrame) {
        this.fatherFrame = fatherFrame;
    }

    public void OpenNewFrame(int TYPE) {
        switch (TYPE) {
            case TYPE_SELECT_FAMILY -> {
                SelectStart pc = new SelectStart();
                pc.setLocationRelativeTo(null);
                pc.setVisible(true);
            }

            case TYPE_SELECTED_ART_LIST -> {
                SelectedListArtIGU selectedListArtIGU = new SelectedListArtIGU(fatherFrame, true);
                selectedListArtIGU.setLocationRelativeTo(null);
                selectedListArtIGU.setVisible(true);
            }
        }
    }

    public void OpenNewFrame(int TYPE, int SubType) {
        switch (TYPE) {
            case TYPE_MAIN -> {
                PCBuilderIGU pc = new PCBuilderIGU(SubType);
                pc.setLocationRelativeTo(null);
                pc.setVisible(true);
            }
            default -> {
            }
        }
    }

    public <E extends Articulo> void OpenNewFrame(int TYPE, int SubType, E e) {
        if (e != null & TYPE == TYPE_INFO_ART) {
            switch (SubType) {
                case SUBTYPE_INFO_STORAGE -> {
                    StorageInfoIGU storageInfoIGU = new StorageInfoIGU(fatherFrame, true, (Almacenamiento) e);
                    storageInfoIGU.setLocationRelativeTo(null);
                    storageInfoIGU.setVisible(true);
                }
                case SUBTYPE_INFO_COOLER -> {
                    CoolerInfoIGU coolerInfoIGU = new CoolerInfoIGU(fatherFrame, true, (Cooler) e);
                    coolerInfoIGU.setLocationRelativeTo(null);
                    coolerInfoIGU.setVisible(true);
                }
                case SUBTYPE_INFO_POWER -> {
                    PowerInfoIGU powerInfoIGU = new PowerInfoIGU(fatherFrame, true, (Fuente) e);
                    powerInfoIGU.setLocationRelativeTo(null);
                    powerInfoIGU.setVisible(true);
                }
                case SUBTYPE_INFO_GPU -> {
                    GPUInfoIGU gpuInfoIGU = new GPUInfoIGU(fatherFrame, true, (GPU) e);
                    gpuInfoIGU.setLocationRelativeTo(null);
                    gpuInfoIGU.setVisible(true);
                }
                case SUBTYPE_INFO_TOWER -> {
                    TowerIGU towerIGU = new TowerIGU(fatherFrame, true, (Gabinete) e);
                    towerIGU.setLocationRelativeTo(null);
                    towerIGU.setVisible(true);
                }
                case SUBTYPE_INFO_MOTHER -> {
                    MotherBoardInfoIGU motherBoardInfoIGU = new MotherBoardInfoIGU(fatherFrame, true, (MotherBoard) e);
                    motherBoardInfoIGU.setLocationRelativeTo(null);
                    motherBoardInfoIGU.setVisible(true);
                }
                case SUBTYPE_INFO_CPU -> {
                    CPUInfoIGU processorInfoIGU = new CPUInfoIGU(fatherFrame, true, (Procesador) e);
                    processorInfoIGU.setLocationRelativeTo(null);
                    processorInfoIGU.setVisible(true);
                }
                case SUBTYPE_INFO_RAM -> {
                    RamInfoIGU ramInfoIGU = new RamInfoIGU(fatherFrame, true, (Ram) e);
                    ramInfoIGU.setLocationRelativeTo(null);
                    ramInfoIGU.setVisible(true);
                }
                default -> {
                }
            }
        } else {
            OpenNewFrame(TYPE, SubType);
        }
    }
}
