package chap19_multithread;

public class _13_multiThreadEx {

	public static void main(String[] args) {
		// 3개의 스레드를 생성하여 각각의 스레드에서 조건문을 실행하고 결과를 출력하는 코드

		// 첫 번째 스레드
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 0) {
						System.out.println(i);
					}
				}
			}
		};

		// 두 번째 스레드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 1) {
						System.out.println(i);
					}
				}
			}
		};

		// 세 번째 스레드
		Thread t3 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					if(i % 3 == 2) {
						System.out.println(i);
					}
				}
			}
		};

		// 첫 번째 스레드 실행
		t1.start();
		try {
			// 첫 번째 스레드가 작업 종료하기 전까지 메인 스레드가 일시정지 상태
			t1.join();

			// 두 번째 스레드 실행
			t2.start();
			t2.join();

			// 세 번째 스레드 실행
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
