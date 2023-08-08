public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] elements = new int[arr.length];
        int[] frequencies = new int[arr.length];
        int elementsNumber = 0;

        for (int element : arr) {
            boolean isFind = false;
            for (int i = 0; i < elementsNumber; i++) {
                if (elements[i] == element) {
                    frequencies[i]++;
                    isFind = true;
                    break;
                }
            }

            if (!isFind) {
                elements[elementsNumber] = element;
                frequencies[elementsNumber] = 1;
                elementsNumber++;
            }
        }

        for (int i = 0; i < elementsNumber; i++) {
            System.out.println(elements[i] + " sayısı " + frequencies[i] + " kere tekrar edildi.");
        }
    }
}

