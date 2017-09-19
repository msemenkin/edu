import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		step8();
	}

	//перебираем делители до sqrt(range)
	private static void step8() {
		long startTime = System.currentTimeMillis();
		int range = 1000000;
		List<Integer> primeNumbers = new ArrayList<>(10000); 
		for (int i = 3; i < range; i++) {
			if ((i > 10) & ((i % 5 == 0) | (i % 2 == 0))) {
					continue;
			}
			boolean isPrime = true;
			for (int j : primeNumbers) {
				if (j > Math.sqrt(i)) {
					break;
				}
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9591
//		Time spent = 55
	}

	//Подключаем ArrayList
	private static void step7() {
		long startTime = System.currentTimeMillis();
		int range = 100000;
		List<Integer> primeNumbers = new ArrayList<>(10000); 
		for (int i = 3; i < range; i +=2 ) {
			if ((i > 10) & ((i % 5 == 0) | (i % 2 == 0))) {
					continue;
			}
			boolean isPrime = true;
			for (int j : primeNumbers) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9591
//		Time spent = 473
	}

	//улучшаем алгоритм: инкремент = 2
	private static void step6() {
		long startTime = System.currentTimeMillis();
		int range = 100000;
		List<Integer> primeNumbers = new LinkedList<>(); 
		for (int i = 3; i < range; i += 2) {
			if ((i > 10) & (i % 5 == 0)) {
				continue;
			}
			boolean isPrime = true;
			for (int j : primeNumbers) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9591
//		Time spent = 659
	}

	//Ищем делимые, которые очевидно не являются простыми
	private static void step5() {
		long startTime = System.currentTimeMillis();
		int range = 100000;
		List<Integer> primeNumbers = new LinkedList<>(); 
		for (int i = 2; i < range; i++) {
			if (i > 10) {
				if ((i % 2 == 0) | (i % 5 == 0)) {
					continue;
				}
			}
			boolean isPrime = true;
			for (int j : primeNumbers) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9592
//		Time spent = 570
	}

	//делитель простое число?
	private static void step4() {
		long startTime = System.currentTimeMillis();
		int range = 100000;
		List<Integer> primeNumbers = new LinkedList<>(); 
		for (int i = 2; i < range; i++) {
			boolean isPrime = true;
			for (int j : primeNumbers) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9592
//		Time spent = 963
	}

	//Сколько нужно искать делителей?
	private static void step3() {
		long startTime = System.currentTimeMillis();
		int range = 100000;
		List<Integer> primeNumbers = new LinkedList<>(); 
		for (int i = 2; i < range; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) { 
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9592
//		Time spent = 2283
	}

	//Ищем простые числе в диапазоне
	private static void step2() {
		long startTime = System.currentTimeMillis();
		int range = 100000;
		List<Integer> primeNumbers = new LinkedList<>(); 
		for (int i = 1; i < range; i++) {
			int dividersQuantity = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					dividersQuantity++;
				}
			}
			if (dividersQuantity <= 2) {
				primeNumbers.add(i);
			}
		}
		System.out.println("primeNumbers = " + primeNumbers);
		System.out.println("primeNumbers.size = " + primeNumbers.size());
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
//		primeNumbers.size = 9593
//		Time spent = 24861
	}

	//Является ли число простым
	private static void step1() {
		long startTime = System.currentTimeMillis();
		int dividersQuantity = 0;
		int inputNumber = 100003;
		for (int i = 1; i <= inputNumber; i++) {
			if (inputNumber % i == 0) {
				dividersQuantity++;
			}
		}
		System.out.println("dividersQuantity = " + dividersQuantity);
		System.out.println("Time spent = " + (System.currentTimeMillis() - startTime));
	}

}
