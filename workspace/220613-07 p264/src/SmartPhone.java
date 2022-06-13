public class SmartPhone extends Phone {
	private String operatingSys;
	private int operatingVer;
	private int memory;
	private boolean camera;
	private boolean bluetooth;
	
	public SmartPhone(String company, int price, int type, String operatingSys, int operatingVer, int memory,
			boolean camera, boolean bluetooth) {
		super(company, price, type);
		this.operatingSys = operatingSys;
		this.operatingVer = operatingVer;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getOperatingSys() {
		return operatingSys;
	}

	public void setOperatingSys(String operatingSys) {
		this.operatingSys = operatingSys;
	}

	public int getOpreatingVer() {
		return operatingVer;
	}

	public void setOpreatingVer(int operatingVer) {
		this.operatingVer = operatingVer;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	public String toString() {
		return super.toString() + ", 운영체제 타입: " + operatingSys + ", 운영체제 버전: " + operatingVer + ", 내부메모리 크기: " + memory + "GB, 카메라 장착 여부: " + camera + ", 블루투스 지원 여부: " + bluetooth;
	}
	
	
}
