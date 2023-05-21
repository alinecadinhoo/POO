package Abstratas;

public class main {

    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setCpf("231");
        assalariado.setNome("Aline");
        assalariado.setSobrenome("Cadinho");
        assalariado.setSalario(100d);
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("André");
        comissionado.setSobrenome("Santos");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("23");
        horista.setNome("Maria");
        horista.setSobrenome("Santos");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);

    }


    public static void imprimir(Empregado empregado) {
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
    }
}

