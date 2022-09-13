package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findByID =====");
		Department department = departmentDao.findById(2);
		System.out.println(department);

		System.out.println("\n=== TEST 2: seller findByAll =====");
		List<Department> departamento = departmentDao.findAll();
		for (Department obj : departamento) {
			System.out.println(obj);
		}

		System.out.println("\n===== TEST 3: seller insert ====");
		System.out.println("Digite um nome para inserir no banco: ");
		String nome = sc.next();
		Department newDepart = new Department(1, nome);
		departmentDao.insert(newDepart);
		System.out.println("Inserted! New Id = " + newDepart.getId());
	}
}
