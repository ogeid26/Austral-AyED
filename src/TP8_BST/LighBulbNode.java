package TP8_BST;

public class LighBulbNode extends Node<LightBulb> {

	private int stock;

	public LighBulbNode(final LightBulb element, int stock) {
		super(element);
		this.stock = stock;
	}

	public LighBulbNode(final LightBulb element, final Node<LightBulb> leftChild, final Node<LightBulb> rightChild, final int stock) {
		super(element, leftChild, rightChild);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(final int stock) {
		this.stock = stock;
	}
}
