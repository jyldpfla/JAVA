package kr.co.greenart.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect // 프로그램 실행 중 메소드가 호출되기 전 후로 개입해서 만들어줄 수 있음
@Component
public class MyAspect {
	private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);
	// 포인트컷 : 어느 시점에 실행될지 설정(메소드 조인포인트 설정)
	// 포인트컷 작성 문법 : 접근제한자, 리턴타입, 패키지.클래스.메소드(파라미터) 순으로 작성
	@Pointcut("execution(* kr.co.greenart.model.file.FileDBRepository.getAllnames(..))") // 포인트컷 선언
	// execution : 실행 시에
	public void print() {} // 하나의 포인트컷으로 여러 애스팩트 사용하고 싶을 때 이름 부여해두면 사용해서 작성할 수 있음
	
	@Pointcut("within(@org.springframework.stereotype.Repository *)") // within 앞뒤로 @붙을 수 있는데, 차이 있음
	// within(@org.springframework.stereotype.Repository * : repository 타입 안의 모든 메소드특정 annotation에 대해 지정)
	// within : 특정 타입에 대해서 동작할 수 있도록 설정 가능
	public void repository() {}
	
	@Around("repository()") // 포인트컷 전후로 실행
	public Object loggingTime(ProceedingJoinPoint jp) throws Throwable { // 실제로 달라붙는 객체
		// around는 필수적으로 joinpoint를  파라미터로 받아와야함 -> joinpoint로 실제 흐름을 만들어내야하므로(proceed)
		long start = System.nanoTime();
		logger.info("시작 시간 : " + start); // 메소드 시작 시간 출력
		Object proceed = jp.proceed(); // proceed : 실제 실행되는 메소드, 여기 위에 쓰면 전,아래는 후
		long end = System.nanoTime();
		logger.info("종료 시간 : " + end); 
		
		logger.info(jp.getSignature() + "메소드의 실행시간 : " + (end - start)); // 실행까지 걸린 시간
		return proceed;
	}
	
	// 애스펙트 : 포인트컷 전후로 실행되는 메소드
	@Before("print()") // 포인트컷 선언 전에 실행되도록
	public void printBefore() {
		
	}
	
	@After("print()") // 포인트컷 선언 후에 실행되도록
	public void printAfter() {
		
	}
	
	// file db repository getAllNames 전후로 실행하는 포인트 컷 작성
//	// 실행 전
//	@Before("execution(* kr.co.greenart.model.file.FileDBRepository.getAllnames(..))")
//	// 접근제한자, 리턴타입, 패키지.클래스.메소드(파라미터) 순으로 작성
//	// * : 구분자 대신 *
//	// .. : 파라미터 전달을 받음(아무파라미터나 받을 때)
//	public void printBefore() {
//		logger.info("-- 파일 목록을 불러 오기 전에 실행됩니다. --");
//	}
//	
//	// 실행 후
//	@After("execution(* kr.co.greenart.model.file.FileDBRepository.getAllnames(..))")
//	public void printAfter() {
//		logger.info("-- 파일 목록을 불러온 후에 실행됩니다. --");
//	}
}
