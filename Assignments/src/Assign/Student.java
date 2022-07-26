package Assign;



public class Student {
		
		String name;
		int age;
	    char Section;
		 char gender;
		int sub1,sub2,sub3;
		float t,p;
		
		public Student(String na,int i,char c,char g, int s1,int s2,int s3){
			name=na;
			age=i;
			Section=c;
			gender=g;
			sub1=s1;
			sub2=s2;
			sub3=s3;
		}
		public Student(String na,int i,char c,char g,int s2,int s3){
			name=na;
		    age=i;
			Section=c;
			gender=g;
			sub2=s2;
			sub3=s3;
		}
		
		
		void display(){
			 t=(sub1+sub2+sub3);
			 p=t/3;
			 System.out.println("name"+name+"age"+age+ "Section"+Section+"gender"+gender+"total"+t+"percentage"+p);
		}
		public static void main(String[] args){
			
			Student s1=new Student("Ajey",21,'A','M',98,97,96);
			Student s2=new Student("Ajey",21,'A','M',98,97,96);
			Student s3=new Student("Murali",21,'C','M',19,96);
			
			
			
			s1.display();
			s2.display();
			
			s3.display();
			
			
			 
		
		
			
			
		}

			
		
		
		

}
