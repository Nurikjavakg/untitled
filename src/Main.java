import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] peaksofts = {"English","Technical", "Softskills"};

        MyClass myClass = new MyClass("Nurmukhamed\n","Alymbai uulu\n",25,
                "\nnurik@gmail.com\n"+"\n\nLessons from Peaksoft:",peaksofts);









        System.out.println(myClass.firstName+""+myClass.lastName+""+myClass.age+""+myClass.email+Arrays.toString(peaksofts));
         myClass.firstName="\n\n\nAsylbek";
         myClass.lastName="Nazyrbek uulu";
         myClass.age=25;
         myClass.email="asylbek@gmail.com";
        System.out.println(myClass.firstName+"\n"+myClass.lastName+"\n"+myClass.age+"\n"+myClass.email+"\n"+Arrays.toString(myClass.peaksofts));


    }
}