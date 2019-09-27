package dao;

import model.Persona;

import java.util.List;

public interface PersonaDAO {
    void guardarPersona(Persona persona);
    List<Persona> listarPersonas();

}
