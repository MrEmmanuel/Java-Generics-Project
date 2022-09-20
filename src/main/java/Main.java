public class Main {
    public static void main(String[] args) {
        JavaGenerics.printArrayContent(new Integer[]{12,324,6,7900});
        JavaGenerics.printArrayContent(new String[]{"Messi","Ronaldo", "Haaland", "Jesus"});
        System.out.println();
        
        GenericClass<Content> stringInstance = new GenericClass<Content>();
        stringInstance.set("Test");
        stringInstance.get();
        GenericClass<Content> integerInstance = new GenericClass<Content>();
        integerInstance.set(1000);

        integerInstance.get();
    }
}
