import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.w3c.dom.NamedNodeMap;

class Student implements Serializable {
	private String name;
	private int age;
	private transient double score;

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		// 학생
		// 이름: 문자열
		// 나이: 정수
		// 학점: 실수

		BufferedReader br = null;
		List<Student> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\students.txt")));

			while (true) { // 파일 끝 나오면 null exception 나오므로 범위 설정 필요
				String name = br.readLine();
				int age = Integer.valueOf(br.readLine()); // age는 정수형 타입 => 형변환
				double score = Double.valueOf(br.readLine()); // age는 실수형 타입 => 형변환

				Student s = new Student(name, age, score);
				System.out.println(s);
				list.add(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(list);

////////////////////////// 자료 출력하기잉
//		List<Student> list = new ArrayList<>(Arrays.asList(new Student("홍길동", 22, 2.5)
//															, new Student("둘리", 33, 3.3)
//															, new Student("도우너", 44, 4.4)));
//		// 데이터 서식은 하나로 통합되어 있어야 데이터 관리가 편리
//		// 학생을 하나의 문자열로 -> 문자 단위로 읽기 편하도록 한 줄씩
//		
//		PrintWriter pw = null;
//		
//		try {
//			pw = new PrintWriter(new File("d:\\filetest\\students.txt"));
//			
//			for (int i = 0; i < list.size(); i++) {
//			Student s = list.get(i);
//
//			pw.println(s.getName());
//			pw.println(s.getAge());
//			pw.println(s.getScore());
//			}
//			pw.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//		}
	}
}
