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
public class Jumbo extends Violao {
    
 @Override
    public void Preco() {
        violao.preco = 500.88;
    }

    @Override
    public void Cor() {
        violao.cor = "Preto. ";
    }

    @Override
    public void Corda() {
        violao.corda = "Aço. ";
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
        violao.modelo = "Jumbo. ";
    }
    
    @Override
    public void Tamanho() {
        System.out.println("");
    }
}

