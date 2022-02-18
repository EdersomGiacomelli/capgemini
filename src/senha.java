import java.util.Scanner;

public class senha {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a senha escolhida: ");
        //Variáveis String
        String senha = entrada.nextLine();
        //Variáveis inteiras
        int tamanho = senha.length();
        int maiuscula = 0;
        int minuscula = 0;
        int numero = 0;

        //Testa o tamanho da senha
        if(tamanho < 6){
            System.out.println("Sua senha deve ter pelo menos 6 caracteres.");
            System.out.println("Sua senha atual possui " + tamanho + " caracteres, você deve inserir mais " + (6 - tamanho) + " caracteres.");
        } else {
            System.out.println("Sua senha já está adequada ao número de caracteres.");
        }

        //Testa se a senha possui dígitos
        for(char c : senha.toCharArray()){
            if(c >= '0' && c <= '9'){
                numero = 1;
            }
        }
        if (numero == 0) {
            System.out.println("Não possui dígitos.");
        }

        //Testa se a senha possui letra maíuscula
        for(int i =0; i<senha.length();i++){
            char c = senha.charAt(i);
            if(Character.isUpperCase(c)){
                maiuscula = 1;
            } 
        }
        if (maiuscula == 0){
            System.out.println("Sua senha não possui letras maiúsculas.");
        } 

        //Testa se a senha possui letra minúscula
        for(int i =0; i<senha.length();i++){
            char c = senha.charAt(i);
            if(Character.isLowerCase(c)){
                minuscula = 1;
            }
        }
        if (minuscula == 0){
            System.out.println("Sua senha não possui letras minúsculas.");
        }
        
        //Testa se a senha possui caracter especial
        if(senha.matches("(?=.*[!@#$%^&*()-+]).*")){
            
        } else{
            System.out.println("Sua senha não possui especiais.");
        }

        entrada.close();
    }
}


