import java.time.LocalDate;
public class Student {

    //these r attributes
    private String name, email, address, mobilePhone, homePhone;
    private int id;
    private LocalDate dob;
    private Department department;


    private Student() {
        id = 0;
        name = null;
        department = Department.NONE;
    }

    public String getName() { return name;}
    public String getEmail() { return email;}
    public String getAddress() {return address;}
    public String getMobilePhone() {return mobilePhone;}
    public String getHomePhone() {return homePhone;}
    public int getId() {return id;}
    public LocalDate getDob() {return dob;}
    public Department getDepartment() { return department;}

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public Student setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setDob(LocalDate dob) {
        this.dob = dob;
        return this;
    }

    public Student setDepartment(Department department) {
        this.department = department;
        return this;
    }

    public void print() {
       
        System.out.println("+------------------------+--------------------------+");
        System.out.println("| name                   |                 " + name + "|");
        System.out.println("| id                     |                         " + id + "|");
        System.out.println("| dob                    |                " + dob + "|");
        System.out.println("| department             |                      " + department + "|");
        System.out.println("| email                  |      " + email + "|");
        System.out.println("| address                |   " + address + "|");
        System.out.println("| mobilePhone            |             " + mobilePhone + "|");
        System.out.println("| homePhone              |                      " + homePhone + "|");
        System.out.println("+------------------------+--------------------------+");
    } //im sorry prof..

    public static Student.Builder builder() {
        return new Student.Builder();
    }

    public static class Builder {
        private Student student = new Student ();

        public Student.Builder name (String name) {
            if ((name == null) || (name.length() < 2)) {
                throw new IllegalArgumentException("Name invalid haha");
            }
            student.setName(name);
            return this;
        }

        public Student.Builder id(int id) {
            if (id < 1) {
                throw new IllegalArgumentException("ID invalid");
            }
            student.setId(id);
            return this;
        }

        public Student.Builder department(Department department) {
            student.setDepartment(department);
            return this;

        }

        public Student.Builder email (String email) {
            student.setEmail(email);
            return this;
        }

        public Student.Builder address(String address) {
            student.setAddress(address);
            return this;
        }

        public Student.Builder mobilePhone(String mobilePhone) {
            student.setMobilePhone(mobilePhone);
            return this;
        }

        public Student.Builder homePhone(String homePhone) {
            student.setHomePhone(homePhone);
            return this;
        }

        public Student.Builder dob(LocalDate dob) {
            student.setDob(dob);
            return this;
        }


        public Student build() { 
            if (student.getName() == null || student.id < 1 || student.getDepartment() == null ) { 
                return null; 
                }
            return student;
        }

    }
}