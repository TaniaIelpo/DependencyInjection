package co.develhope.DependencyInjection.services;

import co.develhope.DependencyInjection.coponents.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tania Ielpo
 */
@Service

public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent mc){
        System.out.println("MyService has been created");
        this.myComponent=mc;
    }

    /**
     * calls MyComponent.getMyComponentName()
     * @return A string returned by MyComponent.getMyComponentName()
     */

    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }
}
