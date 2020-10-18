# java-
java课程作业项目仓库

# 阅读程序
```
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
			System.out.println("CPU速度"+cpu.getSpeed());
			System.out.println("硬盘容量"+disk.getAmount());
		}

	}
```		
## 实验目的
用类描述计算机中CPU的速度和硬盘容量。

## 实验过程

1.首先创建Test主类。 
  
2.创建CPU类,getSpeed()返回speed的值，setSpeed将参数m的值赋值给speed。 
  
3.创建HardDisk类，getAmount（）返回amount的值。 
  
4.创建PC类，setCPU将参数c的值赋值给CPU。调用setCPU，setHardDisk，show（）方法。 

## 核心方法

1.进行源代码的编译和调试，创建4个类，分别为PC,CPU,HardDisk,Test. 
  
2.按照题目要求进行编写，最后提交。

## 实验结果

CPU速度3000

硬盘容量500

## 实验感想
学习java后第一次编写程序，学习并利用了老师所讲的知识，反馈于实验程序。这次实验，我更多学到的是不懂就问的精神，自己应该尽自己的全力是尝试，去调试，哪怕失败，只要自己尽自己的全力，就是成功，发挥团队意识。


