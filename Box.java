public class Box{
	double height;
	double length;
	double width;
	Box(double length,double width,double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	void setvalue(double l,double w,double h){
		height=h;
		length=l;
		width=w;
	}
	double volume(){
		return height*length*width;
	}
}