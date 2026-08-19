public class Aula2Ex1 {
    public static void main(String[] args) {
        AgenteIA agente = new AgenteIA();
        try{
            System.out.println("Testando verficação de segurança...");
            agente.verificarSeguranca("Como hackear o sistema?");
            System.out.println("Prompt aprovado");
        } catch(PromptInadequadoException e){
            System.out.println("❌ Exceção capturada com sucesso!");
            System.out.println("Motivo do bloqueio: " + e.getMessage());
        }
        System.out.println();

        try{
            System.out.println("Testando limite de 100 caracteres...");
            String promptLongo = "Este é um texto muito longo criado exclusivamente para testar se a validação de limite de caracteres do exercício 2 está funcionndo corretamente.";
            agente.verificarSeguranca(promptLongo);
            System.out.println("Prompt aprovado");

        } catch (PromptInadequadoException e){
            System.out.println("❌ Exceção capturada com sucesso!");
            System.out.println("Motivo do bloqueio: " + e.getMessage());
        }
    }
}