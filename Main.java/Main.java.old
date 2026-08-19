import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try{
            int idade = EntradaUtil.lerIdade();
            System.out.println("Sua idade ano que vem será: " + (idade + 1));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
class EntradaUtil{
    public static int lerIdade() throws IdadeException{
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe sua idade: ");
        String idade = entrada.nextLine();
        entrada.close();
        try{
            int resultado = Integer.parseInt(idade);
            if (resultado <0){
                throw new IdadeException("A idade informada (\""+idade+") não é válida, deve ser positiva.");
            }
            return resultado;
        } catch (NumberFormatException ex) {
            throw new IdadeException("A idade informada (\""+idade+") não é válida.");
        }
    }
}
class IdadeException extends Exception{
    public IdadeException(String valorInformado){
        super(valorInformado);
    }
}
