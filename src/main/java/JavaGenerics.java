import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class JavaGenerics {

    public static <Content> void printArrayContent(Content[] array){
        Collection<Content> collections = Arrays.asList(array);
        Iterator<Content> iterator = collections.iterator();
        while(iterator.hasNext()){
            Content item =iterator.next();
            System.out.println(item);
        }
    }

}
