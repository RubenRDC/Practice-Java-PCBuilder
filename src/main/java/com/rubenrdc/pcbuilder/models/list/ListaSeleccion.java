package com.rubenrdc.pcbuilder.models.list;

import com.rubenrdc.pcbuilder.models.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben
 */
public class ListaSeleccion<T extends Articulo> extends ArrayList<T> {

    private List<Object[]> RowArtsAndCant = new ArrayList<>();
    private List<Integer> cantArts = new ArrayList<>();

    private MotherBoard motherSeleccionada;
    private Procesador procesadorSeleccionada;
    private Cooler coolerSeleccionada;
    private GPU gpuSeleccionada;
    private Fuente fuenteSeleccionada;

    public ListaSeleccion() {

    }

    @Override
    public boolean add(T e) {
        return addArt(e);
    }

    public boolean add(T e, int cant) {
        return addArt(e, cant);
    }

    private boolean addArt(T Art) {
        if (!this.isEmpty()) {
            //Obtengo el index del objeto q coincida con el recibido en parametros
            int indexOf = this.indexOf(Art);

            int duplicateTypeIndex = getDuplicateIndexType(Art);

            if (duplicateTypeIndex == -1) {
                if (indexOf != -1) {
                    cantArts.set(indexOf, (cantArts.get(indexOf) + 1));
                } else {
                    cantArts.add(1);
                    super.add(Art);
                }
                setReusableObject(Art);
            } else {
                this.set(duplicateTypeIndex, Art);
            }
        } else {
            setReusableObject(Art);
            cantArts.add(1);
            super.add(Art);
        }
        return true;
    }

    private boolean addArt(T Art, int cant) {
        if (!this.isEmpty()) {
            //Obtengo el index del objeto q coincida con el recibido en parametros
            int indexOf = this.indexOf(Art);

            int duplicateTypeIndex = getDuplicateIndexType(Art);

            if (duplicateTypeIndex == -1) {
                if (indexOf != -1) {
                    cantArts.set(indexOf, (cantArts.get(indexOf) + cant));
                } else {
                    cantArts.add(cant);
                    super.add(Art);
                }
                setReusableObject(Art);
            } else {
                this.set(duplicateTypeIndex, Art);
                this.cantArts.set(duplicateTypeIndex, cant);
            }
        } else {
            setReusableObject(Art);
            cantArts.add(cant);
            super.add(Art);
        }
        return true;
    }

    public List<Object[]> getListTitleAndCant() {
        RowArtsAndCant.clear();
        Object[] aux;
        for (int i = 0; i < this.size(); i++) {
            aux = new Object[2];
            aux[0] = this.get(i).getTitle();
            aux[1] = cantArts.get(i);
            RowArtsAndCant.add(aux);
        }
        return RowArtsAndCant;
    }

    @Override
    public T remove(int index) {
        T LastElement = null;
        for (int i = (this.size() - 1); i >= index; i--) {
            cantArts.remove(i);
            LastElement = super.remove(i);
        }
        return LastElement;
    }

    @Override
    public void clear() {
        cantArts.clear();
        super.clear();
    }

    /**
     *
     * @param <Y> Objeto que herede de Articulo
     * @param elementList El Objeto a verificar
     * @param artRecibido El Objeto que se intenta añadir
     * @return Retorna True si es un objeto que no tiene permitido estar
     * duplicado o excede la cantidad permitida, caso contrario False.
     */
    private <Y extends Articulo> boolean filterByType(T elementList, Y artRecibido) {
        if (elementList.getClass() == artRecibido.getClass()) {
            if (setReusableObject(elementList)) {
                return true;
            } else if (elementList instanceof Gabinete) {
                return true;
            } else if (elementList instanceof Ram) {
                //if (motherSeleccionada.getMemorySlots() >= this.cantArts.get(indexArtThisList)) {
                return true;
                //}
            }
        }
        return false;
    }

    private boolean setReusableObject(T object) {
        if (object instanceof MotherBoard motherBoard) {
            motherSeleccionada = motherBoard;
            return true;
        } else if (object instanceof Procesador procesador) {
            procesadorSeleccionada = procesador;
            return true;
        } else if (object instanceof Cooler cooler) {
            coolerSeleccionada = cooler;
            return true;
        } else if (object instanceof GPU gpu) {
            gpuSeleccionada = gpu;
            return true;
        } else if (object instanceof Fuente fuente) {
            fuenteSeleccionada = fuente;
            return true;
        }
        return false;
    }

    /**
     * Corrobora si en la lista se encuentra un elemento que pertenezca a la
     * misma clase que el articulo que se intenta añadir.
     *
     * @param artRecibido El articulo que se intenta cargar a la lista.
     * @return Retorna el indice en el que se encuentra el elemento si es un
     * objeto que no tiene permitido estar duplicado o excede la cantidad
     * permitida, caso contrario [-1].
     */
    private int getDuplicateIndexType(T artRecibido) {
        for (int i = 0; i < this.size(); i++) {
            if (filterByType(this.get(i), artRecibido)) {
                //Duplicado no permitido
                return i;
            }
        }
        return -1;
    }

    public int getConsumoActual() {
        int total = 0;
        for (T e : this) {
            total += e.getEnergyConsumption();
        }
        return total;
    }

    public T getSeleccionExpecifica(String Class) {
        for (T e : this) {
            if (e.getClass().getSimpleName().equalsIgnoreCase(Class)) {
                return e;
            }
        }
        return null;
    }

    public MotherBoard getMotherSeleccionada() {
        return motherSeleccionada;
    }

    public Procesador getProcesadorSeleccionada() {
        return procesadorSeleccionada;
    }

    public Cooler getCoolerSeleccionada() {
        return coolerSeleccionada;
    }

    public GPU getGpuSeleccionada() {
        return gpuSeleccionada;
    }

    public Fuente getFuenteSeleccionada() {
        return fuenteSeleccionada;
    }

}
