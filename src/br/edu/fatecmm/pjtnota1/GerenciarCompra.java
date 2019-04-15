package br.edu.fatecmm.pjtnota1;
import java.util.Scanner;

public class GerenciarCompra {

    public Fornecedor fornecedores;
    public Produto produtos;
    public Cesta cesta;

    Cesta ct = new Cesta();
    Fornecedor fn = new Fornecedor();
    Produto pdt = new Produto();
    Produto pdt2 = new Produto();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc=0;

        GerenciarCompra gc = new GerenciarCompra();

        do{
            System.out.println(" ");
            System.out.println("Selecione uma opção:");
            System.out.println("1-Cadastrar Fornecedor");
            System.out.println("2-Cadastrar Produto");
            System.out.println("3-Abrir Carrinho");
            System.out.println("4-Fechar Carrinho");
            System.out.println("9-Sair");
            System.out.println(" ");

            opc = Integer.parseInt(sc.nextLine());

            switch(opc){
                case 1: gc.cadastrarFornecedor(); break;
                case 2: gc.cadastrarProduto(); break;
                case 3: gc.abrirCarrinho(); break;
                case 4: gc.fecharCarrinho(); break;
            }

        }while(opc!=9);


    }

    private void fecharCarrinho(){
        ct.fechaCarrinho();
    }

    private void abrirCarrinho(){
        //int carrinho[] = new int[10];
        int opc, count;
        do{

            System.out.println(" ");
            System.out.println("Selecione uma opção:");
            System.out.println("1-Adicionar Produto");
            System.out.println("2-Mostrar Carrinho");
            System.out.println("3-Calcular Total");
            System.out.println("9-Sair");
            System.out.println(" ");

            Scanner sc = new Scanner (System.in);
            opc = Integer.parseInt(sc.nextLine());

            switch(opc){
                case 1:
                    System.out.print("Digite o ID do Produto:");
                    int produto = Integer.parseInt(sc.nextLine());
                    ct.adicionarItem(produto);
                    break;

                case 2:
                    ct.exibeLista();
                    break;

                case 3:
                    System.out.println("Total da Compra: ");
                    double teste[] = ct.calcularTotal();
                    double p1 = pdt.getPreco();
                    double p2 = pdt2.getPreco();

                    double total1 = p1 * teste[0];
                    double total2 = p2 * teste[1];

                    double compra = total1 + total2;

                    System.out.println("R$ " + compra);
                    //System.out.println(ct.calcularTotal());
                    break;
            }

        }while(opc!=9);
    }

    public Fornecedor getFornecedores() {
        return fornecedores;
    }

    private void cadastrarProduto(){

        Scanner sc = new Scanner (System.in);
        String entrada;
        Double valor;

        //-------------------------------------------------------------
        //cadastra o produto 1
        pdt.setCodProd(1);
        System.out.print("Descrição: ");
        entrada = (sc.nextLine());
        pdt.setDescricao(entrada);

        System.out.print("Preço: ");
        valor = Double.parseDouble(sc.nextLine());
        pdt.setPreco(valor);
        System.out.println(" ");

        pdt.setFornecedor(fn); //define o fornecedor
        //-------------------------------------------------------------
        //cadastra o produto 2
        pdt2.setCodProd(2);
        System.out.print("Descrição: ");
        entrada = (sc.nextLine());
        pdt2.setDescricao(entrada);

        System.out.print("Preço: ");
        valor = Double.parseDouble(sc.nextLine());
        pdt2.setPreco(valor);
        System.out.println(" ");

        pdt2.setFornecedor(fn); //define o fornecedor
        //-------------------------------------------------------------
        pdt.imprimirEtiqueta();
        System.out.println("");
        pdt2.imprimirEtiqueta();
    }

    private void cadastrarFornecedor(){

        Scanner sc = new Scanner(System.in);
        String entrada;

        fn.setIdForn(1);

        System.out.print("Nome: ");
        entrada = (sc.nextLine());
        fn.setNome(entrada);

        System.out.print("Contato: ");
        entrada = (sc.nextLine());
        fn.setContato(entrada);

        System.out.print("Fone: ");
        entrada = (sc.nextLine());
        fn.setFone(entrada);

        System.out.print("Email: ");
        entrada = (sc.nextLine());
        fn.setEmail(entrada);
        System.out.println(" ");

        System.out.println("Dados do Fornecedor:");
        fn.imprimirFornecedor();
    }

}


