package Assign;

public class innerclass {
	class Type1{
		class inner{
			void display(){
				System.out.println("Inside method of member inner class");
			}
		}
	}

	class Type2{
		void display(){
			System.out.println("\nInstantiating the Local(method)  inner class");
			class inner{
				void disp(){
					System.out.println("Inside method of Local(method) inner class ");
				}
			}
			inner i = new inner();
			i.disp();
		}
	}

	abstract class Type3{
		abstract void display();
	}

	public class inner_class_types {

		public void main(String args[]){
			
			//Member inner class
			Type1 m1 = new Type1();
			Type1.inner i = m1.new inner();
			i.display();
			
			//Method inner class
			Type2 m2 = new Type2();
			m2.display();
			
			// Anonymous inner class
			// We are not instantiating abstract class
			// rather creating anonymous inner class
			// name will be allocated during compiling
			Type3 m3 = new Type3(){
				void display(){
					System.out.println("\nInside method of Anonymous inner class");
				}
			};
			m3.display();
		}
	}

}


	