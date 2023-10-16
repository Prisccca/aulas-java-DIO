public class ArraysEFor {

    public static void main(String[] args) {

        String alunos[] = { "Joao", "Jose", "Julia", "Jonas" };

        // em arrrays o indice inicia em 0
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        // For Each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
