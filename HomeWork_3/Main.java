package HomeWork_3;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);

        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
        System.out.println("'g' - addFruit: ");
        orange.addFruit(new Orange(),10);
        orange1.addFruit(new Orange(),12);
        apple.addFruit(new Apple(),8);
        apple1.addFruit(new Apple(),4);
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: "+orange.compare(apple));
        System.out.println("Box 2 equals box 4: "+orange1.compare(apple1));
        System.out.println("'f' - pourTo(): ");
        orange.pourTo(orange1);
        apple.pourTo(apple);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
    }

    public static void swap(Object[] arr, int n1, int n2){
        System.out.println(Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("После замены:"+Arrays.toString(arr)+"\n============");
    }
}