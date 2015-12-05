
package entities;


public class Struttura {
 
    private String nome;
    private String indirizzo;
    private String codiceFiscaleAnagrafica;
    private String descrizione;
    private int agibile;

    public Struttura() {
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
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

    public int getAgibile() {
        return agibile;
    }

    public void setAgibile(int agibile) {
        this.agibile = agibile;
    }
    
}
