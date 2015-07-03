public class Docente{
	private String nombre;
	private String apellido;
	private String facultad;
	private double horas;
	private int sueldoBase = 70;
	private double sueldoBruto = 0;
	private double descuento = 0;
	private double sueldoNeto = 0;

	public Docente(String nombre, String apellido, String facultad, double horas){
		this.nombre = nombre;
		this.apellido = apellido;
		this.facultad = facultad;
		this.horas = horas;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setFacultad(String facultad){
		this.facultad = facultad;
	}
	public void setHoras(double horas){
		this.horas = horas;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}

	public String getFacultad(){
		return this.facultad;
	}

	public double getHoras(){
		return this.horas;
	}

	public String getCompleto(){
		return String.format ("%s %s", this.nombre, this.apellido); 
	}

	public double sueldoBruto(){
		if(facultad == "ciencias"){
			return sueldoBruto = sueldoBase * 3;
		}
		else if(facultad == "letras"){
			return sueldoBruto = sueldoBase * 5;
		}
		else{
			System.out.println("no hay sueldo");
			return sueldoBruto;
		}
	}

	public double getDescuento(){
		return descuento = sueldoBruto * .10; 
	}

	public double getSueldoCompleto(){
		return sueldoNeto = sueldoBruto - descuento;
	}	

	public String getTodalaInfo(){
		return String.format("Nombre: %s \n"+
							 "Facultad: %s \n"+
							 "Horas %f \n" +
							 "Sueldo Base: %d \n" + 
							 "Sueldo Bruto: %f \n" +
							 "Descuento %f \n" +
							 "Sueldo Neto %f \n"
							 ,getCompleto(), 
							  getFacultad(),
							  getHoras(),
							  this.sueldoBase,
							  sueldoBruto(),
							  getDescuento(),
							  getSueldoCompleto());
	}
}

//System.out.println("Introduce el numero de horas")
//horas = sc.nextline()   								Leer variables 