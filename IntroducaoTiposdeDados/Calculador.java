
public class Calculador {

    public double media(int[] v) {
        int sumTotal = 0;
        int qtd = 0;
        int media;

        for (int i : v) {
            sumTotal += i;
            qtd++;
        }
        media = sumTotal / qtd;
        return media;
    }

    public int moda(int[] v) {
        int maxCount = 0;
        int number = 0;
        int oldMaxCount = 0;

        for (int i : v) {
            int count = 0;
            for (int j : v) {
                if (i == j)
                    ++count;
            }
            if (count >= maxCount && number != i) {
                oldMaxCount = maxCount;
                maxCount = count;
                number = i;
            }
        }
        if (maxCount == oldMaxCount) {
            return 0;
        } else {
            return number;
        }
    }
}
