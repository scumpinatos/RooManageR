
package entities;

/**
 * Classe che rappresenta una Stanza
 * @author emanuelegargiulo
 */
public class Stanza {
    
    private String numero;
    private String nomeStruttura;
    private String codiceFiscaleProprietario;
    private int tipo;
    private String descrizione;
    private float mq;
    private int agibile;
    private int libera;

    /**
     * Costruttore della classe che inizializza agibile e libera = 1
     */
    public Stanza() {
        agibile = 1;
        libera = 1;
    }

    /**
     *
     * @return
     */
    public String getNomeStruttura() {
        return nomeStruttura;
    }

    /**
     *
     * @param nomeStruttura
     */
    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    /**
     *
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public int getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
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
    public float getMq() {
        return mq;
    }

    /**
     *
     * @param mq
     */
    public void setMq(float mq) {
        this.mq = mq;
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

    /**
     *
     * @return
     */
    public int getLibera() {
        return libera;
    }

    /**
     *
     * @param libera
     */
    public void setLibera(int libera) {
        this.libera = libera;
    }

    /**
     *
     * @return
     */
    public String getCodiceFiscaleProprietario() {
        return codiceFiscaleProprietario;
    }

    /**
     *
     * @param codiceFiscaleProprietario
     */
    public void setCodiceFiscaleProprietario(String codiceFiscaleProprietario) {
        this.codiceFiscaleProprietario = codiceFiscaleProprietario;
    }

}
