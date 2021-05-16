import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class allLogs {
    String[] months = {"0", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November ", "December "};
    String[] line;
    String[] control;
    File input = new File("/var/log/syslog.1");
    Scanner sc = new Scanner(input);
    FileWriter fileWriter = new FileWriter("./output.html");

    public allLogs() throws IOException {
    }

    public void allLogs(int month) throws IOException {

        fileWriter.write("<Table border=\"1\">");
        fileWriter.write("<th>HEADER STRUCTURED</th>");
        fileWriter.write("<th>DATA MSG</th>");
        while (sc.hasNext()) {
            control = sc.nextLine().split(" ");
            line = sc.nextLine().split(": ");
            if (months[month].equals(control[0])) {
                fileWriter.write("<tr>" + "<td>" + line[0] + "</td>" + "<td>" + line[1] + "</td>" + "</tr>");
            }
        }
        fileWriter.write("</Table>");
        fileWriter.close();
    }

    public void logsByDate(int month , int day) throws IOException {

        fileWriter.write("<Table border=\"1\">");
        fileWriter.write("<th>HEADER STRUCTURED</th>");
        fileWriter.write("<th>DATA MSG</th>");
        while (sc.hasNext()) {
            control = sc.nextLine().split(" ");
            line = sc.nextLine().split(": ");
            if (months[month].equals(control[0]) && String.valueOf(day).equals(control[1])) {
                fileWriter.write("<tr>" + "<td>" + line[0] + "</td>" + "<td>" + line[1] + "</td>" + "</tr>");
            }
        }
        fileWriter.write("</Table>");
        fileWriter.close();
    }

    public void logsByTime(String time) throws IOException {
        fileWriter.write("<Table border=\"1\">");
        fileWriter.write("<th>HEADER STRUCTURED</th>");
        fileWriter.write("<th>DATA MSG</th>");
        while (sc.hasNext()) {
            control = sc.nextLine().split(" ");
            line = sc.nextLine().split(": ");
            if (control[2].equals(time)){
                fileWriter.write("<tr>" + "<td>" + line[0] + "</td>" + "<td>" + line[1] + "</td>" + "</tr>");
            }

        }
        fileWriter.write("</Table>");
        fileWriter.close();

    }

    public void logsByTimeSplice(String time) throws IOException{
        fileWriter.write("<Table border=\"1\">");
        fileWriter.write("<th>HEADER STRUCTURED</th>");
        fileWriter.write("<th>DATA MSG</th>");
        String[] list = time.split("-");
        while (sc.hasNext()) {
            control = sc.nextLine().split(" ");
            line = sc.nextLine().split(": ");
            if (control[2].equals(list[0]) | control[2].equals(list[1])){
                fileWriter.write("<tr>" + "<td>" + line[0] + "</td>" + "<td>" + line[1] + "</td>" + "</tr>");
            }

        }
        fileWriter.write("</Table>");
        fileWriter.close();
    }

}

