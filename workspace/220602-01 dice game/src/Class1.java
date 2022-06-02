public class Class1 {
		private Students student1;
		private Students student2;
		private Students student3;

		public Class1(Students student1, Students student2, Students student3) {
			this.student1 = student1;
			this.student2 = student2;
			this.student3 = student3;
		}

		public Students getStudent1() {
			return student1;
		}

		public void setStudent1(Students student1) {
			this.student1 = student1;
		}

		public Students getStudent2() {
			return student2;
		}

		public void setStudent2(Students student2) {
			this.student2 = student2;
		}

		public Students getStudent3() {
			return student3;
		}

		public void setStudent3(Students student3) {
			this.student3 = student3;
		}

		public void getAllName() {
			System.out.println(student1.getName());
			System.out.println(student2.getName());
			System.out.println(student3.getName());
		}

		public int getAllScore() {
			return (student1.getAvg() + student2.getAvg() + student3.getAvg()) / 3;
		}

		public void getAllAvg() {
			int a = student1.getAvg();
			int b = student2.getAvg();
			int c = student3.getAvg();
//			if() {
//				System.out.printf("%s, %d\n%s, %d\n%s, %d", student1.getName(), student1.getAvg(), student2.getName(),
//						student2.getAvg(), student3.getName(), student3.getAvg());
//			} 
			/* if (student1.getAvg() == student2.getAvg() && student1.getAvg() == student3.getAvg()) {
				System.out.printf("%s, %d\n%s, %d\n%s, %d", student1.getName(), student1.getAvg(), student2.getName(),
						student2.getAvg(), student3.getName(), student3.getAvg());
			} else if (student1.getAvg() > student2.getAvg() && student1.getAvg() > student3.getAvg()) {
			 	System.out.printf("%s, %d", student1.getName(), student1.getAvg());
			} else if (student2.getAvg() > student3.getAvg()) {
				System.out.printf("%s, %d", student2.getName(), student2.getAvg());
			} else {
				System.out.printf("%s, %d", student3.getName(), student3.getAvg());
			} */
			if(a >= max(b, c)) {
				System.out.println(student1.getName() + student1.getAvg());
			} else if (b >= max(a, c)) {
				System.out.println(student2.getName() + student2.getAvg());
			} else if (c >= max(a, b)){
				System.out.println(student3.getName() + student3.getAvg());
			}
			
		}
		
		public int max(int left, int right) {
			return left > right ? left : right;
		}
		
		// 학생 이름이랑 성적 출력 class 만들기, if문에서 짧게 줄여 쓸라고오!!!
		// public void nameScore(String na, int Sc) {
		// 	System.out.println(studen);
		// }
	}



