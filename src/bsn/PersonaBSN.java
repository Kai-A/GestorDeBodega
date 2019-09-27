package bsn;

import bsn.exception.CedulaInvalidaException;
import dao.PersonaDAOList;
import model.Persona;
import javafx.scene.control.Alert;

import java.util.List;

public class PersonaBSN {
    private PersonaDAOList personaDAO;

    public PersonaBSN(){
        personaDAO= new PersonaDAOList();
    }

    public void guardarPersona(Persona persona) throws CedulaInvalidaException {
        //todo validar reglas de negocio
        int d = 0;
        if (verificarSiEsNumero(persona.getNumeroDeDocumento())){
            d = Integer.parseInt(persona.getNumeroDeDocumento());
            if (d < 0) {
                throw new CedulaInvalidaException("valores negativos no aceptados en una cédula");

            }
        }

        else {
            throw new CedulaInvalidaException("La cédula debe ser un número");

        }
        personaDAO.guardarPersona(persona);

    }
    public void eliminarPersona(Persona persona){
        personaDAO.eliminarPersona(persona);
    }
    public List<Persona> listarPersonas() {
        List<Persona> personas = personaDAO.listarPersonas();
        return personas;
    }
    public boolean verificarSiEsNumero(String x){
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }

}
