package day0310.ex01;

public class CarTest2 {
public static void main(String[] args) {
	// 배열과, 객체를 이용하여 연관성을 만들어주자
	// 배열 : 같은 자료형의 모임
	// 구조체(객체): 다른 자료형의 모임
	
	Car car1 = new Car();
	car1.color = "검정";
	car1.mileage= 1000;
	
	Car car2 = new Car();
	car2.color = "노랑";
	car2.mileage= 500;
	
	Car car3 = new Car();
	car3.color = "파랑";
	car3.mileage = 10000;
	
	
	if(car1.color.equals("노랑")) {
		car1.mileage +=10;
	}
	if(car2.color.equals("노랑")) {
		car2.mileage +=10;
	}
	if(car3.color.equals("노랑")) {
		car3.mileage +=10;
	}
	
	
	// 위 내용은 비교를 3번 각각 하는데, 이걸 반복으로 쓰면 더 편할 것 같은데? 라고 생각하게 된다
	// 반복문을 쓰려고 했더니 변수명이 다 달라서 사용하기 어렵다.
	// 배열로 묶어야 한다.
	// 아래는 car라는 애들을 담을 수 있는 방 3개를 만든것이다.
	Car[] carArr = new Car[3];
	
	carArr[0] = car1;
	carArr[1] = car2;
	carArr[2] = car3;
	
	for(int i =0 ; i < carArr.length; i++) {
		if(carArr[i].color.equals("노랑")) {
			carArr[i].mileage +=10;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}