<<<<<<< HEAD
package com.hcl.Boxing;

public class BoxStudent {

	public void show(Object ob) {
		Student st = (Student) ob ;
		System.out.println(st);
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.sno = 4856;
		st.name = "Adi";
		st.city = "Aligarh";
		st.cgp = 9.8;

		new BoxStudent().show(st);
	}

}
=======
package com.hcl.Boxing;

public class BoxStudent {

	public void show(Object ob) {
		Student st = (Student) ob ;
		System.out.println(st);
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.sno = 4856;
		st.name = "Adi";
		st.city = "Aligarh";
		st.cgp = 9.8;

		new BoxStudent().show(st);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
