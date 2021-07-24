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
public class Folk extends Violao {
    
    @Override
    public void Preco() {
        violao.preco = 400.80;
    }

    @Override
    public void Cor() {
        violao.cor = "Cinza. ";
    }

    @Override
    public void Corda() {
        violao.corda = "Nylon. ";
    }

    @Override
    public void Tarraxa() {
        violao.tarraxa = "12 cm x 3.5 cm. ";
    }

    @Override
    public void Material() {
        violao.material = "carbono. ";
    }

    @Override
    public void Modelo() {
        violao.modelo = "Folk. ";
    }
    
    @Override
    public void Tamanho() {
        System.out.println("");
    }
    
}
