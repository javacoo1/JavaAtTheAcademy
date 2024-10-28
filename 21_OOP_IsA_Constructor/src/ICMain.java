
public class ICMain {
	public static void main(String[] args) 	{
		// - 인스턴스 생성시 값 넣어서 생성(전부)
		// - 모든 필드는 직접 접근 X
		// - 값 수정 안되게, 따로 값 얻을 필요도 없음
		
		//스포츠카              ex) "람보르기니", "123가4567"
			//모델명, 차량번호 -> 정보출력
		SpCar spc = new SpCar("포츠핑", "111가1111");
		spc.info();
		//택시				  ex) "소나타", oo나1234
			//모델명, 차량번호, 기본료 -> 정보출력
		Taxi tx = new Taxi("택시핑", "222나2222", 5000);
		tx.info();
		//버스  				  ex) "파란버스", 33다1111
			//모델명, 차량번호, 노선번호 -> 정보출력
		Bus bus = new Bus("버스핑", "333다3333", 13);
		bus.info();
		
	}
}
