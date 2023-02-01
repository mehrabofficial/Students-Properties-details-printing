public class Student {
   private String name;
   private int age;
   private int rollNumber;
   private String course;

   public Student(String name, int age, int rollNumber, String course) {
      this.name = name;
      this.age = age;
      this.rollNumber = rollNumber;
      this.course = course;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getRollNumber() {
      return rollNumber;
   }

   public void setRollNumber(int rollNumber) {
      this.rollNumber = rollNumber;
   }

   public String getCourse() {
      return course;
   }

   public void setCourse(String course) {
      this.course = course;
   }
}