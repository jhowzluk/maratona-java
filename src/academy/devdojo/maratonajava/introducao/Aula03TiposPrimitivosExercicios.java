package academy.devdojo.maratonajava.introducao;

/*
Prática: Crie variáveis para os campos descritos entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Jhow";
        String endereco = "Rua Jacob";
        double salario = 5431.12;
        String dataRecebimentoSalario = "05/03/26";

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi" +
                " o salário de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);

    }
}
