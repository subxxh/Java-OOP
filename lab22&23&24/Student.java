import java.util.Objects;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private Department dept;

    public Student(int id, String name, Department dept) {
        setID(id);
        setName(name);
        setDepartment(dept);
    }

    public Student setID(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException();
        }
            this.id = id;
            return this; 
    }

    public Student setName(String name){
        if(name == null || name.length() < 2)
            throw new IllegalArgumentException();
        this.name = name;
        return this;
    }

    public Student setDepartment(Department dept){
        this.dept = dept;
        return this;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Department getDepartment(){
        return dept;
    }
    @Override
    public String toString(){
        return "Student: " + name + ", Department = " + dept + ", ID = " + id + ".";
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null || o.getClass() != getClass()) 
            return false;

        Student o1 = (Student) o;
        return dept.equals(o1.dept) && name.equals(o1.name) && id == o1.id;
    }

    public int hashCode(){
        return Objects.hash(name + id + dept);
    }


    @Override
    public int compareTo(Student s) {
        if (this.id > s.id) {
            return 1;
        } else if(this.id < s.id) {
            return -1;
        } else {
            return 0;
        }
    }


}
        //compare students by their ids
        //return a positive integer if this objects id is larger than student s
        //return negatice integer if id is smaller than s
        //return 0 if the same.
    

