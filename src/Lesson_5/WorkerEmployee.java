package Lesson_5;

public class WorkerEmployee {

    private String fio;
    private String position;
    private String email;
    private String tel;
    private double salary;
    private int age;

    WorkerEmployee(String fio, String position, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + position + " " +  email + " " + tel + " " + salary + " " + age);
    }

    public static void main(String[] args) {
        WorkerEmployee[] persArray = new WorkerEmployee[5];
        persArray[0] = new WorkerEmployee("Jack Knife", "Engineer", "Jack@mailbox.com",
                "892312312", 30000, 30);
        persArray[1] = new WorkerEmployee("John Doe", "Programmer", "John@mailbox.com",
                "1892312312", 40000, 40);
        persArray[2] = new WorkerEmployee("Bob Smith", "Manager", "Bob@mailbox.com",
                "2892312312", 50000, 50);
        persArray[3] = new WorkerEmployee("Will Johnson", "Lead Programmer", "Will@mailbox.com",
                "3892312312", 60000, 60);
        persArray[4] = new WorkerEmployee("Red Jackson", "Director", "Red@mailbox.com",
                "4892312312", 70000, 70);

        for(WorkerEmployee item : persArray) {
            if(item.getAge() > 40) item.Show();
        }
    }
}



