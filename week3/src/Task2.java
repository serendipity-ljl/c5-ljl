import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Excel> excels = new ArrayList<>();
        excels.add(new Excel(1,"Joe",70000,3));
        excels.add(new Excel(2,"Henry",80000,4));
        excels.add(new Excel(3,"Sam",60000,null));
        excels.add(new Excel(4,"Max",90000,null));
        for (Excel excel : excels) {
            System.out.println(excel);
        }
    }
    public static class Excel {
        private int id;
        private String name;
        private int salary;
        private Integer managerId;

        public Excel(int id, String name, int salary, Integer managerId) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.managerId = managerId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getManagerId() {
            return managerId;
        }

        public void setManagerId(int managerId) {
            this.managerId = managerId;
        }

        @Override
        public String toString() {
            return "Excel{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", managerId=" + managerId +
                    '}';
        }
    }
}
