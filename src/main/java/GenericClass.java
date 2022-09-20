public class GenericClass <Content>{

    private Object content;

    public void set(Object object){
        this.content = object;
    }

    public void get(){
        System.out.println(this.content);
    }
}
