public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/12/1985";
        int startingIndexOfYear = birthDate.indexOf("1985");
        System.out.println("Starting index = "+ startingIndexOfYear);
        System.out.println("Birth Year = " + birthDate.substring(startingIndexOfYear));

        System.out.println("Birth month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "12", "1985");
        System.out.println("New date = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("12");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1985");
        System.out.println("New date = "+ newDate);

        newDate = "25" + "/" + "12" + "/" + "1985";
        System.out.println("New date = "+ newDate);

        newDate = "25".concat("/").concat("12").concat("/").concat("1985");
        System.out.println("New date = "+ newDate);

        System.out.println("New date = " + newDate.replace("/", "-"));
        System.out.println("New date = " + newDate.replaceFirst("/", "-"));
        System.out.println("New date = " + newDate.replaceAll("/", "--"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC".repeat(3).indent(5));

        System.out.println("         ABC\n".repeat(3).indent(-2));

    }
}
