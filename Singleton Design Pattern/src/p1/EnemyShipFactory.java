package p1;

public class EnemyShipFactory {
	public EnemyShip makeEnemyShip(String newShipType) {
		if (newShipType.contentEquals("U")) {
			return new UFOEnemyShip();
		} else if (newShipType.contentEquals("R")) {
			return new RocketEnemyShip();
		} else if (newShipType.contentEquals("H")) {
			return new HugeUFOEnemyShip();
		} else {
			return null;
		}

	}
}
