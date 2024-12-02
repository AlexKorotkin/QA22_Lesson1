import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
        checkSumNumbers(14,19);
        getValueNumber(5);
        checkNumber(100);
        setLengthStr("число", 3);
        getLeapYear(40);
        setInversionNum();
        createNewArray();
        num();
        squareArray();
        createNewArray2(5, 5);


    }
    public static void printThreeWords(){ //////////// task 1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){ /////////// task 2
        int a, b;
        a =5; b = 3;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        };
    };
    public static void printColor(){ ////////////// task 3
        int value = -80;
        if (value > 100){
           System.out.println("Зеленый");
        } else if(value >0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }

    public static void compareNumber(){ /////////////// task 4
        int a = 18;
        int b = 25;

        if (a >= b){
            System.out.println("a >= b");
        }

        System.out.println("a < b");
    }

    public static void checkSumNumbers(int a, int b){ ////////// task 5

        if ((a + b) >= 10 && (a + b) <= 20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public  static void getValueNumber(int value){ /// ///////// task 6
        String number;

        if (value >= 0){
            number = "положительное число";
        } else {
            number = "отрицательное число";
        }
        System.out.println("Значение Value: " + number );
    }

    public static void checkNumber(int value){ //////////////task 7
        if (value < 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void setLengthStr(String value, int number){ /////////  task 8
        int i = 0;
        while ( i < number){
            System.out.println(value);
            i++;
        }
        if(number <= 0) {
            System.out.println("Введите число больше нуля");
        }
    }

        public static void getLeapYear(int year){ /////////// task 9
            boolean leap;
            if (year % 400 == 0){
                leap = true;
            }else if (year % 100 == 0){
                leap = false;
            }else if (year % 4 == 0){
                leap = true;
            }else {
                leap = false;
            }
            System.out.println(leap);
        }

        public static void setInversionNum(){ /// //////// task 10
         int[] arr = {1,1,0,0,1,1,0,1};
         int count = 0;
         for(int i: arr){
             if( i > 0){
                 arr[count] = 0;
                 count++;
             } else {
                 arr[count] = 1;
                 count++;
             }
         }
            System.out.println(Arrays.toString(arr));
        }

        public static void createNewArray(){ /// /////////// task 11
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++){
                arr[i]= i + 1;
            }
            System.out.println(Arrays.toString(arr));

        }

        public static void num(){ /// /////////////////// task 12
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < 6){
                    arr[i] = arr[i]*2;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void squareArray(){ /// //////// task 13
            int [][] arr = new int[7][7];
            for (int i = 0; i < 7; i++){
                for (int j = 0; j < 7; j++){
                   arr[i][j]=0;
                }
                arr[i][i] = 1;
                arr[i][(arr.length-1)-i] = 1;
                System.out.println(Arrays.toString(arr[i]));
            }

        }

        public static int[] createNewArray2( int len, int initialValue){ /// /////// task 14
            int[] arr = new int[len];
            for (int i = 0; i< len; i++){
                arr[i] = initialValue;
            }
            System.out.println(Arrays.toString(arr));
            return arr;
        }

}