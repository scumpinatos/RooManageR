package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author ScumpinatoS
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Anagrafica {

    private String nome;
    private String cognome;

    public Anagrafica(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Anagrafica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
}
