/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.CarroDAO;
import java.util.List;

/**
 *
 * @author cleberlira
 */
public class CarroBO {
    
      public List<Carro> consulta(){
      
          CarroDAO carrodao = new CarroDAO();
          
          List<Carro> carros =  carrodao.consulta();
          
          return carros;
          
          
      }
      
    
}
