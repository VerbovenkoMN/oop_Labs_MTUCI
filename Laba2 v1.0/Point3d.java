/** 
	* трёхмерный класс точки. 
**/ 
public class Point3d extends Point2d { 
	
	/**  Coordinate Z **/ 
	private double zVal; 
	/** Constructor**/ 
	public Point3d ( double x,  double y, double z) { 
		super(x, y);
		zVal = z; 
	} 
	/** Constructor default. **/ 
	public Point3d () { 
		//Вызовите конструктор с двумя параметрами и определите источник. 
		this(0, 0, 0); 
	} 
	
	/** Retunr coordinate Z **/ 
	public double getZ () { 
		return zVal; 
	} 
	
	/**  Set value to coordinate Z. **/ 
	public void  setZ ( double val) { 
		zVal = val; 
	} 
	
	/**  Вычисление расстояния до другой точки **/ 
	public boolean  isEqual ( Point3d otherPoint) { 
		boolean compat;
		if (this.getX()==otherPoint.getX() && this.getY()==otherPoint.getY() && this.getZ()==otherPoint.getZ())
		compat=true;
		else compat=false;
		
		return compat; 
	}
	
	/**  Вычисление расстояния до другой точки **/ 
	public double  distanceTo ( Point3d otherPoint) { 
		
		double distance = Math.sqrt(Math.pow((this.getX() - otherPoint.getX()), 2) + Math.pow((this.getY() - otherPoint.getY()), 2) + Math.pow((this.getZ() - otherPoint.getZ()), 2));
		
		return distance; 
	} 
	
}