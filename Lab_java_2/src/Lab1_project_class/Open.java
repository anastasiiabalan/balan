package Lab1_project_class;

class Open {
	 private int a;
	 private int b;
	 
	 Open() {
		 
	 }
	 
	 Open(int a, int b){
		 this.a=a;
		 this.b=b;
	 }
	 
	 public void setA(int a){
		 this.a=a;
	 }
	 public void setB(int b){
		 this.b=b;
	 }
	 
	 public int getA(int a){
		 return a;
	 }
	 public int getB(int b){
		 return b;
	 }
	 
	 public int Sum() {
		 return this.a+this.b;
	 }
	 public int Dif() {
		 if(this.a>this.b) {
			 return this.a-this.b;
		 }else {
			 return this.b-this.a;

		 }
		 
	 }
	 
	 
	 

	 

}
