public class Client {
    public static void main(String[] args) {
        //V0
        /*Student student = new Student(12,
                "Pranjali",
                "Mhatre",
                "Feb2022",
                "female",
                2015,
                75);*/

        //V1 - Builder
        /*Student.Builder builder = new Student.Builder();
        builder.setAge(34);
        builder.setBatch("Aug2022");
        builder.setfName("Pranjali");
        builder.setlName("Mhatre");
        builder.setGender("female");
        builder.setPsp(80);
        Student student = new Student(builder);*/

        // V2 - student class returning Builder object and builder builder
        // doing validation and returning Student object
        Student student = Student.getStudentBuilder().setAge(34)
                        .setfName("Pranjali").setlName("Mhatre")
                        .setBatch("Sep2022").setGradYear(2015)
                        .setGender("female").setPsp(75).build();


        System.out.println(student);

        //student.setAge(); - not possible as the object is immutable in this case
    }
}
