/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cleberlira
 */
public class Carro {
   private int idCarro;
   private String modelo;
   private String dataFabricacao;

    /**
     * @return the idCarro
     */
    public int getIdCarro() {
        return idCarro;
    }

    /**
     * @param idCarro the idCarro to set
     */
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the dataFabricacao
     */
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * @param dataFabricacao the dataFabricacao to set
     */
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
