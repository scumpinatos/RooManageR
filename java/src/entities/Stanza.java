
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
    private int permanenza;
    private int visita;

    /**
     * Costruttore della classe che inizializza agibile e libera = 1
     */
    public Stanza() {
        agibile = 1;
        permanenza = 0;
        visita = 0;
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

    public int getPermanenza() {
        return permanenza;
    }

    public void setPermanenza(int permanenza) {
        this.permanenza = permanenza;
    }

    public int getVisita() {
        return visita;
    }

    public void setVisita(int visita) {
        this.visita = visita;
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
