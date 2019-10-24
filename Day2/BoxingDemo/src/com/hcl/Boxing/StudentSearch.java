<<<<<<< HEAD
package com.hcl.Boxing;

public class StudentSearch {
	
	public Student showStudent(int sno){
		Student st = null;
		if(sno == 1){
			st = new Student();
			st.sno = 114;
			st.cgp = 8.9;
			st.city = "Agra";
			st.name = "Manoj";
		}
		if(sno == 3){
			st = new Student();
			st.sno = 301;
			st.cgp = 7.9;
			st.city = "Karatak";
			st.name = "Mani";
		}
		return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSearch obj = new StudentSearch();
		Student stu = obj.showStudent(1);
		if(stu!=null){
			System.out.println(stu);
		}else{
				System.out.println("student not found");
			}
		}

	}


=======
package com.hcl.Boxing;

public class StudentSearch {
	
	public Student showStudent(int sno){
		Student st = null;
		if(sno == 1){
			st = new Student();
			st.sno = 114;
			st.cgp = 8.9;
			st.city = "Agra";
			st.name = "Manoj";
		}
		if(sno == 3){
			st = new Student();
			st.sno = 301;
			st.cgp = 7.9;
			st.city = "Karatak";
			st.name = "Mani";
		}
		return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSearch obj = new StudentSearch();
		Student stu = obj.showStudent(1);
		if(stu!=null){
			System.out.println(stu);
		}else{
				System.out.println("student not found");
			}
		}

	}


>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
