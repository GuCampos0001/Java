package aula1;

public class Main  {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();

        p1.nome = "Renan";
        p1.idade = 32;
        p1.sexo = "masculino \n";

        pessoa p2 = new pessoa();

        p2.nome = "claudia";
        p2.idade = 28;
        p2.sexo = "feminino \n";

        cao c1 = new cao();

        c1.nome = "magnos";
        c1.raca = "dobermann";
        c1.cor = "marrom";
        c1.peso = 35;

        cao c2 = new cao();

        c2.nome = "celia";
        c2.raca = "podle";
        c2.cor = "branco";
        c2.peso = 20;

       	
        System.out.println("Idade: " + p1.idade);
        System.out.println("Sexo: " + p1.sexo);

        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        System.out.println("Sexo: " + p2.sexo);

        System.out.println("Nome: " + c1.nome);
        System.out.println("Raça: " + c1.raca);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Peso: " + c1.peso);

        System.out.println("Nome: " + c2.nome);
        System.out.println("Raça: " + c2.raca);
        System.out.println("Cor: " + c2.cor);
        System.out.println("Peso: " + c2.peso);
        
    }
}
        
    