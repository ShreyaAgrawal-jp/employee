import java.io.*;
import java.util.*;
public class employee {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
            System.out.println("name: ");
            String n1=s.nextLine();
            System.out.println("year of joining: ");
            int y1=s.nextInt();
            System.out.println("salary: ");
            int s1=s.nextInt();
            System.out.println("address: ");
            String a1=s.next();
            a1 +=s.nextLine();
            
            System.out.println("name: ");
            String n2=s.nextLine();
            System.out.println("year of joining: ");
            int y2=s.nextInt();
            System.out.println("salary: ");
            int s2=s.nextInt();
            System.out.println("address: ");
            String a2=s.next();
            a2 +=s.nextLine();
            
            System.out.println("name: ");
            String n3=s.nextLine();
            System.out.println("year of joining: ");
            int y3=s.nextInt();
            System.out.println("salary: ");
            int s3=s.nextInt();
            System.out.println("address: ");
            String a3=s.next();
            a3 +=s.nextLine();
            
            System.out.println("name\t year of joining\t salary\t address\t");
            System.out.println(n1+"\t\t"+y1+"\t\t"+s1+"\t"+a1);
            System.out.println(n2+"\t\t"+y2+"\t\t"+s2+"\t"+a2);
            System.out.println(n3+"\t\t"+y3+"\t\t"+s3+"\t"+a3);
    }
}
