package HW2;

public class HW21 {

    static int sum(int array[]){
        int i=0;
        int sum=0;
        while (i<array.length){
            sum+=array[i];
            i++;
        }
        return sum;
    }

    static double sum(double array[]){
        int i=0;
        double sum=0.0;
        while (i<array.length){
            sum+=array[i];
            i++;
        }
        return sum;
    }

    static int min(int array[]){
        int i=1;
        int min;
        min = array[0];
        while (i<array.length){
            if (array[i]<min){
                min=array[i];
            }
            i++;
        }
        return min;
    }

    static double min(double array[]){
        int i=0;
        double min=array[0];
        while (i<array.length){
            if (array[i]<min){
                min=array[i];
            }
            i++;
        }
        return min;
    }

    static int max(int array[]){
        int i=0;
        int max=array[0];
        while (i<array.length){
            if (array[i]>max){
                max=array[i];
            }
            i++;
        }
        return max;
    }

    static double max(double array[]){
        int i=0;
        double max=array[0];
        while (i<array.length){
            if (array[i]>max){
                max=array[i];
            }
            i++;
        }
        return max;
    }

    static int maxPositive(int array[]){
        int i=0;
        int max=0;
        if (array[0]>0){
            max=array[0];
        }
        while (i<array.length){
            if (array[i]>max && array[i]>0){
                max=array[i];
            }
            i++;
        }
        if (max==0){
           return -1;
        }
        return max;
    }

    static double maxPositive(double array[]){
        int i=0;
        double max=0.0;
        if (array[0]>0){
            max=array[0];
        }
        while (i<array.length){
            if (array[i]>max && array[i]>0){
                max=array[i];
            }
            i++;
        }
        if (max==0){
            return -1;
        }
        return max;
    }

    static int multiplication(int array[]){
        int i=0;
        int mult=1;
        while (i<array.length){
            mult=mult*array[i];
            i++;
        }
        return mult;
    }

    static double multiplication(double array[]){
        int i=0;
        double mult=1;
        while (i<array.length){
            mult=mult*array[i];
            i++;
        }
        return mult;
    }

    static int modulus(int array[]){
        int a,b,m;
        a=array[0];
        b=array[array.length-1];
        m=a%b;
        return m;
    }

    static double modulus(double array[]){
        double a,b,m;
        a=array[0];
        b=array[array.length-1];
        m=a%b;
        return m;
    }

    static int secondLargest(int array[]){
        int max1,max2;
        max1=max(array);
        max2=array[0];
        int i=2;
        while (i<array.length){
            if (array[i]>max2){
                max2=array[i];
            }
            i++;
        }
        return max2;
    }

    static double secondLargest(double array[]){
        double max1,max2;
        max1=max(array);
        max2=array[0];
        int i=2;
        while (i<array.length){
            if (array[i]>max2){
                max2=array[i];
            }
            i++;
        }
        return max2;
    }

    public static void main(String[] args) {
        int []arInt={21, 42, -7, 32, 1, 8, -5, -3, 24, 10};
        double []arDouble={13.65,-1.24,17.48,-15.45,2.49,141.66,5.78,0.02,101.4,10.00};
        System.out.println("Sum array int :"+sum(arInt));
        System.out.println("Sum array double :"+sum(arDouble));
        System.out.println("Min array int :"+min(arInt));
        System.out.println("Min array double : "+min(arDouble));
        System.out.println("Max array int : "+max(arInt));
        System.out.println("Max array double : "+max(arDouble));
        int res=maxPositive(arInt);
        if (res==-1){
            System.out.println("Array haven't max posistive!");
        }
        else{
            System.out.println("Max positive array int :"+res);
        }
        double resD=maxPositive(arDouble);
        if (resD==-1){
            System.out.println("Array haven't max posistive!");
        }
        else{
            System.out.println("Max positive array double :"+resD);
        }
        System.out.println("Multiplication array int : "+multiplication(arInt));
        System.out.println("Multiplication array double : "+multiplication(arDouble));
        System.out.println("Modulus array int : "+modulus(arInt));
        System.out.println("Modulus array double : "+modulus(arDouble));
        System.out.println("Second largest array int : "+secondLargest(arInt));
        System.out.println("Second largest array int : "+secondLargest(arDouble));
    }
}
