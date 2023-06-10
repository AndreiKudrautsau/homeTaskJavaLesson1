import java.util.Random;

class Main {
    public static void main(String[] args) {
        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2000);
        System.out.println("Случайное число i =  " + i);
        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n;
        n = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значащего бита n =  " + n);
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        short count_m1, index_m1, count_m2, index_m2;
        count_m1 = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) {
                count_m1++;
                }
        }

        System.out.println("длина массива m1 =  " + count_m1);
                int[] m1 = new int [count_m1];
                index_m1 = 0;

                for (int j = i; j < Short.MAX_VALUE; j++){
                    if (j % n == 0) {
                        m1[index_m1] = j;
                        index_m1++;
                        //System.out.print(j + " ");
                        }


                }
            // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
            count_m2 = 0;
            for (int j = Short.MIN_VALUE; j < i; j++){
                if ( j % n != 0) {
                    count_m2++;
                    }
                }
            System.out.println("длина массива m2 =  "+ count_m2);

            int[] m2 = new int [count_m2];
            index_m2 = 0;

            for (int j = Short.MIN_VALUE; j < i; j++){
                if (j % n != 0) {
                    m2[index_m2] = j;
                    index_m2++;
                    //System.out.print(j + " ");
                    }
                }

            }
        }
