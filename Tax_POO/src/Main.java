public class Main {
    public static void main(String[] args) {

        // Teste para produtos. As taxas aplicadas em produtos são IPI e ICMS

        Tipo tipoProduto = new Tipo("produto", 250.00);
        tipoProduto.calculartaxas();

        // Teste para serviços. As taxas aplicadas em serviços são ISS e ICMS

        Tipo tipoServico = new Tipo("serviço", 850.00);
        tipoServico.calculartaxas();

    }
}