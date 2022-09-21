public class Main {
    public static void main(String[] args) {
        JavaGenerics.printArrayContent(new Integer[]{12,324,6,7900});
        JavaGenerics.printArrayContent(new String[]{"Messi","Ronaldo", "Haaland", "Jesus"});
        System.out.println();

        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.set("Test");
        stringInstance.get();

        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.set(1000);
        integerInstance.get();
    }
}
