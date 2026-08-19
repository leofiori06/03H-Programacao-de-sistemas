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
    }
}