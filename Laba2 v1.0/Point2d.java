/**  двумерный класс точки. **/ 
public class Point2d { 
	/** coordinate X **/ 
	private double xVal; 
	/**  coordinate Y **/ 
	private double yVal; 
	/** Constructor **/ 
	public Point2d ( double x,  double y) { 
		xVal = x; 
		yVal = y; 
	} 
	/** Constructor default. **/ 
	public Point2d () { 
		//Вызовите конструктор с двумя параметрами и определите источник. 
		this(0, 0); 
	} 
	/** Return coordinate X **/ 
	public double getX () { 
		return xVal; 
	} 
	/** Return coordinate Y **/ 
	public double getY () { 
		return yVal; 
	} 
	/** Set value to coordinate X. **/ 
	public void setX ( double val) { 
		xVal = val; 
	} 
	/**  Set value to coordinate Y. **/ 
	public void  setY ( double val) { 
		yVal = val; 
	} 
}