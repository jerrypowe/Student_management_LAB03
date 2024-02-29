/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Tam Pham
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> list = new ArrayList<Student>();
        int choice;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----STUDENT MANAGEMENT V1.0----");
            System.out.println("1.Add new student.");
            System.out.println("2.Shows all students.");
            System.out.println("3.Quit.");
            System.out.println("Please select a function: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("----STUDENT MANAGEMENT V1.0 [ADD NEW STUDENT]----");
//                    System.out.println("Please enter Student Information: (ID@Name@MathScore@LiteratureScore) or type 'quit' to exit:\");");
//                   String option = sc.nextLine();
//                   sc.nextLine();

                    while (true) {
                        System.out.println("Enter student information (ID@Name@MathScore@LiteratureScore) or type 'quit' to exit:");
                        String option = sc.nextLine();

                        if (option.equals("quit")) {
                            break;
                        }

//                        Scanner lineScanner = new Scanner(input);
//                        lineScanner.useDelimiter("@");
//                        String ID = lineScanner.next();
//                        String name = lineScanner.next();
//                        double mathScore = lineScanner.nextDouble();
//                        double literatureScore = lineScanner.nextDouble();
//
//                        Student student = new Student(ID, name, mathScore, literatureScore);
//                        list.add(student);
//
//                        System.out.println("Student added successfully.");
//                       
//                        lineScanner.close();
                        //tách chuỗi thành 4 được phân cách bởi  "@"
                   if(option.equals("quit")){
                       break;
                   }
              
                        String [] StudentInfo = option.split("@");
                   
                    if (StudentInfo.length == 4){
                       String ID =StudentInfo[0];
                       String name = StudentInfo[1];
                       double mathscore = Double.parseDouble(StudentInfo[2]);
                       double literaturescore = Double.parseDouble(StudentInfo[3]);
                       Student strudent = new Student(ID, name, mathscore, literaturescore);
                       list.add(strudent);
                       System.out.println("-->Student created and added to list of student successful!");
                   }else {
                       System.out.println("-->You must enter data!");
//                   }
                    break;
                    } 
                    break;
                }
                }

                case 2: {
                    int count = 0;
                    System.out.println(" ---- STUDENT MANAGEMENT V1.0 [List of student] ----");
                    System.out.println("|No. | ID    | Student name      | Math | Lit | GPA |");
                    System.out.println("+----+-------+-------------------+------+-----+-----+");
                    for (Student student : list) {
                        System.out.printf("| %-2s | %-5s | %-17s | %-4s | %-2s | %-2s |\n", count++, student.getID(), student.getFullname(), student.getMath(), student.getLiterature(), student.getGPA());
                        System.out.println("+----+-------+-------------------+------+-----+-----+");
                    }
               Collections.sort(list, new Comparator<Student>() {
                        @Override
                        public int compare(Student st1, Student st2) {
                             if (st1.getGPA() < st2.getGPA()) {
                    return 1;
                } else {
                    if (st1.getGPA() == st2.getGPA()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            } //To change body of generated methods, choose Tools | Templates.
                        });
                    System.out.println("The best student of the class is/are: ");
                    System.out.println(list.get(0).getFullname()+"("+list.get(0).getGPA()+")");
                    
                
        
                    break;
                }
                case 3: {
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("please enter 1-3!");
                    break;
                }
            }
        } while (true);
    }
}
