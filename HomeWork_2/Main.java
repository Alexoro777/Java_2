package HomeWork_2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"5", "8", "3", "9"}, {"7", "4", "8", "2"}, {"4", "5","1", "4"}, {"6", "7", "7", "9"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Количество строк массива не равно 4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Количество элементов массива не равно 4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
