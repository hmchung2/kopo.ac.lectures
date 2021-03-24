package kr.ac.kopo.day13;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {
	
	public static void main(String[] args) {

		Date date = new Date();
		Dog dog = new Dog();
		System.out.println(dog.toString());
		System.out.println(date.toString());
		
		int year = date.getYear() + 1900;
		System.out.println(year);
		
		int month = date.getMonth() + 1;
		System.out.println(month);
		
		int day = date.getDate();
		System.out.println(day);
	
		int hour = date.getHours();
		System.out.println(hour);
		
		int minute = date.getMinutes();
		System.out.println(minute);
		
		int second = date.getSeconds();
		System.out.println(second);
		
	}
}

class Dog {
	@Override
	public String toString() {
		return this.ok();
	}
	
	public String ok() {
		return "I am dog";
	}
}
