class Student{

    String studentName = "";
    String studentAge = "";
    String studentCourse = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;
    double averageGrade = 0;
    boolean isPassing = false;



    Student(String name, String age, String course,double firstGrade, double secondGrade, double thirdGrade){
        studentName = name;
        studentAge = age;
        studentCourse = course;
        grade1 = firstGrade;
        grade2 = secondGrade;
        grade3 = thirdGrade;
        averageGrade = (grade1 + grade2 + grade3) / 3.0;
    }

    void displayInfo(){
        System.out.println("Name: " +studentName +", " + "Age: " + ", "+ studentAge + ", "+ "Course: "+ studentCourse );
        System.out.println("Grades : "+ grade1 + " " +  grade2 + " " + grade3);
        System.out.println("Average: " + averageGrade);
        if(isPassing = true){
            System.out.println("Status: PASSING");
        }else{
            System.out.println("Status: FAILING");
        }
    }

    void calculateAverage(){
        averageGrade = (grade1 + grade2 + grade3)/ 3.0;
    }

    void getLetterGrade(){
        if(averageGrade >= 90){
            System.out.println("Letter Grade: A");
        }else if(averageGrade >= 80 && averageGrade <= 89){
            System.out.println("Letter Grade: B");
        }else if(averageGrade >= 70 && averageGrade <= 79){
            System.out.println("Letter Grade: C");
        }else if(averageGrade >= 60 && averageGrade <= 69){
            System.out.println("Letter Grade: D");
        }else {
            System.out.println("Letter Grade: F");
        }
    }

    void isPassing(){
        if(averageGrade >= 70){
            isPassing = true;
            System.out.println("Status: PASSING");
        }else{
            isPassing = false;
            System.out.println("Status: FAILING");
        }
    }
}
