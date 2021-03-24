package com.psl.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("audiance")
public class audiance {
	
	
	
   //@Before                   //when
   public void seatsitting() {//what
	   System.out.println("plz seatsetting");
   }
   public void aploud() {
	   System.out.println("plz aploud");

   }
   public void askrefund() {
	   System.out.println("plz askrefund");

}
   public void goHome()
   {
	   System.out.println("plz goHome");
   }
}
