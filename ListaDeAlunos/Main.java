public class Main {

        public static void main(String[] args) {
            Aluno A1 = new Aluno("Nicoly", "111111111");
            Aluno A2 = new Aluno("Carol", "222222222");

            ListaLigadaAluno l1 = new ListaLigadaAluno();

            System.out.println("Adiciona 2 Alunos");

            l1.adicionaInicio(A1);
            l1.adicionaInicio(A2);

            System.out.println(l1.toString());

            System.out.println("Remove Último Aluno");
            l1.removeFinal();

            System.out.println(l1.toString());
            
            
    
        }
}
