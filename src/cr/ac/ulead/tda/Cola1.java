package cr.ac.ulead.tda;

import com.company.Mascota;

public class Cola1 {
    Mascota mascota = new Mascota();
    Mascota[] colamascotas;

    private int vacio=0;
    private  int tamanocola;
    private  int posicioneliminar=0;
    private int posicioninsertar=-1;
    private int posicionmostrar=0;
    private int nuevollenado=0;

    public Cola1(int tamano){
        this.tamanocola=tamano;
        colamascotas=new Mascota[tamano];

    }

    public Mascota mortrarturno(){
        if(posicionmostrar==tamanocola){
            posicionmostrar=0;
        }
        mascota=colamascotas[posicionmostrar];
        return mascota;
    }

    public void insertar(Mascota mascota){
        if(posicioninsertar<tamanocola-1) {
            posicioninsertar++;
            colamascotas[posicioninsertar] = mascota;
        }else if (vacio>0){
            colamascotas[nuevollenado]=mascota;
            nuevollenado++;
            vacio--;
        }
    }

    public boolean colallena(){
        boolean estallena=false;
        if(posicioninsertar==tamanocola-1&&vacio==0){
            estallena=true;
        }
        return estallena;
    }
    public boolean colavacia(){
        boolean estavacia=false;
        if(posicioninsertar==-1 ||vacio==4){
            estavacia=true;
        }
        return estavacia;
    }

    public void eliminar(){
        if(posicioneliminar==tamanocola){
            tamanocola=0;
        }
        colamascotas[posicioneliminar]=null;
        posicioneliminar++;
        posicionmostrar++;
        if(vacio<tamanocola){
            vacio++;
        }else {
            vacio=0;
        }
    }

    public void vercola(){
        for( int i=0; i<=colamascotas.length-1;i++){
            System.out.println("Hola");
        }
    }
}

