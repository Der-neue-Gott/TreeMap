import java.util.TreeMap;
import java.util.Comparator;

public class Main {
	public static void main (String[] args) {

		TreeMap<Integer, Zoo> zooAnimals = new TreeMap<>(Comparator.reverseOrder());
			zooAnimals.put(1, new Zoo("Кенгуру", 6));
			zooAnimals.put(2, new Zoo("Медведь", 3));
			zooAnimals.put(3, new Zoo("Пингвин", 17));
			zooAnimals.put(4, new Zoo("Лев", 2));
			zooAnimals.put(5, new Zoo("Обезьяна", 15));
		zooAnimals.forEach((k, v) -> System.out.println("В вольере под номером " + k + " находится " + v));

	}
}