package com.rubenrdc.pcbuilder.models.list;

import com.rubenrdc.pcbuilder.models.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ruben
 */
public class ListaSeleccion<E extends Articulo> extends ArrayList<E> {

    private List<Object[]> RowArtsAndCant = new ArrayList<>();
    private List<Integer> cantArts = new ArrayList<>();

    public ListaSeleccion() {

    }

    @Override
    public boolean add(E e) {
        return addArt(e);
    }

    private boolean addArt(E Art) {
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
                    return true;
                }
            } else {
                this.set(duplicateTypeIndex, Art);
            }

        } else {
            cantArts.add(1);
            super.add(Art);
            return true;
        }
        return false;
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
        for (Object[] objects : RowArtsAndCant) {
            System.out.println(Arrays.toString(objects));
        }
        return RowArtsAndCant;
    }

    @Override
    public E remove(int index) {
        
        for (int i = (this.size()-1); i >= index; i--) {
            cantArts.remove(i);
            super.remove(i);
        }
        return null;
    }

    @Override
    public void clear() {
        cantArts.clear();
        super.clear();
    }

    /*Si el articulo pertence a una de las clases retornara 
        false para q no se cargue en el Array.
     */
    private <Y extends Articulo> boolean filterByType(E listArt, Y artRecibido) {
        if (listArt.getClass() == artRecibido.getClass()) {
            if (listArt instanceof GPU || listArt instanceof MotherBoard || listArt instanceof Procesador || listArt instanceof Cooler || listArt instanceof Fuente || listArt instanceof Gabinete) {
                return true;
            }
        }
        return false;
    }

    private boolean isEnabledDuplicateType(E artRecibido) {
        for (E listActual : this) {
            if (filterByType(listActual, artRecibido)) {

                //Duplicado no permitido
                return false;
            }
        }
        return true;
    }

    private int getDuplicateIndexType(E artRecibido) {
        for (int i = 0; i < this.size(); i++) {
            if (filterByType(this.get(i), artRecibido)) {
                //Duplicado no permitido
                return i;
            }
        }
        return -1;
    }

}
