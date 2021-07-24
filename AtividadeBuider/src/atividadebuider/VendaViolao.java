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
public class VendaViolao {
    protected Violao vendaViolao;
    
    public VendaViolao(Violao vendaViolao) {
        this.vendaViolao = vendaViolao;
    }
    
    public void violaoVenda() {
        vendaViolao.Preco();
        vendaViolao.Cor();
        vendaViolao.Corda();
        vendaViolao.Tarraxa();
        vendaViolao.Material();
        vendaViolao.Modelo();
        vendaViolao.Tamanho();
    }
    
   public Produto getViolao() {
       return vendaViolao.getViolao();
   }
}
    

