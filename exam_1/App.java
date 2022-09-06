public class App {
    public static void main(String[] args) {
        Student Me = new Student();
        Me.surname = "Äganan";
        Me.firstName = "Rainier";
        Me.middleInitial = 'P';
        Me.dateOfBirth = 12/29/2003;
        Me.studentNumber = 2022104934;
        Me.studentEmailAddress = "agananrp@students.national-u.edu.ph";
        Me.iAmAwesome = true;
        Me.sayMyStudentNumber();
        Me.sayMyEmailAddress();
        Me.amIAwesome();
    }
}
