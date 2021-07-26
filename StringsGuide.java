public class StringsGuide {

    public static void main(String ... args){

        System.out.println("Strings program has started with args: "+args[0]);

        String name = "Kode Rush app by ";
        Character charValue = 'A';
        String charToString = charValue.toString();

        System.out.println("Name : "+name+", charString: "+charToString);
        System.out.println("Length: "+name.length());
        System.out.println("Upper Case: "+name.toUpperCase() );
        System.out.println("Lower Case: "+name.toLowerCase() );
        System.out.println("Lower Case: "+name.toLowerCase() );

        System.out.println("Concatnated string: "+name.concat(args[0]) );

        String specialChars = "\n \t it's a \"test\" \\ ";
        System.out.println("Speical char string: "+specialChars);

        

    }

}