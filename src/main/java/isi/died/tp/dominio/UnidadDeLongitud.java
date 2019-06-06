package isi.died.tp.dominio;

public class UnidadDeLongitud extends UnidadDeMedida{

    public UnidadDeLongitud(Unidad unidad){
        this.unidad = unidad;
    }

    public double factor(){
        switch(this.unidad){
            case M: return 1;
            case CM: return 0.01;
        }
        return 0;
    }
}