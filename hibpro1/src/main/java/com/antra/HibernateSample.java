package com.antra;


import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.antra.mapping.Address;
import com.antra.mapping.Employee;
import com.antra.mapping.Laptop;
import com.antra.mapping.Student;





public class HibernateSample {
	
	static EntityManagerFactory EMF=Persistence.createEntityManagerFactory("system");
	public static void main(String[] args) {
		
		getEmployeeJPQL();
		
		
		/*EntityManager em=EMF.createEntityManager();
		em.getTransaction().begin();
		Employee emp=em.find(Employee.class, 3);
		System.out.println(emp.getName());
		//System.out.println(emp.getAddr());
		em.getTransaction().commit();
		em.close();
		System.out.println(emp.getAddr());*/
		
		//addEmployee();
		//getEmployee();
		
		/*EntityManagerFactory EMF=Persistence.createEntityManagerFactory("system");
		EntityManager em=EMF.createEntityManager();
		//em.setFlushMode(FlushModeType.COMMIT);
		
		em.getTransaction().begin();
		//Employee emp=em.find(Employee.class, 50);
			Employee emp=new Employee();
			emp.setId(1);
			emp.setName("John");
			emp.setSal(168);
			
			Address adr1= new Address();
			adr1.setCity("Virginia");
			adr1.setAddressId(1);
			adr1.setStreet("Caridor mark street");
			adr1.setPostal(531276);
			
			Address adr2= new Address();
			adr2.setCity("Washington");
			adr2.setAddressId(2);
			adr2.setStreet("Newton street");
			adr2.setPostal(724134);
			
			emp.getLiAdd().add(adr1);
			emp.getLiAdd().add(adr2);
			//emp.setAddr(adr);
			//em.persist(adr1);
			//em.persist(adr2);
			em.persist(emp);
		em.flush();
		//em.remove(emp);
		em.getTransaction().commit();
		em.close();*/
		/*Employee emp1=em.find(Employee.class, 45);
		System.out.println(emp1.getName());*/
		
		
		//addEmployee();
		//addStudent();
		//getStudent();
		//getLaptops(); 
	}
	
	private static void getEmployeeJPQL() {
		EntityManager em=EMF.createEntityManager();
		Query query=em.createQuery("select e from Employee e");
		List<Employee> li=query.getResultList();
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	private static void getEmployee() {
		
		EntityManager em=EMF.createEntityManager();
		em.getTransaction().begin();
		Employee emp=em.find(Employee.class, 3);
		System.out.println(emp.getName());
		//System.out.println(emp.getAddr());
		
		//System.out.println(emp.getLiAdd());
		/*List<Address> li=emp.getLiAdd();
		Iterator<Address> it=li.iterator();
		while(it.hasNext()) {
			Address adr=it.next();
			System.out.println(adr.getCity());
			System.out.println(adr.getAddressId());
		}*/
		em.getTransaction().commit();
		em.close();
		System.out.println(emp.getAddr());
		
	/*	em.getTransaction().begin();
		em.remove(emp);
		em.flush();
		em.getTransaction().commit();*/
		/*em.getTransaction().begin();
		emp.getAddr().setStreet("new bankers colony");
		
		em.persist(emp);
		em.flush();
		em.getTransaction().commit();*/
		
	}

	public static void getLaptops() {
		EntityManager em=EMF.createEntityManager();
		Laptop lp=em.find(Laptop.class, 1);
		System.out.println(lp.getLaptopName());
		//System.out.println(lp.getSt());
	}
	
	public static void getStudent() {
		EntityManager em=EMF.createEntityManager();
		Student st=em.find(Student.class, 1);
		//System.out.println(st.laptops);
		//System.out.println(st.getLaptops());
		System.out.println(st.getName());
		
	}
	
	public static void addStudent() {
		EntityManager em=EMF.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Student st=new Student();
		st.setName("Bob");
		st.setMarks(89);
		Laptop lp1=new Laptop();
		lp1.setLaptopName("Dell");
		Laptop lp2=new Laptop();
		lp2.setLaptopName("HP");
		//List<Laptop> al=st.getLaptops();
		//al.add(lp1);
		//al.add(lp2);
		//st.setLaptops(al);
		//em.persist(lp1);
		//em.persist(lp2);
		em.persist(st);
		em.flush();
		tx.commit();
		em.close();
	}
	
	public static void addEmployee() {
		EntityManager em=EMF.createEntityManager();
		em.getTransaction().begin();
		
		Employee emp=new Employee();
			emp.setId(3);
			emp.setName("YL");
			emp.setSal(562);
		
		Address adr1=new Address();	
			adr1.setAddressId(3);
			adr1.setCity("New jercy");
			adr1.setPostal(949858);
			adr1.setStreet("Ruther2 colony");

		/*Address adr2=new Address();		
			adr2.setAddressId(2);
			adr2.setStreet("norms colony");
			adr2.setCity("Washington DC");
			adr2.setPostal(453453);*/
		emp.setAddr(adr1);
		//em.persist(adr1);
		//em.persist(adr2);
		//emp.getLiAdd().add(adr1);
		//emp.getLiAdd().add(adr2);
		//em.persist(adr);
		
		em.persist(emp);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}
	
}
