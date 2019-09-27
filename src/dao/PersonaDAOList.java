package dao;

import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOList implements PersonaDAO {
    private  static List<Persona> personas = new ArrayList();
    @Override
    public void guardarPersona(Persona persona) { personas.add(persona); }

    public void eliminarPersona(Persona persona){
        personas.remove(persona);
    }

    @Override
    public List<Persona> listarPersonas() {
        return personas;
    }



}
