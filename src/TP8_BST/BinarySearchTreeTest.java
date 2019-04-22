package TP8_BST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

class BinarySearchTreeTest {

	private final static ArrayList<LightBulb> lighbulbs = new ArrayList<>();
	private final static LightBulb tester = new LightBulb("12345", 50, "flourecent");

	static {
		lighbulbs.add(tester);
		lighbulbs.add(new LightBulb("67890", 100, "day"));
		lighbulbs.add(new LightBulb("34897", 120, "night"));
		lighbulbs.add(new LightBulb("38349", 15, "cheap"));
		lighbulbs.add(new LightBulb("10485", 200, "diego"));
		lighbulbs.add(new LightBulb("50304", 100, "hola"));
	}

	@Test
	public void insertionAndSearch() {
		final BinarySearchTree<LightBulb, LightBulbNode> lightBulbBinarySearchTree = new BinarySearchTree<>();

		for (LightBulb lightBulb : lighbulbs) {
			int stock = (int) (Math.random() * 10);
			lightBulbBinarySearchTree.insert(new LightBulbNode(lightBulb, stock));
		}

		assertEquals(tester, lightBulbBinarySearchTree.search(tester).element);
	}

}