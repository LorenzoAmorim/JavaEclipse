//pacote da classe
package entities;

//nome da classe
public class Triangle {
	
	//declarar os atributos das classes para adicionar ao programa principal
	public double a;//double: atributos da classe
	//public: pode ser usado em outros arquivos
	public double b;
	public double c;
	
	//criar um método/função para calcular a fórmula do triângulo
	//public: indica que o atributo ou método pode ser usado em outros arquivos
	//double: tipo de dado que o método retorna(se o método não retorna nada, usa-se "void")
	//() vazia: lista de parâmetros do método
	public double area() {
		double p = (a+b+c)/2.0;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return result;
		//ou apenas "return Math.sqrt(p*(p-a)*(p-b)*(p-c));"
	}
}
