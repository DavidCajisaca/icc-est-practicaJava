public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String cadena = "Hola mundo";
        int edad = 10;
        
        System.out.println(cadena);
        System.out.print("Tamano de la cadena:  ");
        System.out.println(cadena.length());

        for (int i = 0; i <cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
            if(i<cadena.length()-1){
            System.out.print("-");
            }
        }
        //contar
        int palabras= cadena.split(" ").length;
        System.out.println("\n"+ palabras);

        //Cuantas a hay en la cadena
        int letras= cadena.split("a",-1).length-1;
        System.out.println("\n"+letras);


    }
}
