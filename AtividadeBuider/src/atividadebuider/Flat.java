/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadebuider;

/**
 *
 * @author tatia
 */
public class Flat extends Violao {
    

    @Override
    public void Preco() {
        violao.preco = 300.80;
    }

    @Override
    public void Cor() {
        violao.cor = "Branca. ";
    }

    @Override
    public void Corda() {
        violao.corda = "Nylon. ";
    }

    @Override
    public void Tarraxa() {
        violao.tarraxa = "12 cm x 4.0 cm. ";
    }

    @Override
    public void Material() {
        violao.material = "carbono. ";
    }

    @Override
    public void Modelo() {
        violao.modelo = "Flat. ";
    }
    
    @Override
    public void Tamanho() {
        System.out.println("");
    }
    
}
