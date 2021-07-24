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
public class AtividadeBuider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        VendaViolao loja = new VendaViolao(new Classico());

        loja.violaoVenda();
        Produto violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);

        System.out.println();

        loja = new VendaViolao(new Folk ());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);

        System.out.println();

        loja = new VendaViolao(new Flat());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);

        System.out.println();

        loja = new VendaViolao(new Jumbo());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);
        
        System.out.println();

        loja = new VendaViolao(new Violao7Cordas());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);
        
        System.out.println();

        loja = new VendaViolao(new Violao12Corda());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);
        
        System.out.println();

        loja = new VendaViolao(new Zero());
        loja.violaoVenda();
        violao = loja.getViolao();
        System.out.println(" Violao: " + violao.modelo + "Cor" + violao.cor
                + " Tipo da corda: " + violao.corda + " Tipo tarraxa: " + violao.tarraxa
                + " Material " + violao.material);
    }

}

    
    

