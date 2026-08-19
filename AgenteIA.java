public class AgenteIA{
    public void verificarSeguranca(String prompt) throws PromptInadequadoException{
        if (prompt != null){
            String texto = prompt.toLowerCase();
            if (texto.contains("hackear") || texto.contains("roubar")){
                throw new PromptInadequadoException("Prompt contém termos proibidos de segurança.");
            }
        }
    }
}