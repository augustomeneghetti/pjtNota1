package br.edu.fatecmm.pjtnota1;

import java.util.Arrays;
import java.util.Vector;

public class Cesta {

    private Produto itens;
    int carrinho[] = new int[5];
    int i;

    public void adicionarItem(int produto){

        for(i=0; i<5; i++){
            String check1, check2;
            check2 = "0";
            check1 = String.valueOf(carrinho[i]);

            if (check1.equals(check2)) {
                carrinho[i] = produto;
                break;
            }
        }

    }

    public void exibeLista(){
        for(i=0; i<5; i++){
            System.out.print("ID do Produto: ");
            System.out.println(carrinho[i]);
        }
    }

    public void fechaCarrinho(){
        carrinho[0]=0;
        carrinho[1]=0;
        carrinho[2]=0;
        carrinho[3]=0;
        carrinho[4]=0;
    }

    public double[] calcularTotal(){
        String check, check1, check2;
        check1 = "1";
        check2 = "2";

        double count1 = 0;
        double count2 = 0;

        for(i=0; i<5; i++){
            check = String.valueOf(carrinho[i]);

            if (check.equals(check1)) {
                count1 ++;
            }

            if (check.equals(check2)) {
                count2 ++;
            }
        }

        double ret[] = new double[2];
        ret[0] = count1;
        ret[1] = count2;

        return ret;
    }

}
