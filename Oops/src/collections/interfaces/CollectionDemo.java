package collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> bikesCollection = new ArrayList<>();
		bikesCollection.add("Pulser");
		bikesCollection.add("Apache");
		bikesCollection.add("Activa");
		bikesCollection.add("Vespa");
		System.out.println(bikesCollection);
// removing element
		bikesCollection.remove("Activa");
		System.out.println(bikesCollection);
// checking element present or not
		System.out.println(bikesCollection.contains("Apache"));
// clearing collection
		bikesCollection.clear();
		System.out.println("The collection is empty " + bikesCollection);
	}
}
