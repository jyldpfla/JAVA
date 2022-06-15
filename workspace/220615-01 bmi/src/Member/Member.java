// 학생분꺼
package Member;

public class Member {
	   private String name;      // 이름
	   private double height;    // 키
	   private double weight;    // 몸무게
	   private double bmi;      //bmi 지수 
	   private String note;   //bmi 결과 
	   
	   
	   public Member(String name, double height, double weight)
	   {
	      this.name = name;
	      this.height = height;
	      this.weight = weight;
	      this.bmi = getBmi();    //getBmi메서드를 호출하여 return값을 인스턴스의 bmi값에 저장.
	      this.note = getNote();   //getNote메서드를 호출하여 return값을 인스턴스의 note값에 저장.
	   }
	   
	   public String getNote() { //BMI 지수에 따라 결과 값을 리턴.
	      if(35 <= this.bmi) return "고도비만(3단계 비만)";
	      else if(30 <= this.bmi) return "중도비만 (2단계 비만)";
	      else if(25 <= this.bmi) return "경도비만 (1단계 비만)";
	      else if(23 <= this.bmi) return "과체중";
	      else if(18.5 <= this.bmi && this.bmi < 23) return "정상";
	      else return "저체중";
	      
	   }
	   public double getBmi() { //BMI 공식 == ( 몸무게 / 키^2 )
	      return  Math.round((weight/((height) * (height))) * 100) / 100.0;  //Math.round()는 반올림 할 때 사용하는 메서드
	                                                         //int a = 22.2141 이라고 가정. ->  Math.round(a * 100)의 값은 2221.41의 소수 첫째 자리에서 반올림하여
	                                                         // 2221이 되는데 이 값을 또 100.0으로 나누면 22.21이 되므로 소수 둘 째자리까지 표현이 가능하다.
	                                                         // 100이 아닌 100.0으로 나눠주는 이유 반환형의 타입이 double;
	   }





	   
	   
	   //만약 신규 회원의 이름, 키, 몸무게가 어떤 회원의 이름, 키, 몸무게와 같다면 신규 회원 등록 불가
	   public boolean equals(Object obj) {
	      if(obj instanceof Member) {
	         Member temp = (Member) obj;
	         return name.equals(temp.name) && height == temp.height && weight == temp.weight;
	               
	      }else {
	         return false;
	      }
	   }
	   
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public double getHeight() {
	      return height;
	   }
	   public void setHeight(double height) {
	      this.height = height;
	   }
	   public double getWeight() {
	      return weight;
	   }
	   public void setWeight(double weight) {
	      this.weight = weight;
	   }
	   
	   

	   public String PrintAll() { //순서대로 이름 , 키 , 몸무게 , bmi지수, bmi 결과값을 리턴.
	      // TODO Auto-generated method stub
	      return this.name + "\t" + this.height + "\t" + this.weight + "\t\t" + this.bmi + "\t" + this.note;
	   }
	   
	   
	}
