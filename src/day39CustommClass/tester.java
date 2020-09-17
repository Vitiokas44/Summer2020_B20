package day39CustommClass;

public class tester {
    String employeeName;
    String gender;
    String SSN;
    String employeeId;
    String jobTitle;
    double salary;
    String companyName;

    public void setInfo( String TEmployeeName, String Tgender, String TSSN, String TemployeeId, String TjobTitle, double Tsalary, String TcompanyName){
        employeeName = TEmployeeName;
        gender = Tgender;
        SSN = TSSN;
        employeeId = TemployeeId;
        jobTitle = TjobTitle;
        salary = Tsalary;
        companyName = TcompanyName;
    }

    public void getInfo( ){
        System.out.println(employeeName + " "+ gender+ " " +employeeId + " "+ SSN + " "+ jobTitle + " "+ salary + " "+ companyName);
    }



    public void findingBug(String employeeName){
        System.out.println(employeeName + " found 5 bugs in the last sprint");
        System.out.println();
    }

    public void creatingTicket(String employeeName){
        System.out.println(employeeName + " created 3 tickets in this project up to now");
        System.out.println();

    }

    public void coding(String employeeName){
        System.out.println(employeeName + "did 5 hours of coding during the last sprint");
        System.out.println();

    }

    public void dailyStandupMeeting(){
        System.out.println("Daily standUp Meetings are everyday  from 9:45am to 10:00am");
        System.out.println("it is for scrum team to work on sprint backlog");
        System.out.println("What did each employee or the team in general accomplish yesterday?\n" +
                "What will each employee or the team in general accomplish today?\n" +
                "What obstacles may impede the progress of each employee or the team?");
        System.out.println();

    }
}
