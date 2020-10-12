# java-
java课程作业项目仓库

# 阅读程序
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
		
## 实验目的
用类描述计算机中CPU的速度和硬盘容量。

## 实验过程

1.首先进行框架设计，在Test主类下有CPU、HardDisk、PC三个分类，主类从分类调取参数并设计和调用显示函数show ()从而达到显示CPU速度以及硬盘容量的目的
2.创建项目
3.创建CPU 1类
4.创建HardDisk. 
5.创建PC类

## 核心方法

1.用Eclipse进行源代码的编译和调试，最后运行出结果
2.用Gitnub来写报告并提交上传

## 实验结果

CPU速度3000
硬盘容量500

## 实验感想
学习java后第一次编写程序，学习并利用了老师所讲的知识，反馈于实验程序。


