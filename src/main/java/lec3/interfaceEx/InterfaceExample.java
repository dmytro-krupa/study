package lec3.interfaceEx;

public class InterfaceExample {

    public static void main(String[] args) {
//    Process process = new Process();


        Process process = new NumberProcess();

        process.log();
//
        System.out.println(process.invoke());

        Process.staticLog();


//        System.out.println(process instanceof SuperProcess);

    }
}
