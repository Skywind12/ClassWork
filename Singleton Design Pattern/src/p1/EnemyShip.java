package p1;

public abstract class EnemyShip {
	private String name;
	private double speed;
	private double directX;
	private double directY;
	private double amtDamage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDirectX() {
		return directX;
	}
	public void setDirectX(double directX) {
		this.directX = directX;
	}
	public double getDirectY() {
		return directY;
	}
	public void setDirectY(double directY) {
		this.directY = directY;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	
}
