/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.ArrayList;
import java.util.List;
import modelo.Carro;

/**
 *
 * @author cleberlira
 */
public class CarroDAO {
    
    
    
    public List<Carro> consulta(){
       
       

       
       List<Carro> carros = new ArrayList<>();
       
       
       Carro carro = new Carro();
       carro.setIdCarro(1);
       carro.setModelo("cruze");
       carro.setDataFabricacao("10/01/2022");
       
       carros.add(carro);
       
          
       Carro carro1 = new Carro();
       carro1.setIdCarro(2);
       carro1.setModelo("focus");
       carro1.setDataFabricacao("10/03/2022");
       
       carros.add(carro1);
           
       Carro carro2 = new Carro();
       carro2.setIdCarro(3);
       carro2.setModelo("onix");
       carro2.setDataFabricacao("10/03/2021");
       
       carros.add(carro2);       
               
              
               
         
       
      return carros;

       
   }
    
    
}
