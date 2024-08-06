import java.util.Locale;
import java.util.Scanner;


public class StringsMethod {
    public static void main(String[] args) {


        //sting de[loyment
        String a = "Jaydeep Das";
        System.out.printf("%s\n",a);
        String a1 = new String("Jaydeep Das");
        System.out.printf("%s\n",a1);

        //sting length:- stNme.length();
        System.out.println("Enter string for find length :-");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        int length = name.length();
        System.out.printf("The length of name %d\n",length);

        //all string lowercase :- stName.toLowerCase();
        System.out.println("toLowerCase() change all upper case to lower:-");
        String lowerSting = name.toLowerCase();
        System.out.println(lowerSting);

        //all string upper case:- StName.toUpperCase();
        System.out.println("toUpperCase() change all lower case to upper:-");
        String upperSting = name.toUpperCase();
        System.out.println(upperSting);

        //String trim;-stName.trim();
        String nonTrim = "    Hello   ";
        System.out.println("Befor trim with gap : - ");
        System.out.println(nonTrim);

        System.out.println("name.trim();use for remove gap:-");
        System.out.println( nonTrim.trim());

        //jis index se aage ka string print krwana hai us index ka number(index start with 0;
        //name.substring(index no.);
        String  start = "HELLO";
        System.out.println(start.substring(2)); //op-LLO

        //name.substring(indexStarNo,IndexEndNo );
        // index 2(start) include hoga par index 4(end) exclude(include nahi hoga) hoga;
        System.out.println(start.substring(2,4));

        //name.replacr(oldchar'anychar', newChar 'any char');
        String name2 = "Joy";
        System.out.print("Before replace: - ");
        System.out.println(name2);
        System.out.print("after replace: -");
        System.out.println(name2.replace('J','T'));//also use with string

        //startsWith() return true or false
        System.out.print("Is Joy start with 'Jo':- ");
        System.out.println(name2.startsWith("Jo"));

        System.out.print("Is Joy start with 'To':- ");
        System.out.println(name2.startsWith("To"));


        //endsWith() return true or false
        System.out.print("Is Joy ends with 'oy':- ");
        System.out.println(name2.endsWith("oy"));

        System.out.print("Is Joy ends with 'ay':- ");
        System.out.println(name2.endsWith("ay"));

        //name.charAt(indexNo.):- index 2 me kya character h (index start with 0)
        System.out.print("What is char in index no. 0 in Joy :- ");
        System.out.println(name2.charAt(0));

        System.out.print("What is char in index no. 1 in Joy :- ");
        System.out.println(name2.charAt(1));

        System.out.print("What is char in index no. 2 in Joy :- ");
        System.out.println(name2.charAt(2));

        //name.indexOf("");-str index batata hai
        //agar same char ek se jada hai continue toh pehle wala ka index print hoga
        System.out.print("Index of 'o' in Joy := " );
        System.out.println(name2.indexOf("o"));

        System.out.print("Index of 'y' in Joy := " );
        System.out.println(name2.indexOf("y"));

        //lastIndexOf():= last ke trf se search start hoga
        System.out.print("index of 'y' from last :- ");
        System.out.println(name2.lastIndexOf("y"));

        //check string equal or not

        System.out.print("Joy = Joy:-");
        System.out.println(name2.equals("Joy"));

        System.out.print("Joy = joy:-");
        System.out.println(name2.equals("joy"));

        //equalsIgnoreCase(); ignore case sensitive
        System.out.print("use equalsIgnoreCase Joy = joy:-");
        System.out.println(name2.equalsIgnoreCase("joy"));

    }
}
