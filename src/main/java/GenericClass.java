public class GenericClass <C>{

    private C content;

    public void set(C object){
        this.content = object;
    }

    public void get(){
        System.out.println(this.content);
    }
}
