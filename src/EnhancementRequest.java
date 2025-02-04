import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnhancementRequest {

    //defining the elements of the annotation
    int id();
    String synopsis();
    String engineer() default "unassigned"; //defauly value is unassigned 
    String date() default "unkown"; //default value is unknown

    
}
