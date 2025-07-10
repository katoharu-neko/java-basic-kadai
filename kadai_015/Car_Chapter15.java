package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear ,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void gearChange( int afterGear) {
		this.gear = afterGear;
		if( afterGear <= 0 || 6 <= afterGear ) {
			this.speed = 10;
		}
		int[] speedArray = { 10, 10, 20, 30, 40, 50};
		for(int i = 1 ; i < 6 ; i++) {
			if( i == afterGear ) {
				this.speed = speedArray[i];
			}
		}
	}
	public void run(){
		System.out.println("ギア1から"+ this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	
	}

}
