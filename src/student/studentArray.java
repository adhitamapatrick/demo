
package student;
import java.util.Scanner;
/**
 *
 * @author patri
 */
public class studentArray {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Patrick";
        s1.id = 1001;
        
        Student[] gos = new Student[5];
        //gos[0].id = 1002;
        //gos[0].name = "Dick";
        
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < gos.length; i++) {
            System.out.println("Enter student name: ");
            gos[i].setName(in.nextLine());
            System.out.println("Enter student ID: ");
            gos[i].setId(Integer.valueOf(in.nextLine()));
        }
        
        
        
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
    
}
