
package entities;

/**
 *
 * @author Giandomenico
 */
public class Struttura {
 
    private int id;
    private String nome;
    private String indirizzo;
    private String codicefiscaleanagrafica;
    private String descrizione;

    public Struttura() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCodicefiscaleanagrafica() {
        return codicefiscaleanagrafica;
    }

    public void setCodicefiscaleanagrafica(String codicefiscaleanagrafica) {
        this.codicefiscaleanagrafica = codicefiscaleanagrafica;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
