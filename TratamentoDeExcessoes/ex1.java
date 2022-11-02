package Lista7TratamentoDeExcessoes;

public class ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Inicio Do Main");
        metodo1();
        System.out.println("fim do main");
	}
	static void metodo1() {
		System.out.println("Inicio Do Metodo1");
        metodo2();
        System.out.println("fim do Metodo1");
	}
	
		static void metodo2() {
	    try{
	    System.out.println("Inicio Do Metodo2");
        int[] array=new int[10];
        for(int i=0;i<=15;i++) {
        	 array[i]=i;
        	 System.out.println(i);
        }
        System.out.println("fim do Metodo2");
	    }
	    catch(ArrayIndexOutOfBoundsException e)
		  {
		    System.out.println("O erro ocorreu por que os ultimos 5 indices do vetor eram nulos" +
		    			"para solucional tal o problema, foi corrigido o vetor.");
		    for(int i=0;i<=10;i++) {
		        System.out.println(i);
	        }
		   
		  }
		}
}
