package first;

public class FirstProgram{
    public static void main(String[] args){
        int[] d = new int[7];
        for (int i = d.length - 1, j = 6; i >= 0; i--, j += 2){
            d[i] = j;
        }
        float[] x = new float[13];
        for (int i = 0; i < x.length; i++){
            int presence = (int)Math.random();
            x[i] = (1 + presence) % 2 * ((float)Math.random() * 16 - 11) + presence * 5;
        }
        double massive[][] = new double[7][13];
        for (int i = 0; i < massive.length; i++){
            for (int j = 0; j < massive[i].length; j++){
                switch (d[i]){
                    case 10:
                        massive[i][j] = Math.sin(Math.cbrt(Math.tan((double)x[j])));
                        break;
                    case 8, 14, 18:
                        massive[i][j] = Math.tan(Math.pow(Math.cos((double)x[j]), x[j] - 3) / 2);
                        break;
                    default:
                        massive[i][j] = Math.asin(
                                            Math.cos(
                                                Math.pow(
                                                    (Math.cbrt(Math.log(Math.abs(x[j])))), 
                                                        (Math.exp((x[j] + 1) / x[j]) - 1 / 3) / Math.pow(2 / Math.log(Math.abs(x[j])), Math.atan((x[j] - 3) / 16))
                                                )
                                            )
                                        );
                }
            }
        }
        for (int i = 0; i < massive.length; i++){
            System.out.print("\n");
            for (int j = 0; j < massive[i].length; j++){
                System.out.printf("%-13.5f ", massive[i][j]);
            }
            System.out.print("\n\n");
        }
    }
}
