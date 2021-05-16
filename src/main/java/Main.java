import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {


        Runtime runtime = Runtime.getRuntime();
        Process pc ;
        String[] date;
        String time;
        boolean menu = true;

    while (menu) {
        System.out.println("1 - Whole month, e.g. 2021-10");
        System.out.println("2 - Day of the month, e.g. 2021-10-12");
        System.out.println("3 - Specific time, e.g. 22:14:15");
        System.out.println("4 - Time splice (two specific time), e.g. 22:14:15-22:24:15");
        System.out.println("5 - EXIT");


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        allLogs allLogs = new allLogs();
        switch (num) {
            case 1:
                System.out.println("Write month e.g. 2021-10 ");
                date = sc.next().split("-");
                allLogs.allLogs(Integer.parseInt(date[1]));
                pc = runtime.exec("firefox output.html");
                pc.waitFor();
                break;
            case 2:
                System.out.println("Write Day of the month e.g. 2021-10-12");
                date = sc.next().split("-");
                allLogs.logsByDate(Integer.parseInt(date[1]), Integer.parseInt(date[2]));
                pc = runtime.exec("firefox output.html");
                pc.waitFor();
                break;
            case 3:
                System.out.println("Write Specific time, e.g. 22:14:15");
                time = sc.next();
                allLogs.logsByTime(time);
                pc = runtime.exec("firefox output.html");
                pc.waitFor();
                break;
            case 4:
                System.out.println("Write Time splice (two specific time), e.g. 22:14:15-22:24:15");
                time = sc.next();
                allLogs.logsByTimeSplice(time);
                pc = runtime.exec("firefox output.html");
                pc.waitFor();
                break;
            case 5:
                menu = false;
                break;


            }
        }
    }
}

