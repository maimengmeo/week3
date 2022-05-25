
package studentinfo;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class Studentlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s=new Student();//creating a student object called s
        Student[] studList=new Student[5];//declare an array which holds 5 student objects
        //int[] i=new int[3];
        
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<studList.length;i++){
        
            studList[i]=new Student();
            System.out.println("Enter student name: ");
            studList[i].setName(sc.nextLine());
        
        
        }
        System.out.println("Student List");
        for(Student s1:studList)
        {
            System.out.print(s1.getName());
            System.out.print(" ");
        }
        
        
        
    }

}
