package examples;

public class conversion {
    
    public static void main(String [] args) {


	java.util.Scanner
	scanner = new java.util.Scanner(System.in);
    
    int grade[] = new int [5];
    
    double gradepoint1;
    double gradepoint2;
    double gradepoint3;
    double gradepoint4;
    double gradepoint5;
    
    System.out.print("Please type in your first grade between 0-100: ");
    grade[0] = scanner.nextInt();
    
    gradepoint1 = calculateGradePoint(grade[0]);
    
    System.out.print("Please type in your second grade between 0-100: ");
    grade[1] = scanner.nextInt();
    
    gradepoint2 = calculateGradePoint(grade[1]);
    
    System.out.print("Please type in your third grade between 0-100: ");
    grade[2] = scanner.nextInt();
    

    gradepoint3 = calculateGradePoint(grade[2]);
    
    System.out.print("Please type in your fourth grade between 0-100: ");
    grade[3] = scanner.nextInt();
    
    gradepoint4 = calculateGradePoint(grade[3]);
    
    System.out.print("Please type in your fifth grade between 0-100: ");
    grade[4] = scanner.nextInt();
    
    
    gradepoint5 = calculateGradePoint(grade[4]);
    
    
    double gradepoint = 0.0;
    double averagegrade = 0.0;

   averagegrade = calculateGrade(grade[0], grade[1], grade[2], grade[3], grade[4]);
   gradepoint = calculateGPA(gradepoint1, gradepoint2, gradepoint3, gradepoint4, gradepoint5);
    
    System.out.println(" You recieved an average grade of : " + averagegrade + " and a GPA of: " + gradepoint);
    
}
public static double calculateGPA(double gp1, double gp2, double gp3, double gp4, double gp5) {
    
    double AverageGPA = 0.0;
    AverageGPA = ((gp1 + gp2 + gp3  + gp4 + gp5)/ 5);
    return AverageGPA;
}

public static double calculateGrade(double num1, double num2, double num3, double num4, double num5) {
    
    double averagetotal = 0.0;
    
    averagetotal = ((num1 + num2 + num3 + num4 + num5) / 5);
    
    return averagetotal;
    
}

public static double calculateGradePoint(int grade) {
    double GPoint = 0.0;
    int grade0 = grade + 0;
    switch (grade0) {
    
    case 60: case 61: case 62:
        GPoint = 0.7;
        break;
    case 63: case 64: case 65: case 66:
        GPoint = 1.0;
        break;
    case 67: case 68: case 69:
        GPoint = 1.3;
        break;
    case 70: case 71: case 72: 
        GPoint = 1.7;
        break;
    case 73: case 74: case 75: case 76:
        GPoint = 2.0;
    case 77: case 78: case 79:
        GPoint = 2.3;
        break;
    case 80: case 81: case 82:
        GPoint = 2.7;
        break;
    case 83: case 84: case 85: case 86:
        GPoint = 3.0;
        break;
    case 87: case 88: case 89: 
        GPoint = 3.3;
        break;
    case 90: case 91: case 92: 
        GPoint = 3.7;
        break;
    case 93: case 94: case 95: case 96: 
        GPoint = 4.0;
        break;
    case 97: case 98: case 99: case 100: 
        GPoint = 4.0;
        break;
    
    default:
    GPoint = 0.0;
    
    }
    
    return GPoint;
}

}



