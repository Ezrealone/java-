package pack;

 public class Text {
	public static void main(String args[]){
		
		CPU cpu =new CPU();
		
		cpu.setSpeed(3000);
		
		HardDisk disk=new HardDisk();
		
		disk.setAmount(500);
		
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
pc.show();
		
	}

}
 
 class CPU {
		int speed;
		int getSpeed(){
			return speed;
		}
		public void setSpeed(int speed){
			this.speed=speed;
		}

	}
 
class HardDisk {
		int amount;
		int getAmount(){
			return amount;
		}
		public void setAmount(int amount){
			this.amount=amount;
		}

	}
 
 class PC {
		CPU cpu;
		HardDisk disk;
		void setCPU(CPU cpu){
			this.cpu=cpu;
		}
		void setHardDisk(HardDisk disk){
			this.disk=disk;	
		}
		void show(){
			System.out.println("CPUÀŸ∂»"+cpu.getSpeed());
			System.out.println("”≤≈Ã»›¡ø"+disk.getAmount());
		}

	}
		

