package Recuperación.clases;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda(ArrayList<Contacto> contactos){
        this.contactos=contactos;
    }

    public boolean anadirContacto(Contacto contacto){
        boolean contactoAñadido=false;
        if (existeContacto(contacto.getNombre())){
            throw new IllegalArgumentException("El nombre del contacto ya se encuentra registrado.");
        }else{
            contactos.add(contacto);
            contactoAñadido = true;
        }
        return contactoAñadido;
    }

    public boolean eliminarContacto(String nombre){
        boolean contactoEliminado=false;
        if (existeContacto(contacto.ge))
    }

    public boolean existeContacto(String nombre){
        boolean existeContacto = false;
        for (int i=0;i<this.contactos.size();i++){
            if (nombre.equals(contactos.get(i).getNombre())){
                existeContacto=true;
            }
        }
        return existeContacto;
    }

}
