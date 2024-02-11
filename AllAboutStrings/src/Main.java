public class Main {
    public static void main(String[] args) {
        printInfo("Hello World");
    }

    public static void printInfo(String string){
        int length = string.length();
        if(string.isEmpty()){
            System.out.println("String is empty");
            return ;
        }
        System.out.println("Length of "+ string +" = "+ length);
        if(string.isBlank()){
            System.out.println("String is not empty but its blank");
            return;
        }
        System.out.println("The first character of string = "+ string.charAt(0));
        System.out.println("The last character of string = "+ string.charAt(length-1));
        System.out.println("The first l is at = "+ string.indexOf('l'));
        System.out.println("The last l is at = "+ string.lastIndexOf('l'));
        System.out.println("The World is at = "+ string.indexOf("Hello"));
        System.out.printf("The l is at = %d %n", string.indexOf('l', 3));
        System.out.printf("The l is at = %d %n", string.lastIndexOf('l', 7));
    }
}