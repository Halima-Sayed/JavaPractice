package Replit;

class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfSchool){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfSchool;
    }
    void value(){
        schoolName="Syntax";
        batch=6;
        year=2020;
        lastDayOfClass="07/30/2020";
    }
}
class AboveTester{
    public static void main(String[] args) {
        SyntaxTechnologies obj=new SyntaxTechnologies();

    }
}
