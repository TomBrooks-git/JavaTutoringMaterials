public class Person {

    private int age;
    private String firstName;
    private String lastName;
    private Double gpa;

    public Person()  //default
    {
        this.age = 15;
        this.firstName = "John";
        this.lastName = "Doe";
        this.gpa = 2.0;

    }

    public Person(int age_, String firstName_, String lastName_, Double gpa_)
    {
        this.age = age_;
        this.firstName = firstName_;
        this.lastName = lastName_;
        this.gpa = gpa_;
    }

    public void greeting()
    {
        System.out.println("Hi, my name is " + this.firstName + ". I am " + age + " years old.");
    }

    public void setAge(int age_)
    {
        if(age <= 0 || age > 110)
        {
            System.out.println("Age out of acceptable range");
            return;
        }

        this.age = age_;
    }

    public int getAge()
    {
        return age;
    }

    public void setFirstName(String firstName_)
    {
        if(firstName_.length() > 32)
        {
            System.out.println("First name must be 32 characters or less");
            return;
        }

        this.firstName = firstName_;

    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName_)
    {
        if(lastName_.length() > 32)
        {
            System.out.println("First name must be 32 characters or less");
            return;
        }

        this.firstName = lastName_;

    }

    public String getLastName()
    {
        return lastName;
    }

    public void setGPA(double gpa_)
    {
        if(gpa_ < 0.0 || gpa_ > 4.0)
        {
            System.out.println("GPA out of acceptable range");
            return;
        }

        gpa = gpa_;
    }

    public double getGPA()
    {
        return gpa;
    }

}
