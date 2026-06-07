public class Student {

    private int age;
    private String fName;
    private String lName;
    private String batch;
    private String gender;
    private int gradYear;
    private double psp;

    private Student(int age, String fName, String lName, String batch, String gender, int gradYear, double psp) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        this.batch = batch;
        this.gender = gender;
        this.gradYear = gradYear;
        this.psp = psp;
    }

    private Student(Builder builder){
        this.age = builder.age;
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.batch = builder.batch;
        this.gender = builder.gender;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;

    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", batch='" + batch + '\'' +
                ", gender='" + gender + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                '}';
    }
    public static Builder getStudentBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int age;
        private String fName;
        private String lName;
        private String batch;
        private String gender;
        private int gradYear;
        private double psp;

        private Builder(){
        }

        public Builder createStudentBuilder(){
            return new Builder();
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getfName() {
            return fName;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public void validate(){
            if(this.gradYear > 2022){
                throw new GradYearException("Invalid Grad Year : It should be <= 2022");
            }
            if(this.age < 18){
                throw new InvalidAgeException("Age should be >= 18");
            }
        }
        public Student build(){
            validate();
            return new Student(this);
        }
    }
}
