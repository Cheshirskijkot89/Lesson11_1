package chizhenko;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("Дарт", "Вейдер", "Звездосмертович", Gender.MALE, 100);
		Student st2 = new Student("Люк", "Скайвокер", "Гонщикович", Gender.MALE, 15);
		Student st3 = new Student("Лея", "Органа", "Принцессовна", Gender.FEMALE, 20);
		Student st4 = new Student("Робот", "Р2Д2", "Роботович", Gender.ROBOT, 500);
		Student st5 = new Student("Робот", "Ситрипио", "Роботович", Gender.ROBOT, 600);
		Student st6 = new Student("Волосатый", "Чубака", "Чубакович", Gender.MALE, 20);
		Student st7 = new Student("Хан", "Соло", "Неизвестнович", Gender.MALE, 20);
		Student st8 = new Student("Зеленый", "Йода", "Неизвестнович", Gender.MALE, 20);
		Student st9 = new Student("Оби", "Ван", "Кеноби", Gender.MALE, 20);
		Student st10 = new Student("Джабба", "Хат", "Неизвестнович", Gender.MALE, 20);
		Student st11 = new Student("Робот", "ББ8", "Роботович", Gender.ROBOT, 20);
		
		Group myGroup = new Group();
		
		try {
			myGroup.addSt(st1);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st2);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st3);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st4);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st5);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st6);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st7);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st8);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st9);
		} catch (MyException e) {
			System.out.println("Error");
		}
		try {
			myGroup.addSt(st10);
		} catch (MyException e) {
			System.out.println("Error");
		}
		
		try {
			myGroup.addSt(st11);
		} catch (MyException e) {
			System.out.println("Перехвачено исключение" + e);
		}
		
		myGroup.ViewSortGroup();
		

	}

}

enum Gender {
	MALE, FEMALE, ROBOT
}