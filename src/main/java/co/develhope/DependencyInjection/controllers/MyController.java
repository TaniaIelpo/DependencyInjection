package co.develhope.DependencyInjection.controllers;


import co.develhope.DependencyInjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
public class MyController {
    private MyService myService;

    @Autowired
    public MyController(MyService service){
        System.out.println("MyController has been created");
        myService=service;
    }

    /**
     * a mapping to default root / that prints a welcome message
     * @return a String with a Welcome message
     */
    @GetMapping
    public String sayHello(){
        System.out.println("MyController.sayHello() has been called");
        return "Welcome Here!!!!";
    }

    /**
     * a mapping to /getName in order to return the result of
     * the getName() method of the MyService variable
     * @return a String returned by MyService.getName()
     */

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController.getName() has been called");
        return myService.getName();
    }
}
