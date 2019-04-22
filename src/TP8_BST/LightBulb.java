package TP8_BST;

public class LightBulb implements Comparable<LightBulb> {

	private final String code;
	private final Integer watts;
	private final String type;

	public LightBulb(final String code, final int watts, final String type) {
		this.code = code;
		this.watts = watts;
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public Integer getWatts() {
		return watts;
	}

	public String getType() {
		return type;
	}

	@Override
	public int compareTo(final LightBulb o) {
		int comparisonSum = code.compareTo(o.getCode()) + watts.compareTo(o.getWatts()) + type.compareTo(o.getType());
		System.out.println(comparisonSum);
		return comparisonSum;
	}
}
