public class Main {
   public static void main(String[] args) {
      Student student = new Student("Kazi Rabeya", 22, 12345, "Computer Science & Engineering");

      System.out.println("Name: " + student.getName());
      System.out.println("Age: " + student.getAge());
      System.out.println("ID Number: " + student.getRollNumber());
      System.out.println("Course: " + student.getCourse());
   }
}