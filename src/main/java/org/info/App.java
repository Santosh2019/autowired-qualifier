package org.info;

import org.info.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = context.getBean(Student.class);
		System.out.println(student.getStudId());
<<<<<<< Updated upstream
	

		//BUG - 123

			public void add(Studnet student){
		
		System.out.println(issue resolved);
}

=======
			
		public void m1(int a){
		
			System.out.println(i.10);
>>>>>>> Stashed changes

	}
}
