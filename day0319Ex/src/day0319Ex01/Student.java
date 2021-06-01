package day0319Ex01;

public class Student {
		private String name;
		private int age;
		private int kor;
		private int eng;
		private int mat;
		
		public Student(String name,int age, int kor, int eng,int mat) {
			this.name=name;
			this.age=age;
			this.kor=kor;
			this.eng=eng;
			this.mat=mat;
		}
		

		public String getName() {
			String str= "\""+name+"\"";
			return str;
		}


		public int getAge() {
			return age;
		}


		public int getKor() {
			return kor;
		}


		public int getEng() {
			return eng;
		}


		public int getMat() {
			return mat;
		}


		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public void setMat(int mat) {
			this.mat = mat;
		}

		@Override
		public String toString() {
			return "Student [name :" + name + ", age :" + age + ", kor :" + kor + ", eng :" + eng + ", mat :" + mat + "]";
		}
		
		
		
		
		
		
		
}
