public class FormatadorCep {
    public static void main(String[] args) {
        try {
        String cepFormadado = formatarCep("23.765-064");
        System.out.println(cepFormadado);

        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio");      
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
