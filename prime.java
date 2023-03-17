public class prime {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {
            int prime = 1;
            int count = 2;
            while (count <= i) {
                if ((i % count) == 0 && count != i) {
                    prime = 0;
                }
                count++;
            }
            if (prime == 1) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

}
