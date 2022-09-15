package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0){
            return;
        }

        boolean isHeightEven = height % 2 == 0;

        for (int i = 0; i <= height / 2; i++)
        {
            if (isHeightEven && (i == height / 2)) {
            }else {
                for (int k = i; k > 0; k--){
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= height - i * 2; j++){
                System.out.print(8);
            }

            if (isHeightEven && (i == height / 2)) {
            }else {
                for (int n = i; n > 0; n--){
                    System.out.print(" ");
                }
            }

            if (isHeightEven && (i == height / 2)) {
            }else {
                System.out.println();
            }

        }
        for (int i = isHeightEven ? height / 2  : (height / 2 - 1); i >= 0; i--)
        {
            if (isHeightEven && (i == height / 2)) {
            }else {
                for (int k = i; k > 0; k--){
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= height - i * 2; j++){
                System.out.print(8);
            }

            if (isHeightEven && (i == height / 2)) {
            }else {
                for (int n = i; n > 0; n--){
                    System.out.print(" ");
                }
            }

            if (isHeightEven && (i == height / 2)) {
            }else {
                System.out.println();
            }
        }

    }
}
