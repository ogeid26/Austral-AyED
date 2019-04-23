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
	public String toString() {
		return "LightBulb{" +
				"code='" + code + '\'' +
				", watts=" + watts +
				", type='" + type + '\'' +
				'}';
	}

	@Override
	public int compareTo(final LightBulb o) {
		return code.compareTo(o.getCode());
	}
}
