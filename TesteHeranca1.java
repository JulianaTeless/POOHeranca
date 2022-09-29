public class TesteHeranca1 {
    public static void main(String[] args) {
        //AlunoDeGraduacao() = construtor padrao
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "Juliana";
        aluno.idade = 19;

        System.out.printf("Nome: %s \nIdade: %d\n", aluno.nome, aluno.idade);
    }
}
