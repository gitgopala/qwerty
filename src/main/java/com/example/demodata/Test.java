package com.example.demodata;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("name")
	public String getname() {

		return "hello";

	}
	@GetMapping("id")
	public Integer getid() {
		return 123;
		
	}
	@GetMapping("person")
	public Person getall() {
		Person person = new Person();
		person.setPid(1);
		person.setPname("gopal");
		person.setPage(32);
		return person;
		/*
		 * output 			{"pid":1,"pname":"gopal","page":32,"pt":null,"m":null,"c":null}
		 */		
	}
	@GetMapping("onetoone")
	public Person getaonetoone() {
		Person person = new Person();
		person.setPid(2);
		person.setPname("murali");
		person.setPage(30);
		Passport passport = new Passport();
		passport.setPpid(1);
		passport.setPlocation("hyderabad");
		passport.setPnumber("123A");
		passport.setPexp("2028");
		person.setPt(passport);
		return person;
		
		/*
		 * output 
		 * {"pid":2,"pname":"murali","page":30,"pt":{"ppid":1,"pnumber":"123A",
		 * "plocation":"hyderabad","pexp":"2028"},"m":null,"c":null}
		 */
		
	}
	@GetMapping("onetomany")
	public Person getonetomany() {
		Person person = new Person();
		person.setPid(3);
		person.setPage(29);
		person.setPname("srrinu");
		
		List<Mobiles> mlist = new ArrayList<>();
		Mobiles mobiles = new Mobiles();
		mobiles.setMid(1);
		mobiles.setMnumber(12345678l);
		mobiles.setSim("jio");
		Mobiles mobiles1 = new Mobiles();
		mobiles1.setMid(2);
		mobiles1.setMnumber(452316246l);
		mobiles1.setSim("airtel");
		
		
		
		mlist.add(mobiles);
		mlist.add(mobiles1);
		person.setM(mlist);
		
		return person;
		
		/*
		 * output
		 * {"pid":3,"pname":"srrinu","page":29,"pt":null,"m":[{"mid":1,"sim":"jio",
		 * "mnumber":12345678},{"mid":2,"sim":"airtel","mnumber":452316246}],"c":null}
		 */
		
	}
	@GetMapping("manytomany")
	public Person getmanytomany() {
		Person person =new Person();
		person.setPid(1);
		person.setPname("krishna");
		person.setPage(23);
		
		Map<Courses,String> clist = new HashMap<>();
		Courses courses = new Courses();
		courses.setCid(1);
		courses.setCname("cjava");
		courses.setCfee(4500.76);
		Courses courses1 = new Courses();
		courses1.setCid(2);
		courses1.setCname("sql");
		courses1.setCfee(2500.33);
		Courses courses2 = new Courses();
		courses2.setCid(3);
		courses2.setCname("spring");
		courses2.setCfee(1500.55);
		
		
		clist.put(courses, "person1");
		clist.put(courses1, "person2");
		clist.put(courses2, "person3");
		person.setC(clist);
		return person;
		/*
		 * output {"pid":1,"pname":"krishna","page":23,"pt":null,"m":null,"c":
		 * {"cid=1, cname=cjava, cfee=4500.76"
		 * :"person1","cid=2, cname=sql, cfee=2500.33"
		 * :"person2","cid=3, cname=spring, cfee=1500.55":"person3"}}
		 */
		
	}
	@GetMapping("date")
	public Date getDate() {
		return new Date();
		/*
		 * output
		 *  "2024-01-09T09:16:41.942+00:00"
		 */		
	}
	

}
