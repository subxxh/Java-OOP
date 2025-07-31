public class Student {
    private int id;
    private String name;
    private Department department;
    
    public Student(int id, String name, Department dept) {
        setId(id).setName(name);
        department = dept;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    Department getDepartment() {
        return department;
    }

    public Student setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Improper id: " + id);
        }
            this.id = id;
            return this;
    }

    public Student setName(String name) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException(" Improper name: " + name);
        }
        this.name = name;
        return this;
    }

    public Student setDepartment(Department dept) {
        this.department = dept;
        return this;
    }

    @Override
    public String toString() {
        return "Department: " + getDepartment() + "\n" + "Name: " + getName() + "\n" + "ID: " + getId(); 
    }
    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if(o instanceof Student) {
                Student other = (Student) o;
                if ((this.department == other.department) && (this.name.equals(other.name)) && (this.id == other.id))
                return true;
            } 
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int result = department.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + Integer.hashCode(id);
        return result;
    }

}
