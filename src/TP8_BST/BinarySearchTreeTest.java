package TP8_BST;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTreeTest {

	private final static ArrayList<LightBulb> lightbulbs = new ArrayList<>();
	private final static BinarySearchTree<LightBulb, LightBulbNode> lightBulbBinarySearchTree = new BinarySearchTree<>();
	private final static LightBulb tester = new LightBulb("12345", 50, "flourecent");

	static {
		lightbulbs.add(tester);
		lightbulbs.add(new LightBulb("67890", 100, "day"));
		lightbulbs.add(new LightBulb("34897", 120, "night"));
		lightbulbs.add(new LightBulb("38349", 15, "cheap"));
		lightbulbs.add(new LightBulb("70485", 200, "diego"));
		lightbulbs.add(new LightBulb("50304", 100, "hola"));

		for (LightBulb lightBulb : lightbulbs) {
			int stock = (int) ((Math.random() * 10) + 5);
			lightBulbBinarySearchTree.insert(new LightBulbNode(lightBulb, stock));
		}
	}

	@Test
	public void insertionAndSearch() {
		assertEquals(tester, lightBulbBinarySearchTree.search(tester).element);
	}

	@Test
	public void reporte() {
		lightBulbBinarySearchTree.print();
	}

	@Test
	public void insertAndPrint() {
		final LightBulb another = new LightBulb("00001", 110, "mail");
		lightBulbBinarySearchTree.insert(new LightBulbNode(another, 50));
		lightBulbBinarySearchTree.print();
		assertEquals(another, lightBulbBinarySearchTree.search(another).element);
	}

}