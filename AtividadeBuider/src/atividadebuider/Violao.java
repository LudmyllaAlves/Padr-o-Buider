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
public abstract class Violao {
    protected Produto violao;
    
    public Violao() {
        violao = new Produto();
    }
     
    
    public abstract void Preco();
    
    public abstract void Cor();
    
    public abstract void Corda();
    
    public abstract void Tarraxa();
    
    public abstract void Material();
    
    public abstract void Modelo();
    
    public abstract void Tamanho();
    
    public Produto getViolao() {
        return violao;
    }
}
    

