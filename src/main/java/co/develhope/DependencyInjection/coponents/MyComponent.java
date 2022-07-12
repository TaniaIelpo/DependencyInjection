package co.develhope.DependencyInjection.coponents;
import org.springframework.stereotype.Component;

/**
 * @author Tania Ielpo
 */
@Component
public class MyComponent {

    private final String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent has been created");
        myComponentName="Tania Ielpo";
    }

    /**
     * a method getMyComponentName() that returns
     * the value of myComponentImmutableName
     * @return the value of myComponentName field
     */
    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}
