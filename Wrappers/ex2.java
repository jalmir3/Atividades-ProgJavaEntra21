package AtividadesWrappers;
/*O  CÓDIGO  ABAIXO  gera  uma  amostra  do  que  foi  explicado  acima.  
Crie  uma  classe chamada TestaWrapperBoolean,   compile,   execute   e   veja   o   resultado.
Seria interessante, tentar adivinhar qual seria a saída dos valores antes de tentar reproduzir 
para compreender o entendimento.*/
public class ex2 {
	public static void main(String[] args) {
		boolean flag1 = true;
		boolean flag2 = false;
		String flag3 = "true";
		Boolean b1 = new Boolean("truE");
		Boolean b2 = new Boolean("TRUE");
		Boolean b3 = new Boolean("TuE");
		Boolean b4 = new Boolean(flag3);
		if(b1){
			System.out.println("B1 é verdadeiro!");}
		if(flag1 == b2){
			System.out.println("flag1 == b2: Igual");}
		else{
			System.out.println("flag1 == b2: Diferente");}
		System.out.println(flag1 == b1 ? "flag1 == b1: Igual" : "flag1 == b1: Diferente");
		System.out.println(flag1 == b3 ? "flag1 == b3: Igual" : "flag1 == b3: Diferente");
		System.out.println(flag1 == b4 ? "flag1 == b4: Igual" : "flag1 == b4: Diferente");
		Boolean b5 = new Boolean("false");
		Boolean b6 = new Boolean("faLse");
		Boolean b7 = new Boolean("FALSE");
		Boolean b8 = new Boolean("flse");
		System.out.println(flag2 == b5 ? "flag2 == b5: Igual" : "flag2 == b5: Diferente");
		System.out.println(flag2 == b6 ? "flag2 == b6: Igual" : "flag2 == b6: Diferente");
		System.out.println(flag2 == b7 ? "flag2 == b7: Igual" : "flag2 == b7: Diferente");
		System.out.println(flag2 == b8 ? "flag2 == b8: Diferente" : "flag2 == b8: Igual" );
		}
	}
/*B1 é verdadeiro!
flag1 == b2: Igual
flag1 == b1: Igual
flag1 == b3: Diferente
flag1 == b4: Igual
flag2 == b5: Igual
flag2 == b6: Igual
flag2 == b7: Igual
flag2 == b8: Diferente*/
