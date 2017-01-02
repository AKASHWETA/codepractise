package sorting;

import java.util.ArrayList;  
import java.util.List;  
import java.util.Random;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledExecutorService;  
import java.util.concurrent.TimeUnit;  
  
/**  
 * Each Road object represents a route, a total of 12 routes, namely the system to generate a total of 12 instances of Road objects.   
 * Each route randomly add new vehicles, added to a collection conservation.   
 * Each route every second will check the line of control lamp is green, is the collection of the route to save car in the first car to remove, that car through the intersection.   
 * @Author Zhang Xiaoxiang www.it315.org  
 *  
 */  
public class Road {  
    private List<String> vechicles = new ArrayList<String>();  
      
    private String name =null;  
/*In the constructor, to which direction,  
First open a thread pool is used to generate vehicle, a timer is used to observe the traffic light state*/  
    public Road(String name){  
        this.name = name;  
          System.out.println("thsi >name" + this.name);
        //Process simulation of vehicle random constantly on the road   
       //Use the thread pool, through the method of generating a single thread, creates a thread pool    
       /* ExecutorService pool = Executors.newSingleThreadExecutor();  
//  
        pool.execute(new Runnable(){  
            public void run(){  
                for(int i=1;i<1000;i++){  
                    try {  
                        Thread.sleep((new Random().nextInt(10) + 1) * 1000);  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                    vechicles.add(Road.this.name + "_" + i);  
                }                 
            }  
              
        });  */
          
        //Every second check the corresponding lamp is green, it is the release of a car      
        //To produce a single thread, creating a timer    
        ScheduledExecutorService timer =  Executors.newScheduledThreadPool(1);  
        timer.scheduleAtFixedRate(  
                new Runnable(){  
                    public void run(){  
//If there is a car to determine road, there is the corresponding operation  
                       // if(vechicles.size()>0){  
                            boolean lighted = Lamp.valueOf(Road.this.name).isLighted();  
 //Every second, let the car pass, must first determine whether the bright traffic lamp, light to pass, that is removed from the set    
                           // if(lighted){  
                                //System.out.println(vechicles.remove(0) + " is traversing !");  
                           // }  
                        //}  
                          
                    }  
                },  
                1,  
                1,  
                TimeUnit.SECONDS);  
          
    }  
}  