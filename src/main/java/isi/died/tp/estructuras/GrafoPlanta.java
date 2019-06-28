package isi.died.tp.estructuras;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.Planta;
public class GrafoPlanta extends Grafo<Planta> {
    public void imprimirDistanciaAdyacentes(Planta inicial) {
        List<Planta> adyacentes = super.getAdyacentes(inicial);
        for(Planta unAdyacente: adyacentes) {
            Arista<Planta> camino = super.buscarArista(inicial, unAdyacente);
            System.out.println("camino de "+inicial.getNombre()+" a "+
                    unAdyacente.getNombre()+ " tiene valor de "+ camino.getValor() );
        }
    }
    // a
    public Planta buscarPlanta(Planta inicial, Insumo i, Integer saltos) {

        boolean encontrado=false;
        List<Planta> listaPlantas;
        listaPlantas = getAdyacentes(inicial);
        for(int a=saltos;a>=0;a--) {
            for (Planta p : listaPlantas) {
                if (p.necesitaInsumo(i)) return p;
            }
            List<Planta> auxLista = new ArrayList<>();
            for (Planta p : listaPlantas) {
                auxLista.addAll(getAdyacentes(p));
            }
            listaPlantas = auxLista;
        }

        return null;

        }
    // b
    public Planta buscarPlanta(Planta inicial, Insumo i) {

       return null;
    }
    // c
    public Planta buscarPlanta(Insumo i) {

        this.get.stream().map((p) -> p.necesitaInsumo(i));
    }
}
