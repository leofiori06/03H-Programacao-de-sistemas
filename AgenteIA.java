public class AgenteIA{
    public void verificarSeguranca(String prompt) throws PromptInadequadoException{
        if (prompt != null){
            if (prompt.length()>100){
                throw new PromptInadequadoException("Prompt excede o limite máximo de 100 caracteres.");
            }            
            String texto = prompt.toLowerCase();
            if (texto.contains("hackear") || texto.contains("roubar")){
                throw new PromptInadequadoException("Prompt contém termos proibidos de segurança.");
            }
        }
    }
}