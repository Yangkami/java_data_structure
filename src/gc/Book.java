package gc;

class Book{
	boolean checkedOut =false;
	Book(boolean checkOut) {
		checkedOut=checkOut;
	}
	void checkIn(){
		checkedOut=false;
	}
	protected void finalize() {
		if(checkedOut)
			System.out.println("error:check out");
	}
	
}