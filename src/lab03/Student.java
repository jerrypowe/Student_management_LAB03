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
public class Student {
    private String ID;
    private String fullname;
    private double math;
    private double literature;

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public String getFullname() {
        return fullname;
    }

    public double getMath() {
        return math;
    }

    public double getLiterature() {
        return literature;
    }
    
    public double getGPA(){
        return (this.literature+this.math)/2;
    }
     Student(String ID, String fullname,double math, double literature){
        this.ID = ID;
        this.fullname = fullname;
        this.literature = literature;
        this.math = math;
    }
   
}

