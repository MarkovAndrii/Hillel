package lesson1;

public class lesson {
    public static void main(String[] args) {
        byte varByte = 10;
        short varShort = 12500;
        long varLong = 34569022;
        float varFloat = 54.55009f;
        char varChar = 'a';
        boolean varBoolean = true;
        String string1 = "Hello";
        String string2 = new String("Hello");
        int variableInt1 = 1, variableInt2 = 5, variableInt3 = 7;
        double variableDouble1 = 3.5, variableDouble2 = 6.1, variableDouble3 = 9.4;

        int intResult1 = variableInt1 + variableInt2 - variableInt3;
        int intResult2 = variableInt1 * variableInt2 - variableInt3;
        int intResult3 = variableInt1 + variableInt2 * variableInt3;
        int intResult4 = variableInt1 * variableInt2 + variableInt3;
        int intResult5 = (variableInt1 + variableInt3) * variableInt2;
        System.out.println(intResult1);
        System.out.println(intResult2);
        System.out.println(intResult3);
        System.out.println(intResult4);
        System.out.println(intResult5);
        double doubleResult1 = variableDouble1 + variableDouble2 - variableDouble3;
        double doubleResult2 = variableDouble1 * variableDouble2 - variableDouble3;
        double doubleResult3 = variableInt1 + variableDouble1;
        double doubleResult4 = variableDouble1 * variableInt2;
        double doubleResult5 = doubleResult1 * variableInt2;
        System.out.println();
        System.out.println(doubleResult1);
        System.out.println(doubleResult2);
        System.out.println(doubleResult3);
        System.out.println(doubleResult4);
        System.out.println(doubleResult5);

        variableInt1 += 9;    //10
        System.out.println();
        System.out.println(variableInt1);
        variableInt1 -= 5;    //5
        System.out.println(variableInt1);
        variableInt1 *= variableInt2;    //15
        System.out.println(variableInt1);
        variableInt1 /= 5;    //3
        System.out.println(variableInt1);
        variableInt1 %= 2;    //1
        System.out.println(variableInt1);
        variableDouble1 -= 11;   //-10
        variableInt1 += -5;   //-15
        variableInt1 *= -3;   //45
        variableInt1 /= 9;    //5
        variableInt1 %= 3;    //2
        System.out.println();
        System.out.println(variableInt1);

        boolean booleanResult1 = variableInt1 > variableInt2;
        boolean booleanResult2 = variableDouble1 <= variableDouble2;
        boolean booleanResult3 = variableInt2 != variableInt3;
        boolean booleanResult4 = variableDouble2 < variableInt3;
        boolean booleanResult5 = doubleResult5 == 95;
        System.out.println();
        System.out.println(booleanResult1);
        System.out.println(booleanResult2);
        System.out.println(booleanResult3);
        System.out.println(booleanResult4);
        System.out.println(booleanResult5);

        int incDec = 1;
        System.out.println();
        System.out.println(incDec); //1
        incDec--;
        System.out.println(incDec); //0
        incDec++;
        System.out.println(incDec); //1
        System.out.println(incDec); //1
        System.out.println(incDec); //1
        incDec++;
        System.out.println(incDec); //2
        incDec--;
        System.out.println(incDec); //1
        System.out.println(incDec); //1

        int[] myArray = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
    }
}
