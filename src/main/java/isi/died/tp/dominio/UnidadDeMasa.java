package isi.died.tp.dominio;

public class UnidadDeMasa extends UnidadDeMedida{

    public UnidadDeMasa(Unidad unidad){
        this.unidad = unidad;
    }

    public double factor(){
        switch(this.unidad){
            case KILO: return 1;
            case GRAMO: return 0.001;
        }
        return 0;
    }
}