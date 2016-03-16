
package entities;

/**
 * Classe che rappresenta una struttura
 * @author emanuelegargiulo
 */
public class Struttura {
 
    private String nome;
    private String indirizzo;
    private String codiceFiscaleAnagrafica;
    private int nStanze;
    private String descrizione;
    private int agibile;

    /**
     *
     */
    public Struttura() {
        nStanze = 0;
    }

    /**
     *
     * @return
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     *
     * @param indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     *
     * @return
     */
    public String getCodiceFiscaleAnagrafica() {
        return codiceFiscaleAnagrafica;
    }

    /**
     *
     * @param codiceFiscaleAnagrafica
     */
    public void setCodiceFiscaleAnagrafica(String codiceFiscaleAnagrafica) {
        this.codiceFiscaleAnagrafica = codiceFiscaleAnagrafica;
    }

    /**
     *
     * @return
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     *
     * @param descrizione
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public int getAgibile() {
        return agibile;
    }

    /**
     *
     * @param agibile
     */
    public void setAgibile(int agibile) {
        this.agibile = agibile;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }
    
}
