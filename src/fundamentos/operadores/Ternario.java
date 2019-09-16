package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		double media = 6;
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		System.out.printf("O aluno está %s", resultadoFinal);

		boolean bomCoportamento = true;
		boolean passouPorMedia = resultadoFinal.contains("aprovado.");
		boolean temDesconto = bomCoportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("\nTem desconto? %s", resultado);
	}

}
