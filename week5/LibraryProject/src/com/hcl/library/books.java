<<<<<<< HEAD
package com.hcl.library;

public class books {

	private int id;
	private String name;
	private String author;
	private String edition;
	private String dept;
	private int totalbooks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTotalbooks() {
		return totalbooks;
	}
	public void setTotalbooks(int totalbooks) {
		this.totalbooks = totalbooks;
	}
	@Override
	public String toString() {
		return "books [id=" + id + ", name=" + name + ", author=" + author + ", edition=" + edition + ", dept=" + dept
				+ ", totalbooks=" + totalbooks + "]";
	}
	public books(int id, String name, String author, String edition, String dept, int totalbooks) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.edition = edition;
		this.dept = dept;
		this.totalbooks = totalbooks;
	}
	
	
	
}
=======
package com.hcl.library;

public class books {

	private int id;
	private String name;
	private String author;
	private String edition;
	private String dept;
	private int totalbooks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTotalbooks() {
		return totalbooks;
	}
	public void setTotalbooks(int totalbooks) {
		this.totalbooks = totalbooks;
	}
	@Override
	public String toString() {
		return "books [id=" + id + ", name=" + name + ", author=" + author + ", edition=" + edition + ", dept=" + dept
				+ ", totalbooks=" + totalbooks + "]";
	}
	public books(int id, String name, String author, String edition, String dept, int totalbooks) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.edition = edition;
		this.dept = dept;
		this.totalbooks = totalbooks;
	}
	
	
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
